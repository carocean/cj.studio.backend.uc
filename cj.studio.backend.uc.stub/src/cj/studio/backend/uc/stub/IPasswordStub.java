package cj.studio.backend.uc.stub;

import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

@CjOpenports(usage = "密码服务")
public interface IPasswordStub extends IOpenportService {
	@CjOpenport(usage = "设置密码")
	void setPassword(@CjOpenportParameter( name ="userCode", usage = "用户代码") String userCode,
			@CjOpenportParameter( name ="pwd", usage = "用户密码") String pwd);

	@CjOpenport(usage = "更新密码")
	void updatePassword(@CjOpenportParameter( name ="userCode", usage = "用户代码") String userCode,
			@CjOpenportParameter( name ="oldpwd", usage = "旧密码") String old,
			@CjOpenportParameter( name ="newpwd", usage = "新密码") String pwd);

}
