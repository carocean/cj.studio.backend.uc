package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.*;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.InRequest;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.ArrayList;
import java.util.List;

@CjOpenports(usage = "用户存根")
public interface IUserStub extends IOpenportService {
    @CjOpenport(usage = "按编码查询用户", type = User.class)
    User getUser(@CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode);

    @CjOpenport(command = "post", usage = "保存用户")
    void saveUser(@CjOpenportParameter(name = "user", in = InRequest.content, usage = "用户对象。说明：在user.userCode为空的时候自动产生数据编码") User user);

    @CjOpenport(usage = "删除用户")
    void removeUser(@CjOpenportParameter(name = "userCode", usage = "用法编码") String userCode);

    @CjOpenport(usage = "用户数", type = Long.class)
    long getUserCount();

    @CjOpenport(usage = "获取一页用户", type = ArrayList.class, elementType = User.class)
    List<User> getPage(@CjOpenportParameter(name = "currPage", usage = "当前分页位置") int currPage,
                       @CjOpenportParameter(name = "pageSize", usage = "分页大小") int pageSize);

    @CjOpenport(usage = "添加用户属性")
    void addUserAttribute(@CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode,
                          @CjOpenportParameter(name = "segCode", usage = "段编码") String segCode,
                          @CjOpenportParameter(name = "attrCode", usage = "属性编码") String attrCode,
                          @CjOpenportParameter(name = "value", usage = "属性值") String value);

    @CjOpenport(usage = "移除用户下指定的属性")
    void removeUserAttribute(@CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode,
                             @CjOpenportParameter(name = "segCode", usage = "段编码") String segCode,
                             @CjOpenportParameter(name = "attrCode", usage = "属性编码") String attrCode);

    @CjOpenport(usage = "获用户下指定的属性值")
    String getUserAttribute(@CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode,
                            @CjOpenportParameter(name = "segCode", usage = "段编码") String segCode,
                            @CjOpenportParameter(name = "attrCode", usage = "属性编码") String attrCode);

    @CjOpenport(usage = "清空用户所有属性")
    void emptyUserAttributes(@CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode,
                             @CjOpenportParameter(name = "segCode", usage = "段编码") String segCode);

    @CjOpenport(type = ArrayList.class, elementType = UserAttribute.class, usage = "获取用户属性")
    List<UserAttribute> getUserAttributes(@CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode,
                                          @CjOpenportParameter(name = "segCode", usage = "段编码") String segCode);

    @CjOpenport(usage = "按信息段及其属性值查询用户", type = ArrayList.class, elementType = User.class)
    List<User> getUsersByAttrValue(@CjOpenportParameter(name = "segCode", usage = "信息段编码") String segCode,
                                   @CjOpenportParameter(name = "attrCode", usage = "属性编码") String attrCode,
                                   @CjOpenportParameter(name = "value", usage = "属性值") String value);

    @CjOpenport(usage = "获取用户的账户")
    Account getAccountOfUserOnTenant(@CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode,
                                     @CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode);

    @CjOpenport(usage = "列出用户账户", type = ArrayList.class, elementType = Account.class)
    List<Account> listAccountOfUser(@CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode);

    @CjOpenport(usage = "列出全局角色", type = ArrayList.class, elementType = GlobalRole.class)
    List<GlobalRole> listGlobalRoleOfUser(@CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode);

    @CjOpenport(usage = "列出租户角色", type = ArrayList.class, elementType = TenantRole.class)
    List<TenantRole> listTenantRoleOfUser(@CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode,
                                          @CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode);

    @CjOpenport(usage = "列出租户岗位", type = ArrayList.class, elementType = TenantPost.class)
    List<TenantPost> listTenantPostOfUser(@CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode,
                                          @CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode);

    @CjOpenport(usage = "列出租户群组", type = ArrayList.class, elementType = TenantGroup.class)
    List<TenantGroup> listTenantGroupOfUser(@CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode,
                                            @CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode);

    @CjOpenport(usage = "列出租户机构", type = ArrayList.class, elementType = Organization.class)
    List<Organization> listTenantOrganizationOfUser(
            @CjOpenportParameter(name = "userCode", usage = "用户编码") String userCode,
            @CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode);

    @CjOpenport(usage = "获取用户段", type = ArrayList.class, elementType = Segment.class)
    List<Segment> getSegmentsOfUser();

    @CjOpenport(usage = "添加用户段")
    void addSegmentOfUser(@CjOpenportParameter(name = "segCode", usage = "段编码") String segCode,
                          @CjOpenportParameter(name = "sort", usage = "排序") int sort);

    @CjOpenport(usage = "移除用户段")
    void removeSegmentOfUser(@CjOpenportParameter(name = "segCode", usage = "段编码") String segCode);

    @CjOpenport(usage = "清空用户段")
    void emptySegmentsOfUser();
}
