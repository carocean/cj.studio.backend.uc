package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantRole;
import cj.studio.ecm.net.CircuitException;
import cj.studio.gateway.stub.annotation.CjStubInContentKey;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/tenant/role.service", usage = "租户的角色存根")
public interface ITenantRoleStub {
	@CjStubMethod(usage = "添加角色")
	void addRole(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode,
			@CjStubInParameter(key = "roleName", usage = "角色名") String roleName,
			@CjStubInParameter(key = "comment", usage = "角色描述") String comment) throws CircuitException;

	@CjStubMethod(usage = "移除角色")
	void removeRole(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "获取角色")
	@CjStubReturn(type = TenantRole.class, usage = "返回角色")
	TenantRole getRole(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "角色数")
	long getRoleCount(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode);

	@CjStubMethod(command = "post", usage = "获取一页角色")
	@CjStubReturn(type = ArrayList.class, elementType = TenantRole.class, usage = "返回角色，Json格式")
	List<TenantRole> page(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInContentKey(key = "currPage", usage = "当前页码") int currPage,
			@CjStubInContentKey(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "获取一页角色")
	@CjStubReturn(type = ArrayList.class, elementType = Account.class, usage = "返回角色，Json格式")
	List<Account> getAccountsOnRole(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "添加账户到角色")
	void addAccountOnRole(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户代码") String accountCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "移除账户在角色")
	void removeAccountOnRole(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户代码") String accountCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "清空角色上的账户")
	void emptyAccountsOnRole(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

}
