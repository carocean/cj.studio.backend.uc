package cj.studio.backend.uc.service;

import java.util.Map;
/**
 * 实现各种身份认证策略
 * @author caroceanjofers
 *
 */
public interface IAuthenticator {
	AuthenticatorInfo getInfo();
	String authenticate(String principal, String password, Map<String, String> props) throws AuthenticationException;
}
