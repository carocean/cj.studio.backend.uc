package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantRole;

public interface ITenantRoleService {

	void addRole(TenantRole role);

	void removeRole(String tenantCode, String roleCode);

	TenantRole getRole(String tenantCode, String roleCode);

	long getRoleCount(String tenantCode);

	void emptyAccountsOnRole(String tenantCode, String roleCode);

	void removeAccountOnRole(String tenantCode, String accountCode, String roleCode);

	void addAccountOnRole(String tenantCode, String accountCode, String roleCode);

	List<Account> getAccountsOnRole(String tenantCode, String roleCode);

	List<TenantRole> page(String tenantCode, int currPage, int pageSize);
	
}
