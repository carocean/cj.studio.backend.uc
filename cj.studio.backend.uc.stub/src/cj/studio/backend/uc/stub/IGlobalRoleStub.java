package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.GlobalRole;
import cj.studio.backend.uc.bo.User;
import cj.studio.gateway.stub.annotation.CjStubInContentKey;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/role.service", usage = "角色存根")
public interface IGlobalRoleStub {
	@CjStubMethod(usage = "添加角色")
	void addRole(@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode,
			@CjStubInParameter(key = "roleName", usage = "角色名") String roleName,
			@CjStubInParameter(key = "comment", usage = "角色描述") String comment);

	@CjStubMethod(usage = "移除角色")
	void removeRole(@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "获取角色")
	@CjStubReturn(type = GlobalRole.class, usage = "返回角色")
	GlobalRole getRole(@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "角色数")
	long getRoleCount();

	@CjStubMethod(command = "post", usage = "获取一页角色")
	@CjStubReturn(type = ArrayList.class, elementType = GlobalRole.class, usage = "返回角色，Json格式")
	List<GlobalRole> getPage(@CjStubInContentKey(key = "currPage", usage = "当前页码") int currPage,
			@CjStubInContentKey(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "获取一页角色")
	@CjStubReturn(type = ArrayList.class, elementType = User.class, usage = "返回角色，Json格式")
	List<User> getUsersOnRole(@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "添加用户到角色")
	void addUserOnRole(@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "移除用户在角色")
	void removeUserOnRole(@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode,
			@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);

	@CjStubMethod(usage = "清空角色上的用户")
	void emptyUsersOnRole(@CjStubInParameter(key = "roleCode", usage = "角色代码") String roleCode);


}
