package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.Role;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.bo.UserAttribute;
import cj.studio.backend.uc.bo.UserSegment;

public interface IUserService {
	User getUser(String userCode);
	void saveUser(User user);
	void removeUser(String userCode);
	long getUserCount();
	List<User> getPage(int currPage, int pageSize);
	List<Organization>getOrgsOfUser(String userCode,String appCode);
	List<Account> getAccountsOfUser(String userCode);
	List<UserSegment> getSegmentsOfUser(String userCode);
	List<UserAttribute> getAttributesOfSegment(String segCode);
	List<Role> getRoleOfUser(String userCode);
	List<Role> getRoleOfUserInOrg(String userCode,String orgCode,String appCode);
}
