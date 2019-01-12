package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.service.IUserService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;

@CjService(name = "/user.service")
public class UserStub extends GatewayAppSiteRestStub implements IUserStub {
	@CjServiceRef(refByName="ucplugin.userService")
	IUserService userService;
	@Override
	public User getUser(String code) {
		return userService.getUser(code);
	}

	@Override
	public void saveUser(User user) {
		userService.saveUser(user);
	}

	@Override
	public long getUserCount() {
		return userService.getUserCount();
	}

	@Override
	public List<User> getPage(int currPage, int pageSize) {
		return userService.getPage(currPage, pageSize);
	}

	@Override
	public void removeUser(String userCode) {
		userService.removeUser(userCode);
	}

}
