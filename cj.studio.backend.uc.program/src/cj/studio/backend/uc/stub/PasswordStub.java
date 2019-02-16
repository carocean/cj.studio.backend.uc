package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.service.IPasswordService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;

@CjService(name = "/password.service")
public class PasswordStub  extends GatewayAppSiteRestStub  implements IPasswordStub {
	@CjServiceRef(refByName = "ucplugin.passwordService")
	IPasswordService passwordService;

	@Override
	public void setPassword(String userCode, String pwd) {
		passwordService.setPassword(userCode, pwd);
	}

	@Override
	public void updatePassword(String userCode, String old, String pwd) {
		passwordService.updatePassword(userCode, old, pwd);
	}

	
}
