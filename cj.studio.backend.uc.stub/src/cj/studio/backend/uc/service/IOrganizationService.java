package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.OrgAttribute;
import cj.studio.backend.uc.bo.OrgSegment;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.User;

public interface IOrganizationService {
	void addOrganization(Organization org);

	void removeOrganization(String orgCode);

	Organization getOrganization(String orgCode);

	long getOrganizationCount();

	List<Organization> getPage(int currPage, int pageSize);

	List<Segment> getSegmentsOfOrganization(String orgCode);

	void addSegmentOfOrganization(OrgSegment seg);

	void removeSegmentOfOrganization(String orgCode, String segCode);

	void emptySegmentsOfOrganization(String orgCode);

	void addOrganizationAttribute(OrgAttribute attr);

	void removeOrganizationAttribute(String orgCode, String segCode, String attrCode);

	void emptyOrganizationAttributes(String orgCode, String segCode);

	List<OrgAttribute> getOrganizationAttributes(String orgCode, String segCode);

	void addOrgMember(String appCode, String userCode, String orgCode);

	void removeOrgMember(String appCode, String userCode, String orgCode);

	void emptyOrgMembers(String appCode, String orgCode);

	List<User> getOrgMembers(String appCode, String orgCode);

	List<Organization> getOrganizationsOfUser(String appCode, String userCode);
}
