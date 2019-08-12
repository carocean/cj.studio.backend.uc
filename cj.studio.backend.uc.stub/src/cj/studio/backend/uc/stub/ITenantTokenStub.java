package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.service.AuthenticationException;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

@CjOpenports( usage = "租户令牌生成存根")
public interface ITenantTokenStub extends IOpenportService {
	@CjOpenport(usage = "生成令牌")
	String genToken(@CjOpenportParameter(name = "tenant", usage = "租户") String tenant,
			@CjOpenportParameter(name = "user", usage = "申请者") String user,
			@CjOpenportParameter(name = "pwd", usage = "申请者密码") String pwd,
			@CjOpenportParameter(name = "ttlMillis", usage = "令牌过期日期") long ttlMillis) throws AuthenticationException;
}
