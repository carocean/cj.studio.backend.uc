package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.Tenant;
import cj.studio.backend.uc.bo.TenantAttribute;
import cj.studio.backend.uc.bo.TenantSegment;
import cj.studio.gateway.stub.annotation.CjStubInContentKey;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/tenant.service", usage = "租户存根")
public interface ITenantStub {
	@CjStubMethod(command = "post", usage = "添加tenant")
	void addTenant(@CjStubInContentKey(key = "tenant", usage = "租户实例，json") Tenant tenant);

	@CjStubMethod(command = "post", usage = "移除tenant")
	void removeTenant(@CjStubInContentKey(key = "tenantCode", usage = "租户编码") String tenantCode);

	@CjStubMethod(command = "post", usage = "获取tenant")
	@CjStubReturn(type = Tenant.class, usage = "返回租户")
	Tenant getTenant(@CjStubInContentKey(key = "tenantCode", usage = "租户编码") String tenantCode);

	@CjStubMethod(usage = "获取租户数")
	long getTenantCount();

	@CjStubMethod(command = "post", usage = "获取一页")
	@CjStubReturn(type = ArrayList.class,elementType=Tenant.class,  usage = "返回")
	List<Tenant> getPage(@CjStubInContentKey(key = "currPage", usage = "当前页") int currPage,
			@CjStubInContentKey(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(command = "post", usage = "获取租户的信息段")
	@CjStubReturn(type = ArrayList.class,elementType=Segment.class, usage = "返回")
	List<Segment> getSegmentsOfTenant(@CjStubInContentKey(key = "tenantCode", usage = "租户编码") String tenantCode);

	@CjStubMethod(command = "post", usage = "为租户添加扩展信息段")
	void addSegmentOfTenant(@CjStubInContentKey(key = "seg", usage = "信息段")TenantSegment seg);

	@CjStubMethod(command = "post", usage = "移除租户指定关联的信息段")
	void removeSegmentOfTenant(@CjStubInContentKey(key = "tenantCode", usage = "租户编码") String tenantCode,
			@CjStubInContentKey(key = "segCode", usage = "信息段编码") String segCode);

	@CjStubMethod(command = "post", usage = "清空该租户的信息段")
	void emptySegmentsOfTenant(@CjStubInContentKey(key = "tenantCode", usage = "租户编码") String tenantCode);

	@CjStubMethod(command = "post", usage = "添加用户属性")
	void addTenantAttribute(@CjStubInContentKey(key = "attr", usage = "租户属性") TenantAttribute attr);

	@CjStubMethod(usage = "移除租户下指定的属性")
	void removeTenantAttribute(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "segCode", usage = "段代码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性代码") String attrCode);

	@CjStubMethod(usage = "清空租户下的属性")
	void emptyTenantAttributes(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "segCode", usage = "段代码") String segCode);

	@CjStubMethod(usage = "清空租户下的属性")
	@CjStubReturn(type = ArrayList.class,elementType=TenantAttribute.class, usage = "租户的属性")
	List<TenantAttribute> getTenantAttributes(@CjStubInParameter(key = "tenantCode", usage = "租户代码") String tenantCode,
			@CjStubInParameter(key = "segCode", usage = "段代码") String segCode);
}
