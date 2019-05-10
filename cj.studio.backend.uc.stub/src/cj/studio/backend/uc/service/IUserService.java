package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.GlobalRole;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.TenantGroup;
import cj.studio.backend.uc.bo.TenantPost;
import cj.studio.backend.uc.bo.TenantRole;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.bo.UserAttribute;

public interface IUserService {
	User getUser(String userCode);

	void saveUser(User user);

	void removeUser(String userCode);

	long getUserCount();

	List<User> getPage(int currPage, int pageSize);

	void addUserAttribute(UserAttribute attr);

	void removeUserAttribute(String userCode, String segCode, String attrCode);

	void emptyUserAttributes(String userCode, String segCode);

	List<UserAttribute> getUserAttributes(String userCode, String segCode);

	List<User> getUsersByAttrValue(String segCode, String attrCode, String value);

	UserAttribute getUserAttribute(String userCode, String segCode, String attrCode, String value);

	List<UserAttribute> getUserAttributes(String userCode, String segCode, String attrCode);

	String getUserAttribute(String userCode, String segCode, String attrCode);

	Account getAccountOfUserOnTenant(String userCode, String tenantCode);

	List<Account> listAccountOfUser(String userCode);

	List<GlobalRole> listGlobalRoleOfUser(String userCode);

	List<TenantRole> listTenantRoleOfUser(String userCode, String tenantCode);

	List<TenantPost> listTenantPostOfUser(String userCode, String tenantCode);

	List<TenantGroup> listTenantGroupOfUser(String userCode, String tenantCode);

	List<Organization> listTenantOrganizationOfUser(String userCode, String tenantCode);

	List<User> getUsersByAttrValueOnSegment(String segCode, String value);

	List<Segment> getSegmentsOfUser();

	void addSegmentOfUser(String segCode, int sort);

	void removeSegmentOfUser(String segCode);

	void emptySegmentsOfUser();
}
