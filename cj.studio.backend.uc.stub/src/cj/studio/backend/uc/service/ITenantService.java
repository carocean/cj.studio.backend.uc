package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.Tenant;
import cj.studio.backend.uc.bo.TenantAttribute;
import cj.studio.backend.uc.bo.TenantSegment;

public interface ITenantService {
	void addTenant(Tenant tenant);
	void removeTenant(String tenantCode);
	Tenant getTenant(String tenantCode);
	long getAppCount();
	List<Tenant> getPage(int currPage, int pageSize);
	List<Segment> getSegmentsOfTenant(String tenantCode);
	void addSegmentOfTenant(TenantSegment seg);
	void removeSegmentOfTenant(String tenantCode,String segCode);
	void emptySegmentsOfTenant(String tenantCode);
	
	void addTenantAttribute(TenantAttribute attr);

	void removeTenantAttribute(String tenantCode, String segCode, String attrCode);

	void emptyTenantAttributes(String tenantCode, String segCode);

	List<TenantAttribute> getTenantAttributes(String tenantCode, String segCode);
}
