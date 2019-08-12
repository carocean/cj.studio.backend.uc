package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.ArrayList;
import java.util.List;

@CjOpenports(usage = "机构存根")
public interface ITenantOrganizationStub extends IOpenportService {
	@CjOpenport(usage = "添加机构")
	void addOrganization(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="orgCode", usage = "机构代码") String orgCode,
			@CjOpenportParameter(name ="orgName", usage = "机构名") String orgName,
			@CjOpenportParameter(name ="pid", usage = "父机构代码") String pid,
			@CjOpenportParameter(name ="comment", usage = "说明") String comment);

	@CjOpenport(usage = "移除机构")
	void removeOrganization(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="orgCode", usage = "机构代码") String orgCode);

	@CjOpenport(usage = "获取机构")
	Organization getOrganization(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="orgCode", usage = "机构代码") String orgCode);

	@CjOpenport(usage = "获取机构总数")
	long getOrganizationCount(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode);

	@CjOpenport(type = ArrayList.class, elementType = Organization.class,usage = "获取子机构")
	List<Organization> listChilds(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="pid", usage = "父机构代码") String pid);

	@CjOpenport(usage = "返回子机构数")
	long childCount(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="pid", usage = "父机构代码") String pid);

	@CjOpenport(type = ArrayList.class, elementType = Account.class,usage = "获取机构下的账户")
	List<Account> getAccountsOnOrg(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="orgCode", usage = "机构代码") String orgCode);

	@CjOpenport(type = ArrayList.class, elementType = Account.class,usage = "获取指定机构下的一页账户数据")
	List<Account> pageAccountsOnOrg(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="orgCode", usage = "机构代码") String orgCode,
			@CjOpenportParameter(name ="currPage", usage = "当前页码") int currPage,
			@CjOpenportParameter(name ="pageSize", usage = "页大小") int pageSize);

	@CjOpenport(usage = "为指定机构清加账户")
	void addAccountOnOrg(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="accountCode", usage = "账户代码") String accountCode,
			@CjOpenportParameter(name ="orgCode", usage = "机构代码") String orgCode);

	@CjOpenport(usage = "移除指定机构下的一个账户")
	void removeAccountOnOrg(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="accountCode", usage = "账户代码") String accountCode,
			@CjOpenportParameter(name ="orgCode", usage = "机构代码") String orgCode);

	@CjOpenport(usage = "清空机构下的账户")
	void emptyAccountsOnOrg(@CjOpenportParameter(name ="tenantCode", usage = "租户代码") String tenantCode,
			@CjOpenportParameter(name ="orgCode", usage = "机构代码") String orgCode);
}
