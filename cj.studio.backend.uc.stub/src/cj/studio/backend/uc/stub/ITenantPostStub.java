package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantPost;
import cj.studio.ecm.net.CircuitException;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/tenant/post.service", usage = "租户岗位存根")
public interface ITenantPostStub {
	@CjStubMethod(usage = "添加岗位")
	void addPost(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "postCode", usage = "岗位代码") String postCode,
			@CjStubInParameter(key = "postName", usage = "岗位名") String postName,
			@CjStubInParameter(key = "comment", usage = "说明") String comment) throws CircuitException;

	@CjStubMethod(usage = "获取岗位")
	TenantPost getPost(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "postCode", usage = "岗位代码") String postCode);

	@CjStubMethod(usage = "移除岗位")
	void removePost(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "postCode", usage = "岗位代码") String postCode);

	@CjStubMethod(usage = "岗位分页")
	@CjStubReturn(type = ArrayList.class, elementType = TenantPost.class, usage = "一页数")
	List<TenantPost> pagePost(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "currPage", usage = "当前页码") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "获取岗位下的账户")
	@CjStubReturn(type = ArrayList.class, elementType = Account.class, usage = "一页数")
	List<Account> getAccountsOnPost(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "postCode", usage = "岗位代码") String postCode);

	@CjStubMethod(usage = "获取岗位下的账户")
	@CjStubReturn(type = ArrayList.class, elementType = Account.class, usage = "一页数")
	List<Account> pageAccountsOnPost(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "postCode", usage = "岗位代码") String postCode,
			@CjStubInParameter(key = "currPage", usage = "当前页码") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "添加一个岗位到指定账户")
	void addAccountOnPost(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户代码") String accountCode,
			@CjStubInParameter(key = "postCode", usage = "岗位代码") String postCode);

	@CjStubMethod(usage = "移除指定岗位一个账户")
	void removeAccountOnPost(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户代码") String accountCode,
			@CjStubInParameter(key = "postCode", usage = "岗位代码") String postCode);

	@CjStubMethod(usage = "清空指定岗位的账户")
	void emptyAccountsOnPost(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "postCode", usage = "岗位代码") String postCode);
}
