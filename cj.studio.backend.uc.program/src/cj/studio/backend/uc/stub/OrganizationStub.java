package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.OrgAttribute;
import cj.studio.backend.uc.bo.OrgSegment;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.service.IOrganizationService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;

@CjService(name = "/organization.service")
public class OrganizationStub extends GatewayAppSiteRestStub implements IOrganizationStub {
	@CjServiceRef(refByName = "ucplugin.organizationService")
	IOrganizationService organizationService;

	@Override
	public void addOrganization(Organization org) {
		organizationService.addOrganization(org);
	}

	@Override
	public void removeOrganization(String tenantCode,String orgCode) {
		organizationService.removeOrganization(tenantCode,orgCode);
	}

	@Override
	public Organization getOrganization(String tenantCode,String orgCode) {
		return organizationService.getOrganization(tenantCode,orgCode);
	}

	@Override
	public long getOrganizationCount() {
		return organizationService.getOrganizationCount();
	}

	@Override
	public List<Organization> getPage(int currPage, int pageSize) {
		return organizationService.getPage(currPage, pageSize);
	}

	@Override
	public List<Segment> getSegmentsOfOrganization(String tenantCode,String orgCode) {
		return organizationService.getSegmentsOfOrganization(tenantCode,orgCode);
	}

	@Override
	public void addSegmentOfOrganization(OrgSegment seg) {
		organizationService.addSegmentOfOrganization(seg);
	}

	@Override
	public void removeSegmentOfOrganization(String tenantCode,String orgCode, String segCode) {
		organizationService.removeSegmentOfOrganization(tenantCode,orgCode, segCode);
	}

	@Override
	public void emptySegmentsOfOrganization(String tenantCode,String orgCode) {
		organizationService.emptySegmentsOfOrganization(tenantCode,orgCode);
	}

	@Override
	public void addOrganizationAttribute(OrgAttribute attr) {
		organizationService.addOrganizationAttribute(attr);
	}

	@Override
	public void removeOrganizationAttribute(String tenantCode,String orgCode, String segCode, String attrCode) {
		organizationService.removeOrganizationAttribute(tenantCode,orgCode, segCode, attrCode);
	}

	@Override
	public void emptyOrganizationAttributes(String tenantCode,String orgCode, String segCode) {
		organizationService.emptyOrganizationAttributes(tenantCode,orgCode, segCode);
	}

	@Override
	public List<OrgAttribute> getOrganizationAttributes(String tenantCode,String orgCode, String segCode) {
		return organizationService.getOrganizationAttributes(tenantCode,orgCode, segCode);
	}

	@Override
	public void addOrgMember(String tenantCode, String userCode, String orgCode) {
		organizationService.addOrgMember(tenantCode, userCode, orgCode);
	}

	@Override
	public void removeOrgMember(String tenantCode, String userCode, String orgCode) {
		organizationService.removeOrgMember(tenantCode, userCode, orgCode);
	}

	@Override
	public void emptyOrgMembers(String tenantCode, String orgCode) {
		organizationService.emptyOrgMembers(tenantCode, orgCode);
	}

	@Override
	public List<User> getOrgMembers(String tenantCode, String orgCode) {
		return organizationService.getOrgMembers(tenantCode, orgCode);
	}

	@Override
	public List<Organization> getOrganizationsOfUser(String tenantCode, String userCode) {
		return organizationService.getOrganizationsOfUser(tenantCode, userCode);
	}

}
