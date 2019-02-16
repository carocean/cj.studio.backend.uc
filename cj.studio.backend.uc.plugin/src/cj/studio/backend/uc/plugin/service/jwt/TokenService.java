package cj.studio.backend.uc.plugin.service.jwt;

import cj.studio.backend.uc.plugin.util.JwtUtil;
import cj.studio.backend.uc.service.ITokenService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.IServiceAfter;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.annotation.CjService;
import cj.ultimate.gson2.com.google.gson.Gson;
import cj.ultimate.util.StringUtil;
import io.jsonwebtoken.Claims;

@CjService(name = "tokenService")
public class TokenService implements ITokenService, IServiceAfter {

	private String key;

	@Override
	public boolean verify(String token) {
		JwtUtil.parseJWT(token, key);
		return true;
	}

	@Override
	public String parseToken(String token) {
		Claims claims = JwtUtil.parseJWT(token, key);
		return new Gson().toJson(claims);
	}

	@Override
	public void onAfter(IServiceSite site) {
		key = site.getProperty("uc.auth.jwt.key");
		if (StringUtil.isEmpty(key)) {
			throw new EcmException("属性为空：uc.auth.jwt.key");
		}
	}

}
