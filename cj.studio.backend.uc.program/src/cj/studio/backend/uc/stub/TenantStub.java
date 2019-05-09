package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
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
	public void addTenant(String tenantCode, String tenantName, String ownerCode, String ownerType) {
		Tenant tenant = new Tenant();
		tenant.setCode(tenantCode);
		tenant.setCreatetime(System.currentTimeMillis());
		tenant.setName(tenantName);
		tenant.setOwnercode(ownerCode);
		tenant.setOwnertype(ownerType);
		tenantService.addTenant(tenant);
	}

	@Override
	public void removeTenant(String tenantCode) {
		tenantService.removeTenant(tenantCode);
	}

	@Override
	public Tenant getTenant(String tenantCode) {
		return tenantService.getTenant(tenantCode);
	}

	@Override
	public long getTenantCount() {
		return tenantService.getAppCount();
	}

	@Override
	public List<Tenant> pageTenant(int currPage, int pageSize) {
		return tenantService.getPage(currPage, pageSize);
	}

	@Override
	public List<Segment> getSegmentsOfTenant(String tenantCode) {
		return tenantService.getSegmentsOfTenant(tenantCode);
	}

	@Override
	public void addSegmentOfTenant(TenantSegment seg) {
		tenantService.addSegmentOfTenant(seg);
	}

	@Override
	public void removeSegmentOfTenant(String tenantCode, String segCode) {
		tenantService.removeSegmentOfTenant(tenantCode, segCode);
	}

	@Override
	public void emptySegmentsOfTenant(String tenantCode) {
		tenantService.emptySegmentsOfTenant(tenantCode);
	}

	@Override
	public void addTenantAttribute(TenantAttribute attr) {
		tenantService.addTenantAttribute(attr);
	}

	@Override
	public String getTenantAttribute(String tenantCode, String segCode, String attrCode) {
		return tenantService.getTenantAttribute(tenantCode, segCode, attrCode);
	}

	@Override
	public void removeTenantAttribute(String tenantCode, String segCode, String attrCode) {
		tenantService.removeTenantAttribute(tenantCode, segCode, attrCode);
	}

	@Override
	public void emptyTenantAttributes(String tenantCode, String segCode) {
		tenantService.emptyTenantAttributes(tenantCode, segCode);
	}

	@Override
	public List<TenantAttribute> getTenantAttributes(String tenantCode, String segCode) {
		return tenantService.getTenantAttributes(tenantCode, segCode);
	}

	@Override
	public void setCompanyOnTenant(String companyCode, String tenantCode) {
		tenantService.setCompanyOnTenant(companyCode, tenantCode);
	}

	@Override
	public void unsetCompanyOnTenant(String tenantCode) {
		tenantService.unsetCompanyOnTenant(tenantCode);
	}

	@Override
	public void addAccount(String tenantCode, String accountCode, String accountName, String userCode, String face) {
		tenantService.addAccount(tenantCode, accountCode, accountName, userCode, face);
	}

	@Override
	public void removeAccount(String tenantCode, String accountCode) {
		tenantService.removeAccount(tenantCode, accountCode);
	}

	@Override
	public long getAccountCount(String tenantCode) {
		return tenantService.getAccountCount(tenantCode);
	}

	@Override
	public List<Account> pageAccount(String tenantCode, int currPage, int pageSize) {
		return tenantService.getPage(tenantCode, currPage, pageSize);
	}

	@Override
	public Account getAccount(String tenantCode, String accountCode) {
		return tenantService.getAccount(tenantCode, accountCode);
	}

}
