package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.App;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.List;

@CjOpenports(usage = "应用存根")
public interface IAppStub extends IOpenportService {
    @CjOpenport(usage = "添加应用")
    void addApp(@CjOpenportParameter(name = "code", usage = "应用编号") String code,
                @CjOpenportParameter(name = "name", usage = "应用名") String name,
                @CjOpenportParameter(name = "href", usage = "应用地址") String href,
                @CjOpenportParameter(name = "icon", usage = "应用图标") String icon,
                @CjOpenportParameter(name = "tips", usage = "应用提示") String tips,
                @CjOpenportParameter(name = "comment", usage = "应用说明") String comment) throws CircuitException;

    void removeApp(@CjOpenportParameter(name = "code", usage = "应用编号") String code);

    App getApp(@CjOpenportParameter(name = "code", usage = "应用编号") String code);

    List<App> pageApp(@CjOpenportParameter(name = "currPage", usage = "当前页码") long currPage,
                      @CjOpenportParameter(name = "pageSize", usage = "分页大小") int pageSize);

}
