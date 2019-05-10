package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.Tenant;
import cj.studio.backend.uc.bo.TenantAttribute;
import cj.studio.backend.uc.bo.TenantSegment;

public interface ITenantService {
	void addAccount(String tenantCode, String accountCode, String accountName, String userCode, String face);

	void removeAccount(String tenantCode, String accountCode);

	long getAccountCount(String tenantCode);

	List<Account> getPage(String tenantCode, int currPage, int pageSize);

	Account getAccount(String tenantCode, String accountCode);

	void addTenant(Tenant tenant);

	void removeTenant(String tenantCode);

	Tenant getTenant(String tenantCode);

	long getAppCount();

	List<Tenant> getPage(int currPage, int pageSize);

	List<Segment> getSegmentsOfTenant(String tenantCode);

	void addSegmentOfTenant(TenantSegment seg);

	void removeSegmentOfTenant(String tenantCode, String segCode);

	void emptySegmentsOfTenant(String tenantCode);

	void addTenantAttribute(TenantAttribute attr);

	void removeTenantAttribute(String tenantCode, String segCode, String attrCode);

	void emptyTenantAttributes(String tenantCode, String segCode);

	List<TenantAttribute> getTenantAttributes(String tenantCode, String segCode);

	String getTenantAttribute(String tenantCode, String segCode, String attrCode);

	void setCompanyOnTenant(String companyCode, String tenantCode);

	Segment getSegmentOfTenant(String tenantCode, String segCode);
}
