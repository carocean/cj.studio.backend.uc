package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.service.AuthenticatorInfo;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/authentication.service", usage = "身份认证服务")
public interface IAuthenticationStub {
	@CjStubMethod(usage = "列出支持的认证器名")
	String[] enumAuthenticatorNames();

	@CjStubMethod(usage = "获取认证器信息")
	AuthenticatorInfo getAuthenticatorInfo(@CjStubInParameter(key = "authName", usage = "认证器名") String authName);

	@CjStubMethod(usage = "认证指定主体的身份")
	String authenticate(@CjStubInParameter(key = "authName", usage = "认证器名") String authName,
			@CjStubInParameter(key = "tenant", usage = "租户或租户令牌")String tenant,
			@CjStubInParameter(key = "principals", usage = "要认证的主体，可以是用户名，也可是令牌(如果是令牌：结合password以认证令牌是密码持有者的）") String principals,
			@CjStubInParameter(key = "password", usage = "密码") String password,
			@CjStubInParameter(key = "ttlMillis",usage = "令牌过期时间")  long ttlMillis);
}
