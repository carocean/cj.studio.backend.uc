package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/tenant/organization.service", usage = "机构存根")
public interface ITenantOrganizationStub {
	@CjStubMethod(usage = "添加机构")
	void addOrganization(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode,
			@CjStubInParameter(key = "orgName", usage = "机构名") String orgName,
			@CjStubInParameter(key = "pid", usage = "父机构代码") String pid,
			@CjStubInParameter(key = "comment", usage = "说明") String comment);

	@CjStubMethod(usage = "移除机构")
	void removeOrganization(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(usage = "获取机构")
	Organization getOrganization(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(usage = "获取机构总数")
	long getOrganizationCount(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode);

	@CjStubMethod(usage = "获取子机构")
	@CjStubReturn(type = ArrayList.class, elementType = Organization.class, usage = "返回机构集合")
	List<Organization> listChilds(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "pid", usage = "父机构代码") String pid);

	@CjStubMethod(usage = "返回子机构数")
	long childCount(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "pid", usage = "父机构代码") String pid);

	@CjStubMethod(usage = "获取机构下的账户")
	@CjStubReturn(type = ArrayList.class, elementType = Account.class, usage = "一页数")
	List<Account> getAccountsOnOrg(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(usage = "获取指定机构下的一页账户数据")
	@CjStubReturn(type = ArrayList.class, elementType = Account.class, usage = "一页数")
	List<Account> pageAccountsOnOrg(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode,
			@CjStubInParameter(key = "currPage", usage = "当前页码") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "为指定机构清加账户")
	void addAccountOnOrg(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户代码") String accountCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(usage = "移除指定机构下的一个账户")
	void removeAccountOnOrg(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户代码") String accountCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(usage = "清空机构下的账户")
	void emptyAccountsOnOrg(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);
}
