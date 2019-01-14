package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.Role;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.service.IRoleService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;

@CjService(name = "/role.service")
public class RoleStub extends GatewayAppSiteRestStub implements IRoleStub {
	@CjServiceRef(refByName = "ucplugin.roleService")
	IRoleService roleService;

	@Override
	public void addRole(Role role) {
		roleService.addRole(role);
	}

	@Override
	public void removeRole(String roleCode) {
		roleService.removeRole(roleCode);
	}

	@Override
	public Role getRole(String roleCode) {
		return roleService.getRole(roleCode);
	}

	@Override
	public long getRoleCount() {
		return roleService.getRoleCount();
	}

	@Override
	public List<Role> getPage(int currPage, int pageSize) {
		return roleService.getPage(currPage, pageSize);
	}

	@Override
	public List<User> getUsersOnRole(String roleCode) {
		return roleService.getUsersOnRole(roleCode);
	}

	@Override
	public void addUserOnRole(String userCode, String roleCode) {
		roleService.addUserOnRole(userCode, roleCode);
	}

	@Override
	public void removeUserOnRole(String userCode, String roleCode) {
		roleService.removeUserOnRole(userCode, roleCode);
	}

	@Override
	public void emptyUsersOnRole(String roleCode) {
		roleService.emptyUsersOnRole(roleCode);
	}

	@Override
	public List<User> getOrgMembersOnRole(String orgCode, String roleCode) {
		return roleService.getOrgMembersOnRole(orgCode, roleCode);
	}

	@Override
	public void addOrgMemberOnRole(String userCode, String orgCode, String roleCode) {
		roleService.addOrgMemberOnRole(userCode, orgCode, roleCode);
	}

	@Override
	public void removeOrgMemberOnRole(String userCode, String orgCode, String roleCode) {
		roleService.removeOrgMemberOnRole(userCode, orgCode, roleCode);
	}

	@Override
	public void emptyOrgMembersOnRole(String orgCode, String roleCode) {
		roleService.emptyOrgMembersOnRole(orgCode, roleCode);
	}

	@Override
	public List<Role> getRolesOnUser(String userCode) {
		return roleService.getRolesOnUser(userCode);
	}

	@Override
	public List<Role> getRolesOnOrgMember(String userCode, String orgCode, String appCode) {
		return roleService.getRolesOnOrgMember(userCode, orgCode, appCode);
	}

}
