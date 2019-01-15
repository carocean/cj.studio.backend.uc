package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

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
	User getUser(@CjStubInParameter(key = "UserCode", usage = "用户编码") String userCode);

	@CjStubMethod(command = "post", usage = "保存用户")
	void saveUser(@CjStubInContentKey(key = "user", usage = "用户对象") User user);

	@CjStubMethod(usage = "删除用户")
	void removeUser(@CjStubInParameter(key = "UserCode", usage = "用法编码") String userCode);

	@CjStubMethod(usage = "用户数")
	@CjStubReturn(type = Long.class, usage = "返回用户数")
	long getUserCount();

	@CjStubMethod(usage = "获取一页用户")
	@CjStubReturn(type = ArrayList.class, usage = "返回一页用户")
	List<User> getPage(@CjStubInParameter(key = "currPage", usage = "当前分页位置") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "分页大小") int pageSize);

	@CjStubMethod(usage = "添加用户属性", command = "post")
	void addUserAttribute(@CjStubInContentKey(key = "attr", usage = "用户属性") UserAttribute attr);

	@CjStubMethod(usage = "移除用户下指定的属性")
	void removeUserAttribute(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性编码") String attrCode);

	@CjStubMethod(usage = "清空用户所有属性")
	void emptyUserAttributes(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode);

	@CjStubMethod(usage = "获取用户属性")
	List<UserAttribute> getUserAttributes(@CjStubInParameter(key = "userCode", usage = "用户编码") String userCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode);

	@CjStubMethod(usage = "按信息段及其属性值查询用户")
	@CjStubReturn(type = User.class, usage = "返回用户，如果不存在则返回null")
	User getUserByAttrValue(@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性编码") String attrCode,
			@CjStubInParameter(key = "value", usage = "属性值") String value);
}
