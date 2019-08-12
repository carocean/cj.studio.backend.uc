package cj.studio.backend.uc.stub;

import cj.studio.backend.uacc.security.ProtectedObject;
import cj.studio.backend.uacc.security.ProtectedObjectCollection;
import cj.studio.backend.uacc.security.stub.IProtectedObjectStub;
import cj.studio.backend.uc.service.IGlobalRoleService;
import cj.studio.backend.uc.service.IUserService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;

import java.util.List;
import java.util.Map;

@CjService(name = "/protectedObject.service")
public class ProtectedObjectStub implements IProtectedObjectStub {
    Map<String, ProtectedObjectCollection> tables;
    @CjServiceRef(refByName = "ucplugin.userService")
    IUserService userService;
    @CjServiceRef(refByName = "ucplugin.roleService")
    IGlobalRoleService roleService;
    List<ProtectedObject> ucServices;

    @Override
    public List<ProtectedObject> getChildObjects(String sysCode, String objColName, String parentObjCode, int currPage, int pageSize) {
        return null;
    }

    @Override
    public List<ProtectedObjectCollection> getAllProtectedObjectCollection(String sysCode) {
        return null;
    }

    @Override
    public ProtectedObjectCollection getProtectedObjectCollection(String sysCode, String objColName) {
        return null;
    }
}
