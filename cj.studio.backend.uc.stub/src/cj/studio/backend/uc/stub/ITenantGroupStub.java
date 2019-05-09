package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantGroup;
import cj.studio.ecm.net.CircuitException;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/tenant/group.service", usage = "租户群组存根")
public interface ITenantGroupStub {
	@CjStubMethod(usage = "添加群组")
	void addGroup(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "groupCode", usage = "组代码") String groupCode,
			@CjStubInParameter(key = "groupName", usage = "组名") String groupName,
			@CjStubInParameter(key = "comment", usage = "说明") String comment) throws CircuitException;

	@CjStubMethod(usage = "获取群组")
	TenantGroup getGroup(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "groupCode", usage = "组代码") String groupCode);

	@CjStubMethod(usage = "移除群组")
	void removeGroup(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "groupCode", usage = "组代码") String groupCode);

	@CjStubMethod(usage = "分页")
	@CjStubReturn(elementType = TenantGroup.class, usage = "一页")
	List<TenantGroup> pageGroup(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "currPage", usage = "当前页") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "获取指定群组的账户")
	@CjStubReturn(elementType = Account.class, usage = "账户集合")
	List<Account> getAccountsOnGroup(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "groupCode", usage = "组代码") String groupCode);

	@CjStubMethod(usage = "获取指定群组的账户")
	@CjStubReturn(elementType = Account.class, usage = "一页")
	List<Account> pageAccountsOnGroup(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "groupCode", usage = "组代码") String groupCode,
			@CjStubInParameter(key = "currPage", usage = "当前页") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "添加账户到指定群组")
	void addAccountOnGroup(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户代码") String accountCode,
			@CjStubInParameter(key = "groupCode", usage = "组代码") String groupCode);

	@CjStubMethod(usage = "移除群组的一个账户")
	void removeAccountOnGroup(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户代码") String accountCode,
			@CjStubInParameter(key = "groupCode", usage = "组代码") String groupCode);

	@CjStubMethod(usage = "清空群组上的账户")
	void emptyAccountsOnGroup(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "groupCode", usage = "组代码") String groupCode);
}
