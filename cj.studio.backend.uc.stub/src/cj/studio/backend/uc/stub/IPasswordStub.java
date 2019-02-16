package cj.studio.backend.uc.stub;

import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/password.service", usage = "密码服务")
public interface IPasswordStub {
	@CjStubMethod(usage = "设置密码")
	void setPassword(@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode,
			@CjStubInParameter(key = "pwd", usage = "用户密码") String pwd);

	@CjStubMethod(usage = "更新密码")
	void updatePassword(@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode,
			@CjStubInParameter(key = "oldpwd", usage = "旧密码") String old,
			@CjStubInParameter(key = "newpwd", usage = "新密码") String pwd);

}
