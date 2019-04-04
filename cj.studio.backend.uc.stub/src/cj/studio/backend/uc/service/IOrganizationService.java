package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.OrgAttribute;
import cj.studio.backend.uc.bo.OrgSegment;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.User;

public interface IOrganizationService {
	void addOrganization(Organization org);

	void removeOrganization(String tenantCode,String orgCode);

	Organization getOrganization(String tenantCode,String orgCode);

	long getOrganizationCount();

	List<Organization> getPage(int currPage, int pageSize);

	List<Segment> getSegmentsOfOrganization(String tenantCode,String orgCode);

	void addSegmentOfOrganization(OrgSegment seg);

	void removeSegmentOfOrganization(String tenantCode,String orgCode, String segCode);

	void emptySegmentsOfOrganization(String tenantCode,String orgCode);

	void addOrganizationAttribute(OrgAttribute attr);

	void removeOrganizationAttribute(String tenantCode,String orgCode, String segCode, String attrCode);

	void emptyOrganizationAttributes(String tenantCode,String orgCode, String segCode);

	List<OrgAttribute> getOrganizationAttributes(String tenantCode,String orgCode, String segCode);

	void addOrgMember(String tenantCode, String userCode, String orgCode);

	void removeOrgMember(String tenantCode, String userCode, String orgCode);

	void emptyOrgMembers(String tenantCode, String orgCode);

	List<User> getOrgMembers(String tenantCode, String orgCode);

	List<Organization> getOrganizationsOfUser(String tenantCode, String userCode);
}
