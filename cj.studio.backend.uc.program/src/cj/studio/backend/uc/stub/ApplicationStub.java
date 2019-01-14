package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.AppAttribute;
import cj.studio.backend.uc.bo.AppSegment;
import cj.studio.backend.uc.bo.Application;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.service.IApplicationService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;

@CjService(name = "/application.service")
public class ApplicationStub extends GatewayAppSiteRestStub implements IApplicationStub {
	@CjServiceRef(refByName = "ucplugin.applicationService")
	IApplicationService applicationService;

	@Override
	public void addApp(Application app) {
		applicationService.addApp(app);
	}

	@Override
	public void removeApp(String appCode) {
		applicationService.removeApp(appCode);
	}

	@Override
	public Application getApp(String appCode) {
		return applicationService.getApp(appCode);
	}

	@Override
	public long getAppCount() {
		return applicationService.getAppCount();
	}

	@Override
	public List<Application> getPage(int currPage, int pageSize) {
		return applicationService.getPage(currPage, pageSize);
	}

	@Override
	public List<Segment> getSegmentsOfApp(String appCode) {
		return applicationService.getSegmentsOfApp(appCode);
	}

	@Override
	public void addSegmentOfApp(AppSegment seg) {
		applicationService.addSegmentOfApp(seg);
	}

	@Override
	public void removeSegmentOfApp(String appCode, String segCode) {
		applicationService.removeSegmentOfApp(appCode, segCode);
	}

	@Override
	public void emptySegmentsOfApp(String appCode) {
		applicationService.emptySegmentsOfApp(appCode);
	}

	@Override
	public void addAppAttribute(AppAttribute attr) {
		applicationService.addAppAttribute(attr);
	}

	@Override
	public void removeAppAttribute(String appCode, String segCode, String attrCode) {
		applicationService.removeAppAttribute(appCode, segCode, attrCode);
	}

	@Override
	public void emptyAppAttributes(String appCode, String segCode) {
		applicationService.emptyAppAttributes(appCode, segCode);
	}

	@Override
	public List<AppAttribute> getAppAttributes(String appCode, String segCode) {
		return applicationService.getAppAttributes(appCode, segCode);
	}

}
