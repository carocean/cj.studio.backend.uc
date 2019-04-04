package cj.studio.backend.uc.service;

/**
 * 身份认证策略工厂
 * @author caroceanjofers
 *
 */
public interface IAuthenticatorFactory {
	IAuthenticator get(String name);
	String[] enumNames();
	String authenticate(String authName,String tenant,String principal, String password, long ttlMillis) throws AuthenticationException;
}
