package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantPost;
import cj.studio.backend.uc.bo.TenantPostExample;
import cj.studio.backend.uc.bo.UA;
import cj.studio.backend.uc.plugin.dao.TenantPostMapper;
import cj.studio.backend.uc.plugin.util.UCConstants;
import cj.studio.backend.uc.service.IAccountService;
import cj.studio.backend.uc.service.ITenantPostService;
import cj.studio.backend.uc.service.IUAService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

@CjBridge(aspects = "@transaction")
@CjService(name = "tenantPostService")
public class TenantPostService implements ITenantPostService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.TenantPostMapper")
	TenantPostMapper tenantPostMapper;
	@CjServiceRef
	IAccountService accountService;
	@CjServiceRef(refByName = "uaService")
	IUAService uaService;

	@CjTransaction
	@Override
	public void addPost(TenantPost post) {
		tenantPostMapper.insert(post);
	}

	@CjTransaction
	@Override
	public TenantPost getPost(String tenantCode, String postCode) {
		TenantPostExample example = new TenantPostExample();
		example.createCriteria().andTenantEqualTo(tenantCode).andCodeEqualTo(postCode);
		List<TenantPost> list = tenantPostMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public void removePost(String tenantCode, String postCode) {
		TenantPostExample example = new TenantPostExample();
		example.createCriteria().andTenantEqualTo(tenantCode).andCodeEqualTo(postCode);
		tenantPostMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public List<TenantPost> pagePost(String tenantCode, int currPage, int pageSize) {
		return tenantPostMapper.pagePost(tenantCode,currPage,pageSize);
	}

	@CjTransaction
	@Override
	public List<Account> getAccountsOnPost(String tenantCode, String postCode) {
		List<String> users = uaService.getUsersOnColCode(tenantCode, UCConstants.COLTYPE_Tenant_Post, postCode);
		if(users.isEmpty()) {
			users.add(".....");
		}
		return accountService.findAccountsWhereCodeList(users);
	}

	@CjTransaction
	@Override
	public List<Account> pageAccountsOnPost(String tenantCode, String postCode, int currPage, int pageSize) {
		List<String> users = uaService.pageUsersOnColCode(tenantCode, UCConstants.COLTYPE_Tenant_Post, postCode,
				currPage, pageSize);
		if(users.isEmpty())	{
			users.add("......");
		}
		return accountService.findAccountsWhereCodeList(users);
	}

	@CjTransaction
	@Override
	public void addAccountOnPost(String tenantCode, String accountCode, String postCode) {
		Account account = accountService.getAccount(tenantCode, accountCode);
		if (account == null) {
			throw new EcmException("账户不存在:" + accountCode);
		}
		UA ua = new UA();
		ua.setUsercode(account.getUsercode());
		ua.setColcode(postCode);
		ua.setColtype(UCConstants.COLTYPE_Tenant_Post);
		ua.setTenantcode(tenantCode);
		uaService.add(ua);
	}

	@CjTransaction
	@Override
	public void removeAccountOnPost(String tenantCode, String accountCode, String postCode) {
		Account account = accountService.getAccount(tenantCode, accountCode);
		if (account == null) {
			throw new EcmException("账户不存在:" + accountCode);
		}
		uaService.removeUserOnColCode(tenantCode, account.getUsercode(), UCConstants.COLTYPE_Tenant_Post, postCode);
	}

	@CjTransaction
	@Override
	public void emptyAccountsOnPost(String tenantCode, String postCode) {
		uaService.emptyUsersOnColCode(tenantCode, UCConstants.COLTYPE_Tenant_Post, postCode);
	}

}
