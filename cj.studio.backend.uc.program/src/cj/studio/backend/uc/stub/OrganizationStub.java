package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.OrgAttribute;
import cj.studio.backend.uc.bo.OrgSegment;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.Segment;
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
	public void removeOrganization(String orgCode) {
		organizationService.removeOrganization(orgCode);
	}

	@Override
	public Organization getOrganization(String orgCode) {
		return organizationService.getOrganization(orgCode);
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
	public List<Segment> getSegmentsOfOrganization(String orgCode) {
		return organizationService.getSegmentsOfOrganization(orgCode);
	}

	@Override
	public void addSegmentOfOrganization(OrgSegment seg) {
		organizationService.addSegmentOfOrganization(seg);
	}

	@Override
	public void removeSegmentOfOrganization(String orgCode, String segCode) {
		organizationService.removeSegmentOfOrganization(orgCode, segCode);
	}

	@Override
	public void emptySegmentsOfOrganization(String orgCode) {
		organizationService.emptySegmentsOfOrganization(orgCode);
	}

	@Override
	public void addOrganizationAttribute(OrgAttribute attr) {
		organizationService.addOrganizationAttribute(attr);
	}

	@Override
	public void removeOrganizationAttribute(String orgCode, String segCode, String attrCode) {
		organizationService.removeOrganizationAttribute(orgCode, segCode, attrCode);
	}

	@Override
	public void emptyOrganizationAttributes(String orgCode, String segCode) {
		organizationService.emptyOrganizationAttributes(orgCode, segCode);
	}

	@Override
	public List<OrgAttribute> getOrganizationAttributes(String orgCode, String segCode) {
		return organizationService.getOrganizationAttributes(orgCode, segCode);
	}

}
