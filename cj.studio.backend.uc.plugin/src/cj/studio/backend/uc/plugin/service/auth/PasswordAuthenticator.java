package cj.studio.backend.uc.plugin.service.auth;

import java.util.HashMap;
import java.util.Map;

import cj.studio.backend.uc.plugin.util.JwtUtil;
import cj.studio.backend.uc.service.AuthenticationException;
import cj.studio.backend.uc.service.AuthenticatorInfo;
import cj.studio.backend.uc.service.CheckPasswordException;
import cj.studio.backend.uc.service.IAuthenticator;
import cj.studio.backend.uc.service.IAuthenticatorFactory;
import cj.studio.backend.uc.service.IPasswordService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.IServiceAfter;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceInvertInjection;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.ultimate.util.StringUtil;

@CjService(name = "auth.password")
public class PasswordAuthenticator implements IAuthenticator, IServiceAfter {
	AuthenticatorInfo info;
	@CjServiceRef(refByName = "passwordService")
	IPasswordService passwordService;
	@CjServiceInvertInjection
	@CjServiceRef(refByName = "authenticatorFactory")
	IAuthenticatorFactory factory;
	private String key;

	@Override
	public void onAfter(IServiceSite site) {
		key = site.getProperty("uc.auth.jwt.key");
		if (StringUtil.isEmpty(key)) {
			throw new EcmException("属性为空：uc.auth.jwt.key");
		}
		String authUrl = site.getProperty("uc.auth.password.url");
		if (StringUtil.isEmpty(authUrl)) {
			throw new EcmException("属性为空：uc.auth.password.url");
		}
		info = new AuthenticatorInfo("password", "登录", "", authUrl);
	}

	@Override
	public AuthenticatorInfo getInfo() {
		return info;
	}

	@Override
	public String authenticate(String principals, String password, Map<String, String> props)
			throws AuthenticationException {
		try {
			passwordService.checkPassword(principals, password);
			if(props==null||!props.containsKey("ttlMillis")) {
				throw new AuthenticationException("缺少属性：ttlMillis。它是token过期时间");
			}
			String ttlMillis=props.get("ttlMillis");
			if(StringUtil.isEmpty(ttlMillis)) {
				ttlMillis=String.valueOf(Integer.MAX_VALUE);
			}
			Map<String, Object> claims=new HashMap<>();
			return JwtUtil.createJWT(Long.valueOf(ttlMillis), key, principals, password,claims);
		} catch (CheckPasswordException e) {
			throw new AuthenticationException(e.getMessage());
		}
	}

}
