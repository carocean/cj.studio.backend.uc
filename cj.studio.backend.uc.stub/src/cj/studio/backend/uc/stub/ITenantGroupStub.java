package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantGroup;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.List;

@CjOpenports( usage = "租户群组存根")
public interface ITenantGroupStub extends IOpenportService {
	@CjOpenport(usage = "添加群组")
	void addGroup(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name = "groupCode", usage = "组代码") String groupCode,
			@CjOpenportParameter(name = "groupName", usage = "组名") String groupName,
			@CjOpenportParameter(name = "comment", usage = "说明") String comment) throws CircuitException;

	@CjOpenport(usage = "获取群组")
	TenantGroup getGroup(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name = "groupCode", usage = "组代码") String groupCode);

	@CjOpenport(usage = "移除群组")
	void removeGroup(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name = "groupCode", usage = "组代码") String groupCode);

	@CjOpenport(elementType = TenantGroup.class,usage = "分页")
	List<TenantGroup> pageGroup(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name = "currPage", usage = "当前页") int currPage,
			@CjOpenportParameter(name = "pageSize", usage = "页大小") int pageSize);

	@CjOpenport(elementType = Account.class,usage = "获取指定群组的账户")
	List<Account> getAccountsOnGroup(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name = "groupCode", usage = "组代码") String groupCode);

	@CjOpenport(elementType = Account.class,usage = "获取指定群组的账户")
	List<Account> pageAccountsOnGroup(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name = "groupCode", usage = "组代码") String groupCode,
			@CjOpenportParameter(name = "currPage", usage = "当前页") int currPage,
			@CjOpenportParameter(name = "pageSize", usage = "页大小") int pageSize);

	@CjOpenport(usage = "添加账户到指定群组")
	void addAccountOnGroup(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name = "accountCode", usage = "账户代码") String accountCode,
			@CjOpenportParameter(name = "groupCode", usage = "组代码") String groupCode);

	@CjOpenport(usage = "移除群组的一个账户")
	void removeAccountOnGroup(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name = "accountCode", usage = "账户代码") String accountCode,
			@CjOpenportParameter(name = "groupCode", usage = "组代码") String groupCode);

	@CjOpenport(usage = "清空群组上的账户")
	void emptyAccountsOnGroup(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name = "groupCode", usage = "组代码") String groupCode);
}
