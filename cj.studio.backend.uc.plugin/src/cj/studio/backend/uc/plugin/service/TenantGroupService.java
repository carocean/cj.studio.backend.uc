package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantGroup;
import cj.studio.backend.uc.bo.TenantGroupExample;
import cj.studio.backend.uc.bo.UA;
import cj.studio.backend.uc.plugin.dao.TenantGroupMapper;
import cj.studio.backend.uc.plugin.util.UCConstants;
import cj.studio.backend.uc.service.IAccountService;
import cj.studio.backend.uc.service.ITenantGroupService;
import cj.studio.backend.uc.service.IUAService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

@CjBridge(aspects = "@transaction")
@CjService(name = "tenantGroupService")
public class TenantGroupService implements ITenantGroupService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.TenantGroupMapper")
	TenantGroupMapper tenantGroupMapper;
	@CjServiceRef
	IAccountService accountService;
	@CjServiceRef(refByName = "uaService")
	IUAService uaService;

	@CjTransaction
	@Override
	public void addGroup(TenantGroup group) {
		tenantGroupMapper.insert(group);
	}

	@CjTransaction
	@Override
	public TenantGroup getGroup(String tenantCode, String groupCode) {
		TenantGroupExample example = new TenantGroupExample();
		example.createCriteria().andTenantEqualTo(tenantCode).andCodeEqualTo(groupCode);
		List<TenantGroup> list = tenantGroupMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public void removeGroup(String tenantCode, String groupCode) {
		TenantGroupExample example = new TenantGroupExample();
		example.createCriteria().andTenantEqualTo(tenantCode).andCodeEqualTo(groupCode);
		this.tenantGroupMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public List<TenantGroup> pageGroup(String tenantCode, int currPage, int pageSize) {
		return tenantGroupMapper.pageGroup(tenantCode, currPage, pageSize);
	}

	@CjTransaction
	@Override
	public List<Account> getAccountsOnGroup(String tenantCode, String groupCode) {
		List<String> users = uaService.getUsersOnColCode(tenantCode, UCConstants.COLTYPE_Tenant_Group, groupCode);
		if(users.isEmpty()) {
			users.add("....");
		}
		return accountService.findAccountsWhereCodeList(users);
	}

	@CjTransaction
	@Override
	public List<Account> pageAccountsOnGroup(String tenantCode, String groupCode, int currPage, int pageSize) {
		List<String> users = uaService.pageUsersOnColCode(tenantCode, UCConstants.COLTYPE_Tenant_Group, groupCode,
				currPage, pageSize);
		if(users.isEmpty()) {
			users.add("....");
		}
		return accountService.findAccountsWhereCodeList(users);
	}

	@CjTransaction
	@Override
	public void addAccountOnGroup(String tenantCode, String accountCode, String groupCode) {
		Account account = accountService.getAccount(tenantCode, accountCode);
		if (account == null) {
			throw new EcmException("账户不存在:" + accountCode);
		}
		UA ua = new UA();
		ua.setUsercode(account.getUsercode());
		ua.setColcode(groupCode);
		ua.setColtype(UCConstants.COLTYPE_Tenant_Group);
		ua.setTenantcode(tenantCode);
		uaService.add(ua);
	}

	@CjTransaction
	@Override
	public void removeAccountOnGroup(String tenantCode, String accountCode, String groupCode) {
		Account account = accountService.getAccount(tenantCode, accountCode);
		if (account == null) {
			throw new EcmException("账户不存在:" + accountCode);
		}
		uaService.removeUserOnColCode(tenantCode, account.getUsercode(), UCConstants.COLTYPE_Tenant_Group, groupCode);
	}

	@CjTransaction
	@Override
	public void emptyAccountsOnGroup(String tenantCode, String groupCode) {
		uaService.emptyUsersOnColCode(tenantCode, UCConstants.COLTYPE_Tenant_Group, groupCode);
	}
}
