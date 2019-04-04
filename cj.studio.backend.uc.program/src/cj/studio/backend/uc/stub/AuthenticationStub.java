package cj.studio.backend.uc.stub;

import java.util.HashMap;
import java.util.Map;

import cj.studio.backend.uc.service.AuthenticationException;
import cj.studio.backend.uc.service.AuthenticatorInfo;
import cj.studio.backend.uc.service.IAuthenticator;
import cj.studio.backend.uc.service.IAuthenticatorFactory;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;
import cj.ultimate.gson2.com.google.gson.Gson;

@CjService(name = "/authentication.service")
public class AuthenticationStub extends GatewayAppSiteRestStub implements IAuthenticationStub {
	@CjServiceRef(refByName = "ucplugin.authenticatorFactory")
	IAuthenticatorFactory facotry;

	@Override
	public String[] enumAuthenticatorNames() {
		return facotry.enumNames();
	}

	@Override
	public String authenticate(String authName,String tenant, String principals, String password, long ttlMillis) {
		Map<String, String> result = new HashMap<>();
		try {
			String ret = facotry.authenticate(authName,tenant, principals, password, ttlMillis);
			result.put("status", "200");
			result.put("message", "OK");
			result.put("result", ret);
		} catch (AuthenticationException e) {
			result.put("status", "500");
			result.put("message", e.getMessage());
		}
		return new Gson().toJson(result);
	}

	@Override
	public AuthenticatorInfo getAuthenticatorInfo(String authName) {
		IAuthenticator auth = facotry.get(authName);
		if (auth == null) {
			return null;
		}

		return auth.getInfo();
	}

}
