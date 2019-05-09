package cj.studio.backend.uc.plugin.service.auth;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.plugin.util.JwtUtil;
import cj.studio.backend.uc.service.AuthenticationException;
import cj.studio.backend.uc.service.AuthenticatorInfo;
import cj.studio.backend.uc.service.IAccountService;
import cj.studio.backend.uc.service.IAuthenticator;
import cj.studio.backend.uc.service.IAuthenticatorFactory;
import cj.studio.backend.uc.service.IPasswordService;
import cj.studio.backend.uc.service.ITenantService;
import cj.studio.backend.uc.service.IUserService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.IServiceAfter;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceInvertInjection;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.ultimate.util.StringUtil;

@CjService(name = "auth.phone")
public class PhoneAuthenticator implements IAuthenticator, IServiceAfter {
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
	@CjServiceRef
	IUserService userService;

	@Override
	public void onAfter(IServiceSite site) {
		key = site.getProperty("uc.auth.jwt.key");
		if (StringUtil.isEmpty(key)) {
			throw new EcmException("属性为空：uc.auth.jwt.key");
		}
		String authUrl = site.getProperty("uc.auth.phone.url");
		if (StringUtil.isEmpty(authUrl)) {
			throw new EcmException("属性为空：uc.auth.phone.url");
		}
		info = new AuthenticatorInfo("phone", "手机号验证", "", authUrl);
	}

	@Override
	public AuthenticatorInfo getInfo() {
		return info;
	}

	@Override
	public String authenticate(String tenant, String principals, String password, long ttlMillis)
			throws AuthenticationException {
		try {
			String user = "";
			List<Account> accounts = accountService.getAccountByAttrValueOnSegment(tenant, "phone", principals);
			if (!accounts.isEmpty()) {
				user = accounts.get(0).getUsercode();
			} else {// 不存在则到统一用户的属性上查找
				List<User> users = userService.getUsersByAttrValueOnSegment("phone", principals);
				if (!users.isEmpty()) {
					user = users.get(0).getUsercode();
				}
			}
			if(StringUtil.isEmpty(user)) {
				throw new AuthenticationException("404", "未查到关联账户或用户");
			}
			passwordService.checkPassword(user, password);
			if (ttlMillis <= 0) {
				throw new AuthenticationException("500", "ttlMillis小于零");
			}
			Map<String, Object> claims = new HashMap<String, Object>();
			claims.put("user", user);
			return JwtUtil.createJWT(key, tenant, ttlMillis, claims);
		} catch (Exception e) {
			CircuitException ce = CircuitException.search(e);
			if (ce != null) {
				if (ce instanceof AuthenticationException) {
					throw (AuthenticationException) ce;
				} else {
					throw new AuthenticationException(ce.getStatus(), ce.getMessage());
				}
			} else {
				throw new AuthenticationException("500", e.getMessage());
			}
		}
	}

}
