package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.service.AuthenticationException;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/tenantToken.service", usage = "租户令牌生成存根")
public interface ITenantTokenStub {
	@CjStubMethod(usage = "生成令牌")
	String genToken(@CjStubInParameter(key = "tenant", usage = "租户") String tenant,
			@CjStubInParameter(key = "user", usage = "申请者") String user,
			@CjStubInParameter(key = "pwd", usage = "申请者密码") String pwd,
			@CjStubInParameter(key = "ttlMillis", usage = "令牌过期日期") long ttlMillis) throws AuthenticationException;
}
