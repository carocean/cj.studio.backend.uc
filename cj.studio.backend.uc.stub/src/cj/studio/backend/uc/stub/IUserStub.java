package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.User;
import cj.studio.gateway.stub.annotation.CjStubInContentKey;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/user.service", usage = "用户存根")
public interface IUserStub {
	@CjStubMethod(usage = "按编码查询用户")
	@CjStubReturn(type = User.class, usage = "返回用户")
	User getUser(@CjStubInParameter(key = "UserCode", usage = "用法编码") String code);

	@CjStubMethod(command = "post", usage = "保存用户")
	void saveUser(@CjStubInContentKey(key="user",usage = "用户对象") User user);

	@CjStubMethod(usage = "删除用户")
	void removeUser(@CjStubInParameter(key = "UserCode", usage = "用法编码") String userCode);

	@CjStubMethod(usage = "用户数")
	@CjStubReturn(type = Long.class, usage = "返回用户数")
	long getUserCount();

	@CjStubMethod(usage = "获取一页用户")
	@CjStubReturn(type = ArrayList.class, usage = "返回一页用户")
	List<User> getPage(@CjStubInParameter(key = "currPage", usage = "当前分页位置") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "分页大小") int pageSize);

}
