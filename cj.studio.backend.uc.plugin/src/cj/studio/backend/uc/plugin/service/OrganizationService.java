package cj.studio.backend.uc.plugin.service;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.OrganizationExample;
import cj.studio.backend.uc.bo.UA;
import cj.studio.backend.uc.plugin.dao.OrganizationMapper;
import cj.studio.backend.uc.plugin.util.UCConstants;
import cj.studio.backend.uc.service.IAccountService;
import cj.studio.backend.uc.service.IOrganizationService;
import cj.studio.backend.uc.service.ISegmentService;
import cj.studio.backend.uc.service.IUAService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.util.StringUtil;

@CjBridge(aspects = "@transaction")
@CjService(name = "organizationService")
public class OrganizationService implements IOrganizationService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.OrganizationMapper")
	OrganizationMapper organizationMapper;
	@CjServiceRef(refByName = "segmentService")
	ISegmentService segmentService;

	@CjServiceRef
	IAccountService accountService;
	@CjServiceRef(refByName = "uaService")
	IUAService uaService;

	@CjTransaction
	@Override
	public void addOrganization(Organization org) {
		org.setId(null);
		if (StringUtil.isEmpty(org.getCode())) {
			throw new EcmException("机构编码为空");
		}
		organizationMapper.insertSelective(org);
	}

	@CjTransaction
	@Override
	public void removeOrganization(String tenantCode, String orgCode) {
		OrganizationExample example = new OrganizationExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andCodeEqualTo(orgCode);
		this.organizationMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public Organization getOrganization(String tenantCode, String orgCode) {
		OrganizationExample example = new OrganizationExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andCodeEqualTo(orgCode);
		List<Organization> list = organizationMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public long getOrganizationCount() {
		OrganizationExample example = new OrganizationExample();
		return organizationMapper.countByExample(example);
	}

	@CjTransaction
	@Override
	public List<Organization> getPage(int currPage, int pageSize) {
		return organizationMapper.getPage(currPage, pageSize);
	}

	@CjTransaction
	@Override
	public List<Organization> listChilds(String tenantCode, String pid) {
		OrganizationExample example = new OrganizationExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andPidEqualTo(pid);
		return organizationMapper.selectByExample(example);
	}

	@CjTransaction
	@Override
	public long childCount(String tenantCode, String pid) {
		OrganizationExample example = new OrganizationExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andPidEqualTo(pid);
		return organizationMapper.countByExample(example);
	}

	@CjTransaction
	@Override
	public List<Account> getAccountsOnOrg(String tenantCode, String orgCode) {
		List<String> users = uaService.getUsersOnColCode(tenantCode, UCConstants.COLTYPE_Tenant_Org, orgCode);
		return accountService.findAccountsWhereCodeList(users);
	}

	@CjTransaction
	@Override
	public List<Account> pageAccountsOnOrg(String tenantCode, String orgCode, int currPage, int pageSize) {
		List<String> users = uaService.pageUsersOnColCode(tenantCode, UCConstants.COLTYPE_Tenant_Org, orgCode, currPage,
				pageSize);
		if(users.isEmpty()) {
			users.add("......");
		}
		return accountService.findAccountsWhereCodeList(users);
	}

	@CjTransaction
	@Override
	public void addAccountOnOrg(String tenantCode, String accountCode, String orgCode) {
		Account account = accountService.getAccount(tenantCode, accountCode);
		if (account == null) {
			throw new EcmException("账户不存在:" + accountCode);
		}
		UA ua = new UA();
		ua.setUsercode(account.getUsercode());
		ua.setColcode(orgCode);
		ua.setColtype(UCConstants.COLTYPE_Tenant_Org);
		ua.setTenantcode(tenantCode);
		uaService.add(ua);
	}

	@CjTransaction
	@Override
	public void removeAccountOnOrg(String tenantCode, String accountCode, String orgCode) {
		Account account = accountService.getAccount(tenantCode, accountCode);
		if (account == null) {
			throw new EcmException("账户不存在:" + accountCode);
		}
		uaService.removeUserOnColCode(tenantCode, account.getUsercode(), UCConstants.COLTYPE_Tenant_Org, orgCode);
	}

	@CjTransaction
	@Override
	public void emptyAccountsOnOrg(String tenantCode, String orgCode) {
		uaService.emptyUsersOnColCode(tenantCode, UCConstants.COLTYPE_Tenant_Org, orgCode);
	}

}
