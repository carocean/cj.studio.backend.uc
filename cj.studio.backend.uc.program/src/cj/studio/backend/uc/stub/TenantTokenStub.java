package cj.studio.backend.uc.stub;

import java.util.HashMap;
import java.util.Map;

import cj.studio.backend.uc.bo.Tenant;
import cj.studio.backend.uc.service.AuthenticationException;
import cj.studio.backend.uc.service.IAuthenticatorFactory;
import cj.studio.backend.uc.service.ITenantService;
import cj.studio.backend.uc.service.ITenantTokenService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;
import cj.ultimate.gson2.com.google.gson.Gson;
import cj.ultimate.gson2.com.google.gson.reflect.TypeToken;

@CjService(name = "/tenantToken.service")
public class TenantTokenStub extends GatewayAppSiteRestStub implements ITenantTokenStub {
	@CjServiceRef(refByName = "ucplugin.tenantTokenService")
	ITenantTokenService tenantTokenService;
	@CjServiceRef(refByName = "ucplugin.authenticatorFactory")
	IAuthenticatorFactory facotry;
	@CjServiceRef(refByName = "ucplugin.tenantService")
	ITenantService tenantService;

	@Override
	public String genToken(String tenant, String user, String pwd, long ttlMillis) throws AuthenticationException {
		Tenant exists = tenantService.getTenant(tenant);
		if (exists == null) {
			throw new AuthenticationException("404 不存在租户：" + tenant);
		}
		String json = facotry.authenticate("auth.password", tenant, user, pwd, ttlMillis);
		Map<String, String> map = new Gson().fromJson(json, new TypeToken<HashMap<String, String>>() {
		}.getType());
		if (!"200".equals(map.get("status"))) {
			throw new AuthenticationException(map.get("status") + " " + map.get("message"));
		}
		return tenantTokenService.genToken(tenant, user, ttlMillis);
	}

}
