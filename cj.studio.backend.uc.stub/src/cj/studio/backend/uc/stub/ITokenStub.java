package cj.studio.backend.uc.stub;

import java.util.HashMap;
import java.util.Map;

import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/token.service", usage = "令牌存根。验证uc发放的令牌或解析它")
public interface ITokenStub {
	@CjStubMethod(usage = "验证是否是uc发放的令牌")
	@CjStubReturn(type = Boolean.class, usage = "验证结果")
	boolean verify(@CjStubInParameter(key = "token", usage = "令牌") String token);

	@CjStubMethod(usage = "解析令牌")
	@CjStubReturn(type = HashMap.class,elementType= {String.class,Object.class}, usage = "结果")
	Map<String, Object> parse(@CjStubInParameter(key = "token", usage = "令牌") String token);
}
