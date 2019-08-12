package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantPost;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.ArrayList;
import java.util.List;

@CjOpenports(usage = "租户岗位存根")
public interface ITenantPostStub extends IOpenportService {
	@CjOpenport(usage = "添加岗位")
	void addPost(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="postCode", usage = "岗位代码") String postCode,
			@CjOpenportParameter(name ="postName", usage = "岗位名") String postName,
			@CjOpenportParameter(name ="comment", usage = "说明") String comment) throws CircuitException;

	@CjOpenport(usage = "获取岗位")
	TenantPost getPost(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="postCode", usage = "岗位代码") String postCode);

	@CjOpenport(usage = "移除岗位")
	void removePost(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="postCode", usage = "岗位代码") String postCode);

	@CjOpenport(type = ArrayList.class, elementType = TenantPost.class,usage = "岗位分页")
	List<TenantPost> pagePost(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="currPage", usage = "当前页码") int currPage,
			@CjOpenportParameter(name ="pageSize", usage = "页大小") int pageSize);

	@CjOpenport(type = ArrayList.class, elementType = Account.class,usage = "获取岗位下的账户")
	List<Account> getAccountsOnPost(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="postCode", usage = "岗位代码") String postCode);

	@CjOpenport(type = ArrayList.class, elementType = Account.class,usage = "获取岗位下的账户")
	List<Account> pageAccountsOnPost(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="postCode", usage = "岗位代码") String postCode,
			@CjOpenportParameter(name ="currPage", usage = "当前页码") int currPage,
			@CjOpenportParameter(name ="pageSize", usage = "页大小") int pageSize);

	@CjOpenport(usage = "添加一个岗位到指定账户")
	void addAccountOnPost(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="accountCode", usage = "账户代码") String accountCode,
			@CjOpenportParameter(name ="postCode", usage = "岗位代码") String postCode);

	@CjOpenport(usage = "移除指定岗位一个账户")
	void removeAccountOnPost(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="accountCode", usage = "账户代码") String accountCode,
			@CjOpenportParameter(name ="postCode", usage = "岗位代码") String postCode);

	@CjOpenport(usage = "清空指定岗位的账户")
	void emptyAccountsOnPost(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="postCode", usage = "岗位代码") String postCode);
}
