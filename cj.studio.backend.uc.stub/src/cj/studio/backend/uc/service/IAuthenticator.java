package cj.studio.backend.uc.service;

/**
 * 实现各种身份认证策略
 * @author caroceanjofers
 *
 */
public interface IAuthenticator {
	AuthenticatorInfo getInfo();
	String authenticate(String tenant,String principal, String password,  long ttlMillis) throws AuthenticationException;
}
