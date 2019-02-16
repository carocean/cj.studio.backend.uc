package cj.studio.backend.uc.service;

import java.util.Map;

/**
 * 身份认证策略工厂
 * @author caroceanjofers
 *
 */
public interface IAuthenticatorFactory {
	IAuthenticator get(String name);
	String[] enumNames();
	String authenticate(String authName,String principal, String password, Map<String, String> props) throws AuthenticationException;
}
