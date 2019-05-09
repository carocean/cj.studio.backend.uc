package cj.studio.backend.uc.plugin.service;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantRole;
import cj.studio.backend.uc.bo.TenantRoleExample;
import cj.studio.backend.uc.bo.UA;
import cj.studio.backend.uc.plugin.dao.TenantRoleMapper;
import cj.studio.backend.uc.plugin.util.UCConstants;
import cj.studio.backend.uc.service.IAccountService;
import cj.studio.backend.uc.service.ITenantRoleService;
import cj.studio.backend.uc.service.IUAService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

@CjBridge(aspects = "@transaction")
@CjService(name = "tenantRoleService")
public class TenantRoleService implements ITenantRoleService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.TenantRoleMapper")
	TenantRoleMapper tenantRoleMapper;
	@CjServiceRef
	IAccountService accountService;
	@CjServiceRef(refByName = "uaService")
	IUAService uaService;
	@CjTransaction
	@Override
	public void addRole(TenantRole role) {
		tenantRoleMapper.insertSelective(role);
	}
	@CjTransaction
	@Override
	public void removeRole(String tenantCode, String roleCode) {
		TenantRoleExample example = new TenantRoleExample();
		example.createCriteria().andTenantEqualTo(tenantCode).andCodeEqualTo(roleCode);
		tenantRoleMapper.deleteByExample(example);
	}
	@CjTransaction
	@Override
	public TenantRole getRole(String tenantCode, String roleCode) {
		TenantRoleExample example = new TenantRoleExample();
		example.createCriteria().andTenantEqualTo(tenantCode).andCodeEqualTo(roleCode);
		List<TenantRole> list = tenantRoleMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}
	@CjTransaction
	@Override
	public long getRoleCount(String tenantCode) {
		TenantRoleExample example = new TenantRoleExample();
		example.createCriteria().andTenantEqualTo(tenantCode);
		return tenantRoleMapper.countByExample(example);
	}
	@CjTransaction
	@Override
	public void emptyAccountsOnRole(String tenantCode, String roleCode) {
		uaService.emptyUsersOnColCode(tenantCode, UCConstants.COLTYPE_Tenant_Role, roleCode);
	}
	@CjTransaction
	@Override
	public void removeAccountOnRole(String tenantCode, String accountCode, String roleCode) {
		Account account = accountService.getAccount(tenantCode, accountCode);
		if (account == null) {
			throw new EcmException("账户不存在:" + accountCode);
		}
		uaService.removeUserOnColCode(tenantCode, account.getUsercode(), UCConstants.COLTYPE_Tenant_Role, roleCode);
	}
	@CjTransaction
	@Override
	public void addAccountOnRole(String tenantCode, String accountCode, String roleCode) {
		Account account = accountService.getAccount(tenantCode, accountCode);
		if (account == null) {
			throw new EcmException("账户不存在:" + accountCode);
		}
		UA ua = new UA();
		ua.setUsercode(account.getUsercode());
		ua.setColcode(roleCode);
		ua.setColtype(UCConstants.COLTYPE_Tenant_Role);
		ua.setTenantcode(tenantCode);
		uaService.add(ua);
	}
	@CjTransaction
	@Override
	public List<Account> getAccountsOnRole(String tenantCode, String roleCode) {
		List<String> users = uaService.getUsersOnColCode(tenantCode, UCConstants.COLTYPE_Tenant_Role, roleCode);
		List<String> where = new ArrayList<String>();
		for (String userCode : users) {
			where.add(String.format("'%s'", userCode));
		}
		return accountService.findAccountsWhereCodeList(where);
	}
	@CjTransaction
	@Override
	public List<TenantRole> page(String tenantCode, int currPage, int pageSize) {
		return this.tenantRoleMapper.page(tenantCode, currPage, pageSize);
	}

}
