package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.App;
import cj.studio.ecm.net.CircuitException;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/app.service", usage = "应用存根")
public interface IAppStub {
	@CjStubMethod(usage = "添加应用")
	void addApp(@CjStubInParameter(key = "code", usage = "应用编号") String code,
			@CjStubInParameter(key = "name", usage = "应用名") String name,
			@CjStubInParameter(key = "href", usage = "应用地址") String href,
			@CjStubInParameter(key = "icon", usage = "应用图标") String icon,
			@CjStubInParameter(key = "tips", usage = "应用提示") String tips,
			@CjStubInParameter(key = "comment", usage = "应用说明") String comment) throws CircuitException;

	void removeApp(@CjStubInParameter(key = "code", usage = "应用编号") String code);

	App getApp(@CjStubInParameter(key = "code", usage = "应用编号") String code);

	List<App> pageApp(@CjStubInParameter(key = "currPage", usage = "当前页码") long currPage,
			@CjStubInParameter(key = "pageSize", usage = "分页大小") int pageSize);

}
