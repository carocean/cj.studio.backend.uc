package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.App;
import cj.studio.backend.uc.service.IAppService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;

@CjService(name = "/app.service")
public class AppStub implements IAppStub {
    @CjServiceRef(refByName = "ucplugin.appService")
    IAppService appService;

    public void addApp(String code, String name, String href, String icon, String tips, String comment)
            throws CircuitException {
        appService.addApp(code, name, href, icon, tips, comment);
    }

    @Override
    public void removeApp(String code) {
        appService.removeApp(code);
    }

    @Override
    public App getApp(String code) {
        return appService.getApp(code);
    }

    @Override
    public List<App> pageApp(long currPage, int pageSize) {
        return appService.pageApp(currPage, pageSize);
    }

}
