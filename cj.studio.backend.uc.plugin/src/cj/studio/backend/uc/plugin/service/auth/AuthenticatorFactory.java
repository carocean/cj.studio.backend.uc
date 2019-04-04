package cj.studio.backend.uc.plugin.service.auth;

import java.util.HashMap;
import java.util.Map;

import cj.studio.backend.uc.service.AuthenticationException;
import cj.studio.backend.uc.service.IAuthenticator;
import cj.studio.backend.uc.service.IAuthenticatorFactory;
import cj.studio.ecm.IServiceSetter;
import cj.studio.ecm.annotation.CjService;
@CjService(name="authenticatorFactory")
public class AuthenticatorFactory implements IAuthenticatorFactory,IServiceSetter{
	Map<String, IAuthenticator> auths;
	public AuthenticatorFactory() {
		auths=new HashMap<>();
	}
	@Override
	public IAuthenticator get(String name) {
		return auths.get(name);
	}

	@Override
	public String[] enumNames() {
		return auths.keySet().toArray(new String[0]);
	}

	@Override
	public void setService(String name, Object service) {
		auths.put(name, (IAuthenticator)service);
	}
	@Override
	public String authenticate(String authName,String tenant,String principals, String token,  long ttlMillis)
			throws AuthenticationException {
		IAuthenticator auth=auths.get(authName);
		if(auth==null) {
			throw new AuthenticationException("认证器不存在："+authName);
		}
		return auth.authenticate(tenant,principals, token, ttlMillis);
	}

}
