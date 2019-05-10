package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.Tenant;
import cj.studio.backend.uc.bo.TenantAttribute;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/tenant.service", usage = "租户存根")
public interface ITenantStub {
	@CjStubMethod(usage = "申请租户账户。正常申请顺序：先注册统一用户，而后使用该用户再申请租户账户")
	void addAccount(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户编码") String accountCode,
			@CjStubInParameter(key = "accountName", usage = "账户名") String accountName,
			@CjStubInParameter(key = "userCode", usage = "用户编码，如果为已知用户创建指定租户下的账户则赋值，如果未知则为空系统自动生成账户所对应的用户") String userCode,
			@CjStubInParameter(key = "face", usage = "头像路径") String face);

	@CjStubMethod(usage = "移除指定租户的账户")
	void removeAccount(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户编码") String accountCode);

	@CjStubMethod(usage = "获取租户下账户数")
	long getAccountCount(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode);

	@CjStubMethod(usage = "获取租户下一页账户")
	@CjStubReturn(elementType = Account.class, usage = "账户集合")
	List<Account> pageAccount(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "currPage", usage = "当前页") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "获取指定租户下的一个账户")
	Account getAccount(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "accountCode", usage = "账户编码") String accountCode);

	@CjStubMethod(usage = "添加tenant")
	void addTenant(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "tenantName", usage = "租户名") String tenantName,
			@CjStubInParameter(key = "ownerCode", usage = "租户所有者标识") String ownerCode,
			@CjStubInParameter(key = "ownerType", usage = "租户所有者类型，只有两种：personal（个人租户）,company(企业租户)") String ownerType);

	@CjStubMethod(usage = "移除tenant")
	void removeTenant(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode);

	@CjStubMethod(usage = "获取tenant")
	@CjStubReturn(type = Tenant.class, usage = "返回租户")
	Tenant getTenant(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode);

	@CjStubMethod(usage = "为指定租户设置企业")
	void setCompanyOnTenant(@CjStubInParameter(key = "companyCode", usage = "公司编码") String companyCode,
			@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode);

	@CjStubMethod(usage = "获取租户数")
	long getTenantCount();

	@CjStubMethod(usage = "获取一页")
	@CjStubReturn(type = ArrayList.class, elementType = Tenant.class, usage = "返回")
	List<Tenant> pageTenant(@CjStubInParameter(key = "currPage", usage = "当前页") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "获取租户的信息段")
	@CjStubReturn(type = ArrayList.class, elementType = Segment.class, usage = "返回")
	List<Segment> getSegmentsOfTenant(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode);

	@CjStubMethod(usage = "为租户添加扩展信息段")
	void addSegmentOfTenant(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode,
			@CjStubInParameter(key = "sort", usage = "段在租户中的顺序") int sort);

	@CjStubMethod(usage = "移除租户指定关联的信息段")
	void removeSegmentOfTenant(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode);

	@CjStubMethod(usage = "清空该租户的信息段")
	void emptySegmentsOfTenant(@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode);

	@CjStubMethod(usage = "添加用户属性")
	void addTenantAttribute(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "segCode", usage = "段代码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性代码") String attrCode,
			@CjStubInParameter(key = "value", usage = "属性值") String value);

	@CjStubMethod(usage = "移除租户下指定的属性")
	void removeTenantAttribute(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "segCode", usage = "段代码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性代码") String attrCode);

	@CjStubMethod(usage = "获取租户下指定的属性值")
	String getTenantAttribute(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "segCode", usage = "段代码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性代码") String attrCode);

	@CjStubMethod(usage = "清空租户下的属性")
	void emptyTenantAttributes(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "segCode", usage = "段代码") String segCode);

	@CjStubMethod(usage = "清空租户下的属性")
	@CjStubReturn(type = ArrayList.class, elementType = TenantAttribute.class, usage = "租户的属性")
	List<TenantAttribute> getTenantAttributes(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "segCode", usage = "段代码") String segCode);
}
