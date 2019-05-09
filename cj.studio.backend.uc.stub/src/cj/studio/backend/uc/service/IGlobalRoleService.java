package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.GlobalRole;
import cj.studio.backend.uc.bo.User;

public interface IGlobalRoleService {
	void addRole(String roleCode,String roleName,String comment);

	void removeRole(String roleCode);

	GlobalRole getRole(String roleCode);

	long getRoleCount();

	List<GlobalRole> getPage(int currPage, int pageSize);

	List<User> getUsersOnRole(String roleCode);

	List<User> getUsersOnRoleByPage(String roleCode, int currPage, int pageSize);

	void addUserOnRole(String userCode, String roleCode);

	void removeUserOnRole(String userCode, String roleCode);

	void emptyUsersOnRole(String roleCode);

	List<GlobalRole> getRolesOnUserByPage(String userCode, int currPage, int pageSize);
	List<GlobalRole> getRolesOnUser(String userCode);
	
}
