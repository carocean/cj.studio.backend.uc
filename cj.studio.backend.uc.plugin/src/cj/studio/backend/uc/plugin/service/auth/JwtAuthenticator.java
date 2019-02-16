package cj.studio.backend.uc.plugin.service.auth;

import java.util.Map;

import cj.studio.backend.uc.plugin.util.JwtUtil;
import cj.studio.backend.uc.service.AuthenticationException;
import cj.studio.backend.uc.service.AuthenticatorInfo;
import cj.studio.backend.uc.service.IAuthenticator;
import cj.studio.backend.uc.service.IAuthenticatorFactory;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.IServiceAfter;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceInvertInjection;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.ultimate.util.StringUtil;

@CjService(name = "auth.jwt")
public class JwtAuthenticator implements IAuthenticator, IServiceAfter {
	AuthenticatorInfo info;
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
		String authUrl = site.getProperty("uc.auth.jwt.url");
		if (StringUtil.isEmpty(authUrl)) {
			throw new EcmException("属性为空：uc.auth.jwt.url");
		}
		info = new AuthenticatorInfo("jwt", "验证", "", authUrl);
	}

	@Override
	public AuthenticatorInfo getInfo() {
		return info;
	}

	@Override
	public String authenticate(String principals, String password, Map<String, String> props)
			throws AuthenticationException {
		if (!JwtUtil.isVerify(principals, key, password)) {
			throw new AuthenticationException("验证失败。经验不是密码的持有者的token");
		}
		return null;
	}

}
