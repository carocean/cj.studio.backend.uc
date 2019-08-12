package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.service.ITokenService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.ultimate.gson2.com.google.gson.Gson;
import cj.ultimate.gson2.com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;
@CjService(name="/token.service")
public class TokenStub  implements ITokenStub{
	@CjServiceRef(refByName = "ucplugin.tokenService")
	ITokenService tokenService;
	@Override
	public boolean verify(String token) {
		return tokenService.verify(token);
	}

	@Override
	public Map<String, Object> parse(String token) {
		String json=tokenService.parseToken(token);
		
		return new Gson().fromJson(json, new TypeToken<HashMap<String,Object>>(){}.getType());
	}

}
