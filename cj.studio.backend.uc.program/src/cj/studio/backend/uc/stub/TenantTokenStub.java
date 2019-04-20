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
import cj.studio.ecm.net.CircuitException;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;
import cj.ultimate.gson2.com.google.gson.Gson;

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
		Map<String, String> result = new HashMap<>();
		try {
			Tenant exists = tenantService.getTenant(tenant);
			if (exists == null) {
				throw new AuthenticationException("404", "不存在租户：" + tenant);
			}
			facotry.authenticate("auth.password", tenant, user, pwd, ttlMillis);
			String ret = tenantTokenService.genToken(tenant, user, ttlMillis);
			result.put("status", "200");
			result.put("message", "OK");
			result.put("result", ret);
		} catch (Exception e) {
			CircuitException ce = CircuitException.search(e);
			if (ce != null) {
				result.put("status", ce.getStatus());
				result.put("message", ce.getMessage());
			} else {
				result.put("status", "500");
				result.put("message", e.getMessage());
			}
		}
		return new Gson().toJson(result);
	}

}
