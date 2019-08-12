package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantRole;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.ArrayList;
import java.util.List;

@CjOpenports( usage = "租户的角色存根")
public interface ITenantRoleStub extends IOpenportService {
	@CjOpenport(usage = "添加角色")
	void addRole(@CjOpenportParameter(name ="tenantCode", usage = "租户编码") String tenantCode,
			@CjOpenportParameter(name ="roleCode", usage = "角色代码") String roleCode,
			@CjOpenportParameter(name ="roleName", usage = "角色名") String roleName,
			@CjOpenportParameter(name ="comment", usage = "角色描述") String comment) throws CircuitException;

	@CjOpenport(usage = "移除角色")
	void removeRole(@CjOpenportParameter(name ="tenantCode", usage = "租户编码") String tenantCode,
			@CjOpenportParameter(name ="roleCode", usage = "角色代码") String roleCode);

	@CjOpenport(type = TenantRole.class,usage = "获取角色")
	TenantRole getRole(@CjOpenportParameter(name ="tenantCode", usage = "租户编码") String tenantCode,
			@CjOpenportParameter(name ="roleCode", usage = "角色代码") String roleCode);

	@CjOpenport(usage = "角色数")
	long getRoleCount(@CjOpenportParameter(name ="tenantCode", usage = "租户编码") String tenantCode);

	@CjOpenport(type = ArrayList.class, elementType = TenantRole.class,usage = "获取一页角色")
	List<TenantRole> page(@CjOpenportParameter(name ="tenantCode", usage = "租户编码") String tenantCode,
			@CjOpenportParameter(name ="currPage", usage = "当前页码") int currPage,
			@CjOpenportParameter(name ="pageSize", usage = "页大小") int pageSize);

	@CjOpenport(type = ArrayList.class, elementType = Account.class,usage = "获取一页角色")
	List<Account> getAccountsOnRole(@CjOpenportParameter(name ="tenantCode", usage = "租户编码") String tenantCode,
			@CjOpenportParameter(name ="roleCode", usage = "角色代码") String roleCode);

	@CjOpenport(usage = "添加账户到角色")
	void addAccountOnRole(@CjOpenportParameter(name ="tenantCode", usage = "租户编码") String tenantCode,
			@CjOpenportParameter(name ="accountCode", usage = "账户代码") String accountCode,
			@CjOpenportParameter(name ="roleCode", usage = "角色代码") String roleCode);

	@CjOpenport(usage = "移除账户在角色")
	void removeAccountOnRole(@CjOpenportParameter(name ="tenantCode", usage = "租户编码") String tenantCode,
			@CjOpenportParameter(name ="accountCode", usage = "账户代码") String accountCode,
			@CjOpenportParameter(name ="roleCode", usage = "角色代码") String roleCode);

	@CjOpenport(usage = "清空角色上的账户")
	void emptyAccountsOnRole(@CjOpenportParameter(name ="tenantCode", usage = "租户编码") String tenantCode,
			@CjOpenportParameter(name ="roleCode", usage = "角色代码") String roleCode);

}
