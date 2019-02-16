package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.Role;
import cj.studio.backend.uc.bo.User;

public interface IRoleService {
	void addRole(Role role);

	void removeRole(String roleCode);

	Role getRole(String roleCode);

	long getRoleCount();

	List<Role> getPage(int currPage, int pageSize);

	List<User> getUsersOnRole(String roleCode);

	List<User> getUsersOnRoleByPage(String roleCode, int currPage, int pageSize);

	void addUserOnRole(String userCode, String roleCode);

	void removeUserOnRole(String userCode, String roleCode);

	void emptyUsersOnRole(String roleCode);

	List<User> getOrgMembersOnRole(String orgCode, String roleCode);

	void addOrgMemberOnRole(String userCode, String orgCode, String roleCode);

	void removeOrgMemberOnRole(String userCode, String orgCode, String roleCode);

	void emptyOrgMembersOnRole(String orgCode, String roleCode);

	List<Role> getRolesOnUser(String userCøode);

	List<Role> getRolesOnOrgMember(String userCode, String orgCode, String appCode);

	List<Role> getRolesOnUserByPage(String userCode, int currPage, int pageSize);
}
