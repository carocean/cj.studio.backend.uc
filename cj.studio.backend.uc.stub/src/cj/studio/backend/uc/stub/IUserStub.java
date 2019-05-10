package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.GlobalRole;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.TenantGroup;
import cj.studio.backend.uc.bo.TenantPost;
import cj.studio.backend.uc.bo.TenantRole;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.bo.UserAttribute;
import cj.studio.gateway.stub.annotation.CjStubInContentKey;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/user.service", usage = "用户存根")
public interface IUserStub {
	@CjStubMethod(usage = "按编码查询用户")
	@CjStubReturn(type = User.class, usage = "返回用户")
	User getUser(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode);

	@CjStubMethod(command = "post", usage = "保存用户")
	void saveUser(@CjStubInContentKey(key = "user", usage = "用户对象。说明：在user.userCode为空的时候自动产生数据编码") User user);

	@CjStubMethod(usage = "删除用户")
	void removeUser(@CjStubInParameter(key = "userCode", usage = "用法编码") String userCode);

	@CjStubMethod(usage = "用户数")
	@CjStubReturn(type = Long.class, usage = "返回用户数")
	long getUserCount();

	@CjStubMethod(usage = "获取一页用户")
	@CjStubReturn(type = ArrayList.class, elementType = User.class, usage = "返回一页用户")
	List<User> getPage(@CjStubInParameter(key = "currPage", usage = "当前分页位置") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "分页大小") int pageSize);

	@CjStubMethod(usage = "添加用户属性")
	void addUserAttribute(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性编码") String attrCode,
			@CjStubInParameter(key = "value", usage = "属性值") String value);

	@CjStubMethod(usage = "移除用户下指定的属性")
	void removeUserAttribute(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性编码") String attrCode);

	@CjStubMethod(usage = "获用户下指定的属性值")
	String getUserAttribute(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性编码") String attrCode);

	@CjStubMethod(usage = "清空用户所有属性")
	void emptyUserAttributes(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode);

	@CjStubMethod(usage = "获取用户属性")
	@CjStubReturn(type = ArrayList.class, elementType = UserAttribute.class, usage = "用户属性")
	List<UserAttribute> getUserAttributes(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode);

	@CjStubMethod(usage = "按信息段及其属性值查询用户")
	@CjStubReturn(type = ArrayList.class, elementType = User.class, usage = "返回用户集合")
	List<User> getUsersByAttrValue(@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性编码") String attrCode,
			@CjStubInParameter(key = "value", usage = "属性值") String value);

	@CjStubMethod(usage = "获取用户的账户")
	Account getAccountOfUserOnTenant(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "tenantCode", usage = "租户编码") String tenantCode);

	@CjStubMethod(usage = "列出用户账户")
	@CjStubReturn(type = ArrayList.class, elementType = Account.class, usage = "集合")
	List<Account> listAccountOfUser(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode);

	@CjStubMethod(usage = "列出全局角色")
	@CjStubReturn(type = ArrayList.class, elementType = GlobalRole.class, usage = "集合")
	List<GlobalRole> listGlobalRoleOfUser(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode);

	@CjStubMethod(usage = "列出租户角色")
	@CjStubReturn(type = ArrayList.class, elementType = TenantRole.class, usage = "集合")
	List<TenantRole> listTenantRoleOfUser(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode);

	@CjStubMethod(usage = "列出租户岗位")
	@CjStubReturn(type = ArrayList.class, elementType = TenantPost.class, usage = "集合")
	List<TenantPost> listTenantPostOfUser(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode);

	@CjStubMethod(usage = "列出租户群组")
	@CjStubReturn(type = ArrayList.class, elementType = TenantGroup.class, usage = "集合")
	List<TenantGroup> listTenantGroupOfUser(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode);

	@CjStubMethod(usage = "列出租户机构")
	@CjStubReturn(type = ArrayList.class, elementType = Organization.class, usage = "集合")
	List<Organization> listTenantOrganizationOfUser(
			@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "tenantCode", usage = "租户") String tenantCode);

	@CjStubMethod(usage = "获取用户段")
	@CjStubReturn(type = ArrayList.class, elementType = Segment.class, usage = "集合")
	List<Segment> getSegmentsOfUser();

	@CjStubMethod(usage = "添加用户段")
	void addSegmentOfUser(@CjStubInParameter(key = "segCode", usage = "段编码") String segCode,
			@CjStubInParameter(key = "sort", usage = "排序") int sort);

	@CjStubMethod(usage = "移除用户段")
	void removeSegmentOfUser(@CjStubInParameter(key = "segCode", usage = "段编码") String segCode);

	@CjStubMethod(usage = "清空用户段")
	void emptySegmentsOfUser();
}
