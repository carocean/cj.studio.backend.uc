package cj.studio.backend.uc.stub;

import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.HashMap;
import java.util.Map;

@CjOpenports(usage = "令牌存根。验证uc发放的令牌或解析它")
public interface ITokenStub extends IOpenportService {
    @CjOpenport(usage = "验证是否是uc发放的令牌", type = Boolean.class)
    boolean verify(@CjOpenportParameter(name = "token", usage = "令牌") String token);

    @CjOpenport(usage = "解析令牌", type = HashMap.class, elementType = {String.class, Object.class})
    Map<String, Object> parse(@CjOpenportParameter(name = "token", usage = "令牌") String token);
}
