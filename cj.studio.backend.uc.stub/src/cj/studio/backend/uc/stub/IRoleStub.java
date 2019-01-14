package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Role;
import cj.studio.backend.uc.bo.User;
import cj.studio.gateway.stub.annotation.CjStubInContentKey;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/role.service", usage = "角色存根")
public interface IRoleStub {
	@CjStubMethod(command = "post", usage = "添加角色")
	void addRole(@CjStubInContentKey(key = "role", usage = "角色") Role role);

	@CjStubMethod(usage = "移除角色")
	void removeRole(@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "获取角色")
	@CjStubReturn(type = Role.class, usage = "返回角色")
	Role getRole(@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "角色数")
	long getRoleCount();

	@CjStubMethod(command = "post", usage = "获取一页角色")
	@CjStubReturn(type = ArrayList.class, usage = "返回角色，Json格式")
	List<Role> getPage(@CjStubInContentKey(key = "currPage", usage = "当前页码") int currPage,
			@CjStubInContentKey(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "获取一页角色")
	@CjStubReturn(type = ArrayList.class, usage = "返回角色，Json格式")
	List<User> getUsersOnRole(@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "添加用户到角色")
	void addUserOnRole(@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "移除用户在角色")
	void removeUserOnRole(@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "清空角色上的用户")
	void emptyUsersOnRole(@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "获取角色上的机构成员")
	@CjStubReturn(type = ArrayList.class, usage = "返回机构成员，Json格式")
	List<User> getOrgMembersOnRole(@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "添加机构成员到角色")
	void addOrgMemberOnRole(@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "移除角色上的机构成员")
	void removeOrgMemberOnRole(@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "清空角色上的所有机构成员")
	void emptyOrgMembersOnRole(@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "获取用户的所有角色")
	@CjStubReturn(type = ArrayList.class, usage = "角色集合")
	List<Role> getRolesOnUser(@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode);

	@CjStubMethod(usage = "获取机构成员的所有角色")
	@CjStubReturn(type = ArrayList.class, usage = "角色集合")
	List<Role> getRolesOnOrgMember(@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode,
			@CjStubInParameter(key = "appCode", usage = "应用代码") String appCode);
}
