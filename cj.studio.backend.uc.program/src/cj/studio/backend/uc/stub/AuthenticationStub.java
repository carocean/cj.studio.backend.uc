package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.service.AuthenticationException;
import cj.studio.backend.uc.service.AuthenticatorInfo;
import cj.studio.backend.uc.service.IAuthenticator;
import cj.studio.backend.uc.service.IAuthenticatorFactory;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.ultimate.gson2.com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

@CjService(name = "/authentication.service")
public class AuthenticationStub implements IAuthenticationStub {
    @CjServiceRef(refByName = "ucplugin.authenticatorFactory")
    IAuthenticatorFactory facotry;

    @Override
    public String[] enumAuthenticatorNames() {
        return facotry.enumNames();
    }

    @Override
    public String authenticate(String authName, String tenant, String principals, String password, long ttlMillis) throws AuthenticationException{
        return facotry.authenticate(authName, tenant, principals, password, ttlMillis);
    }

    @Override
    public AuthenticatorInfo getAuthenticatorInfo(String authName) {
        IAuthenticator auth = facotry.get(authName);
        if (auth == null) {
            return null;
        }

        return auth.getInfo();
    }

}
