package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.service.AuthenticatorInfo;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

@CjOpenports(usage = "身份认证服务")
public interface IAuthenticationStub extends IOpenportService {
	@CjOpenport(usage = "列出支持的认证器名")
	String[] enumAuthenticatorNames();

	@CjOpenport(usage = "获取认证器信息")
	AuthenticatorInfo getAuthenticatorInfo(@CjOpenportParameter(name = "authName", usage = "认证器名") String authName);

	@CjOpenport(usage = "认证指定主体的身份")
	String authenticate(@CjOpenportParameter(name = "authName", usage = "认证器名") String authName,
			@CjOpenportParameter(name = "tenant", usage = "租户或租户令牌")String tenant,
			@CjOpenportParameter(name = "principals", usage = "要认证的主体，可以是用户名，也可是令牌(如果是令牌：结合password以认证令牌是密码持有者的）") String principals,
			@CjOpenportParameter(name = "password", usage = "密码") String password,
			@CjOpenportParameter(name = "ttlMillis",usage = "令牌过期时间")  long ttlMillis);
}
