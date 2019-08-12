package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantRole;
import cj.studio.backend.uc.service.ITenantRoleService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.ultimate.util.StringUtil;

import java.util.List;

@CjService(name = "/tenant/role.service")
public class TenantRoleStub  implements ITenantRoleStub {
	@CjServiceRef(refByName = "ucplugin.tenantRoleService")
	ITenantRoleService tenantRoleService;

	@Override
	public void addRole(String tenantCode, String roleCode, String roleName, String comment) throws CircuitException {
		if (StringUtil.isEmpty(tenantCode)) {
			throw new CircuitException("404", "缺少参数：tenantCode");
		}
		if (StringUtil.isEmpty(roleCode)) {
			throw new CircuitException("404", "缺少参数：roleCode");
		}
		if (getRole(tenantCode, roleCode) != null) {
			throw new CircuitException("500", "已存在角色：" + roleCode);
		}
		TenantRole role = new TenantRole();
		role.setCode(roleCode);
		role.setName(roleName);
		role.setComment(comment);
		role.setTenant(tenantCode);
		tenantRoleService.addRole(role);
	}

	@Override
	public void removeRole(String tenantCode, String roleCode) {
		tenantRoleService.removeRole(tenantCode,roleCode);
	}

	@Override
	public TenantRole getRole(String tenantCode, String roleCode) {
		return tenantRoleService.getRole(tenantCode,roleCode);
	}

	@Override
	public long getRoleCount(String tenantCode) {
		return tenantRoleService.getRoleCount(tenantCode);
	}

	@Override
	public List<TenantRole> page(String tenantCode, int currPage, int pageSize) {
		return tenantRoleService.page(tenantCode,currPage,pageSize);
	}

	@Override
	public List<Account> getAccountsOnRole(String tenantCode, String roleCode) {
		return tenantRoleService.getAccountsOnRole(tenantCode,roleCode);
	}

	@Override
	public void addAccountOnRole(String tenantCode, String accountCode, String roleCode) {
		tenantRoleService.addAccountOnRole(tenantCode,accountCode,roleCode);
	}

	@Override
	public void removeAccountOnRole(String tenantCode, String accountCode, String roleCode) {
		tenantRoleService.removeAccountOnRole(tenantCode,accountCode,roleCode);
	}

	@Override
	public void emptyAccountsOnRole(String tenantCode, String roleCode) {
		tenantRoleService.emptyAccountsOnRole(tenantCode,roleCode);
	}

}
