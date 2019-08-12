package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.GlobalRole;
import cj.studio.backend.uc.bo.User;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.ArrayList;
import java.util.List;

@CjOpenports(usage = "角色存根")
public interface IGlobalRoleStub extends IOpenportService {
    @CjOpenport(usage = "添加角色")
    void addRole(@CjOpenportParameter(name = "roleCode", usage = "角色代码") String roleCode,
                 @CjOpenportParameter(name = "roleName", usage = "角色名") String roleName,
                 @CjOpenportParameter(name = "comment", usage = "角色描述") String comment);

    @CjOpenport(usage = "移除角色")
    void removeRole(@CjOpenportParameter(name = "roleCode", usage = "角色代码") String roleCode);

    @CjOpenport(usage = "获取角色", type = GlobalRole.class)
    GlobalRole getRole(@CjOpenportParameter(name = "roleCode", usage = "角色代码") String roleCode);

    @CjOpenport(usage = "角色数")
    long getRoleCount();

    @CjOpenport(usage = "获取一页角色", type = ArrayList.class, elementType = GlobalRole.class)
    List<GlobalRole> getPage(@CjOpenportParameter(name = "currPage", usage = "当前页码") int currPage,
                             @CjOpenportParameter(name = "pageSize", usage = "页大小") int pageSize);

    @CjOpenport(type = ArrayList.class, elementType = User.class, usage = "获取一页角色")
    List<User> getUsersOnRole(@CjOpenportParameter(name = "roleCode", usage = "角色代码") String roleCode);

    @CjOpenport(usage = "添加用户到角色")
    void addUserOnRole(@CjOpenportParameter(name = "userCode", usage = "用户代码") String userCode,
                       @CjOpenportParameter(name = "roleCode", usage = "角色代码") String roleCode);

    @CjOpenport(usage = "移除用户在角色")
    void removeUserOnRole(@CjOpenportParameter(name = "userCode", usage = "用户代码") String userCode,
                          @CjOpenportParameter(name = "roleCode", usage = "角色代码") String roleCode);

    @CjOpenport(usage = "清空角色上的用户")
    void emptyUsersOnRole(@CjOpenportParameter(name = "roleCode", usage = "角色代码") String roleCode);

}
