package cj.studio.backend.uc.plugin.service;

import java.util.HashMap;
import java.util.Map;

import cj.studio.backend.uc.plugin.util.JwtUtil;
import cj.studio.backend.uc.service.ITenantTokenService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.IServiceAfter;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.annotation.CjService;
import cj.ultimate.util.StringUtil;

@CjService(name = "tenantTokenService")
public class TenantTokenService implements ITenantTokenService, IServiceAfter {

	private String key;

	@Override
	public void onAfter(IServiceSite site) {
		key = site.getProperty("uc.auth.jwt.key");
		if (StringUtil.isEmpty(key)) {
			throw new EcmException("属性为空：uc.auth.jwt.key");
		}
	}

	@Override
	public String genToken(String tenant, String user, long ttlMillis) {
		Map<String, Object> claims = new HashMap<String, Object>();
		claims.put("user", user);
		return JwtUtil.createJWT(key, tenant, ttlMillis, claims);
	}

}
