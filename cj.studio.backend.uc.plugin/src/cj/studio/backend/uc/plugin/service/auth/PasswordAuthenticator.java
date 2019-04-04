package cj.studio.backend.uc.plugin.service.auth;

import java.util.HashMap;
import java.util.Map;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Tenant;
import cj.studio.backend.uc.plugin.util.JwtUtil;
import cj.studio.backend.uc.service.AuthenticationException;
import cj.studio.backend.uc.service.AuthenticatorInfo;
import cj.studio.backend.uc.service.CheckPasswordException;
import cj.studio.backend.uc.service.IAccountService;
import cj.studio.backend.uc.service.IAuthenticator;
import cj.studio.backend.uc.service.IAuthenticatorFactory;
import cj.studio.backend.uc.service.IPasswordService;
import cj.studio.backend.uc.service.ITenantService;
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
	@CjServiceRef
	ITenantService tenantService;
	@CjServiceRef
	IAccountService accountService;
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
		info = new AuthenticatorInfo("password", "要求参数均为明文", "", authUrl);
	}

	@Override
	public AuthenticatorInfo getInfo() {
		return info;
	}

	@Override
	public String authenticate(String tenant,String principals, String password, long ttlMillis) throws AuthenticationException {
		try {
			Tenant t=tenantService.getTenant(tenant);
			if(t==null) {
				throw new AuthenticationException(String.format("验证失败。租户不存在：%s", tenant));
			}
			String user="";
			Account account=accountService.getAccount(tenant, principals);
			if(account!=null) {
				user=account.getUsercode();
			}else {//不存在账户则把principals当成统一用户来验证
				user=principals;
			}
			passwordService.checkPassword(user, password);
			if (ttlMillis <= 0) {
				throw new AuthenticationException("ttlMillis小于零");
			}
			Map<String, Object> claims = new HashMap<String, Object>();
			claims.put("user", user);
			return JwtUtil.createJWT(key, tenant, ttlMillis, claims);
		} catch (CheckPasswordException e) {
			throw new AuthenticationException(e.getMessage());
		}
	}

}
