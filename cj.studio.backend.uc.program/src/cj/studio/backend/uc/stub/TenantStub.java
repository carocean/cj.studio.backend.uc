package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.Tenant;
import cj.studio.backend.uc.bo.TenantAttribute;
import cj.studio.backend.uc.bo.TenantSegment;
import cj.studio.backend.uc.service.ITenantService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;

@CjService(name = "/tenant.service")
public class TenantStub extends GatewayAppSiteRestStub implements ITenantStub {
	@CjServiceRef(refByName = "ucplugin.tenantService")
	ITenantService tenantService;

	@Override
	public void addTenant(Tenant app) {
		tenantService.addTenant(app);
	}

	@Override
	public void removeTenant(String appCode) {
		tenantService.removeTenant(appCode);
	}

	@Override
	public Tenant getTenant(String appCode) {
		return tenantService.getTenant(appCode);
	}

	@Override
	public long getTenantCount() {
		return tenantService.getAppCount();
	}

	@Override
	public List<Tenant> getPage(int currPage, int pageSize) {
		return tenantService.getPage(currPage, pageSize);
	}

	@Override
	public List<Segment> getSegmentsOfTenant(String appCode) {
		return tenantService.getSegmentsOfTenant(appCode);
	}

	@Override
	public void addSegmentOfTenant(TenantSegment seg) {
		tenantService.addSegmentOfTenant(seg);
	}

	@Override
	public void removeSegmentOfTenant(String appCode, String segCode) {
		tenantService.removeSegmentOfTenant(appCode, segCode);
	}

	@Override
	public void emptySegmentsOfTenant(String appCode) {
		tenantService.emptySegmentsOfTenant(appCode);
	}

	@Override
	public void addTenantAttribute(TenantAttribute attr) {
		tenantService.addTenantAttribute(attr);
	}

	@Override
	public void removeTenantAttribute(String appCode, String segCode, String attrCode) {
		tenantService.removeTenantAttribute(appCode, segCode, attrCode);
	}

	@Override
	public void emptyTenantAttributes(String appCode, String segCode) {
		tenantService.emptyTenantAttributes(appCode, segCode);
	}

	@Override
	public List<TenantAttribute> getTenantAttributes(String appCode, String segCode) {
		return tenantService.getTenantAttributes(appCode, segCode);
	}

}
