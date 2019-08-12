package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.GlobalRole;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.service.IGlobalRoleService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;

import java.util.List;

@CjService(name = "/role.service")
public class GlobalRoleStub implements IGlobalRoleStub {
	@CjServiceRef(refByName = "ucplugin.globalRoleService")
	IGlobalRoleService globalRoleService;

	@Override
	public void addRole(String roleCode, String roleName, String comment) {
		globalRoleService.addRole(roleCode, roleName, comment);
	}

	@Override
	public void removeRole(String roleCode) {
		globalRoleService.removeRole(roleCode);
	}

	@Override
	public GlobalRole getRole(String roleCode) {
		return globalRoleService.getRole(roleCode);
	}

	@Override
	public long getRoleCount() {
		return globalRoleService.getRoleCount();
	}

	@Override
	public List<GlobalRole> getPage(int currPage, int pageSize) {
		return globalRoleService.getPage(currPage, pageSize);
	}

	@Override
	public List<User> getUsersOnRole(String roleCode) {
		return globalRoleService.getUsersOnRole(roleCode);
	}

	@Override
	public void addUserOnRole(String userCode, String roleCode) {
		globalRoleService.addUserOnRole(userCode, roleCode);
	}

	@Override
	public void removeUserOnRole(String userCode, String roleCode) {
		globalRoleService.removeUserOnRole(userCode, roleCode);
	}

	@Override
	public void emptyUsersOnRole(String roleCode) {
		globalRoleService.emptyUsersOnRole(roleCode);
	}


}
