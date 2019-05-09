package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.AccountAttribute;
import cj.studio.backend.uc.bo.AccountSegment;
import cj.studio.backend.uc.bo.GlobalRole;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.TenantGroup;
import cj.studio.backend.uc.bo.TenantPost;
import cj.studio.backend.uc.bo.TenantRole;
import cj.studio.gateway.stub.annotation.CjStubInContentKey;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/tenant/account.service", usage = "账户存根")
public interface IAccountStub {

	@CjStubMethod(usage = "获取账户")
	@CjStubReturn(type = Account.class, usage = "返回账户，如果不存在则返回null")
	Account getAccount(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户") String accountCode);

	@CjStubMethod(usage = "返回账户数")
	long getAccountCount(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode);

	@CjStubMethod(usage = "获取一页账户")
	@CjStubReturn(type = ArrayList.class, elementType = Account.class, usage = "返回一页账户")
	List<Account> getPage(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "currPage", usage = "当前页号") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "获取账户的信息段")
	@CjStubReturn(type = ArrayList.class, elementType = Segment.class, usage = "返回Json")
	List<Segment> getSegmentsOfAccount(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户") String accountCode);

	@CjStubMethod(usage = "添加账户的信息段", command = "post")
	void addSegmentOfAccount(@CjStubInContentKey(key = "seg", usage = "账户信息段") AccountSegment seg);

	@CjStubMethod(usage = "移除账户的信息段")
	void removeSegmentOfAccount(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户") String accountCode,
			@CjStubInParameter(key = "segCode", usage = "段号") String segCode);

	@CjStubMethod(usage = "清空账户的信息段")
	void emptySegmentsOfAccount(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户") String accountCode);

	@CjStubMethod(usage = "添加账户的属性", command = "post")
	void addAccountAttribute(@CjStubInContentKey(key = "attr", usage = "账户属性") AccountAttribute attr);

	@CjStubMethod(usage = "移除账户的属性")
	void removeAccountAttribute(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户") String accountCode,
			@CjStubInParameter(key = "segCode", usage = "段号") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性") String attrCode);

	@CjStubMethod(usage = "清空账户指定段下的所有属性")
	void emptyAccountAttributes(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户") String accountCode,
			@CjStubInParameter(key = "segCode", usage = "段号") String segCode);

	@CjStubMethod(usage = "获取账户指定段下的所有属性")
	@CjStubReturn(type = ArrayList.class, elementType = AccountAttribute.class, usage = "返回Json")
	List<AccountAttribute> getAccountAttributes(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户") String accountCode,
			@CjStubInParameter(key = "segCode", usage = "段号") String segCode);

	@CjStubMethod(usage = "按信息段及其属性值查询账户")
	@CjStubReturn(type = Account.class, usage = "返回用户，如果不存在则返回null")
	Account getAccountByAttrValue(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性编码") String attrCode,
			@CjStubInParameter(key = "value", usage = "属性值") String value);

	@CjStubMethod(usage = "列也全局角色")
	@CjStubReturn(type = GlobalRole.class, usage = "全局角色")
	List<GlobalRole> listGlobalRoleOfAccount(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户标识") String accountCode);

	@CjStubMethod(usage = "列出租户角色")
	@CjStubReturn(type = ArrayList.class, elementType = TenantRole.class, usage = "集合")
	List<TenantRole> listTenantRoleOfAccount(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户标识") String accountCode);

	@CjStubMethod(usage = "列出租户岗位")
	@CjStubReturn(type = ArrayList.class, elementType = TenantPost.class, usage = "集合")
	List<TenantPost> listTenantPostOfAccount(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户标识") String accountCode);

	@CjStubMethod(usage = "列出租户群组")
	@CjStubReturn(type = ArrayList.class, elementType = TenantGroup.class, usage = "集合")
	List<TenantGroup> listTenantGroupOfAccount(@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户标识") String accountCode);

	@CjStubMethod(usage = "列出租户机构")
	@CjStubReturn(type = ArrayList.class, elementType = Organization.class, usage = "集合")
	List<Organization> listTenantOrganizationOfAccount(
			@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户标识") String accountCode);

}
