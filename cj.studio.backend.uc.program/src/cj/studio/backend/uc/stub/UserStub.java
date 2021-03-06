package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.*;
import cj.studio.backend.uc.service.IUserService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;

import java.util.List;

@CjService(name = "/user.service")
public class UserStub  implements IUserStub {
	@CjServiceRef(refByName = "ucplugin.userService")
	IUserService userService;

	@Override
	public User getUser(String code) {
		return userService.getUser(code);
	}

	@Override
	public void saveUser(User user) {
		userService.saveUser(user);
	}

	@Override
	public long getUserCount() {
		return userService.getUserCount();
	}

	@Override
	public List<User> getPage(int currPage, int pageSize) {
		return userService.getPage(currPage, pageSize);
	}

	@Override
	public void removeUser(String userCode) {
		userService.removeUser(userCode);
	}
	@Override
	public Account getAccountOfUserOnTenant(String userCode, String tenantCode) {
		return userService.getAccountOfUserOnTenant(userCode, tenantCode);
	}
	
	@Override
	public void addUserAttribute(String userCode, String segCode, String attrCode, String value) {
		UserAttribute attr=new UserAttribute();
		attr.setAttrcode(attrCode);
		attr.setSegcode(segCode);
		attr.setUsercode(userCode);
		attr.setValue(value);
		userService.addUserAttribute(attr);
	}

	@Override
	public void removeUserAttribute(String userCode, String segCode, String attrCode) {
		userService.removeUserAttribute(userCode, segCode, attrCode);
	}

	@Override
	public String getUserAttribute(String userCode, String segCode, String attrCode) {
		return userService.getUserAttribute(userCode, segCode, attrCode);
	}

	@Override
	public void emptyUserAttributes(String userCode, String segCode) {
		userService.emptyUserAttributes(userCode, segCode);
	}

	@Override
	public List<UserAttribute> getUserAttributes(String userCode, String segCode) {
		return userService.getUserAttributes(userCode, segCode);
	}

	@Override
	public List<User> getUsersByAttrValue(String segCode, String attrCode, String value) {
		return userService.getUsersByAttrValue(segCode, attrCode, value);
	}

	@Override
	public List<Account> listAccountOfUser(String userCode) {
		return userService.listAccountOfUser(userCode);
	}

	@Override
	public List<GlobalRole> listGlobalRoleOfUser(String userCode) {
		return userService.listGlobalRoleOfUser(userCode);
	}

	@Override
	public List<TenantRole> listTenantRoleOfUser(String userCode, String tenantCode) {
		return userService.listTenantRoleOfUser(userCode, tenantCode);
	}

	@Override
	public List<TenantPost> listTenantPostOfUser(String userCode, String tenantCode) {
		return userService.listTenantPostOfUser(userCode, tenantCode);
	}

	@Override
	public List<TenantGroup> listTenantGroupOfUser(String userCode, String tenantCode) {
		return userService.listTenantGroupOfUser(userCode, tenantCode);
	}

	@Override
	public List<Organization> listTenantOrganizationOfUser(String userCode, String tenantCode) {
		return userService.listTenantOrganizationOfUser(userCode, tenantCode);
	}

	@Override
	public List<Segment> getSegmentsOfUser() {
		return userService.getSegmentsOfUser();
	}

	@Override
	public void addSegmentOfUser(String segCode, int sort) {
		 userService.addSegmentOfUser(segCode,sort);
	}

	@Override
	public void removeSegmentOfUser(String segCode) {
		 userService.removeSegmentOfUser(segCode);
	}

	@Override
	public void emptySegmentsOfUser() {
		 userService.emptySegmentsOfUser();
	}

}
