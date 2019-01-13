package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.AppSegment;
import cj.studio.backend.uc.bo.Application;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.gateway.stub.annotation.CjStubInContentKey;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/application.service", usage = "应用存根")
public interface IApplicationStub {
	@CjStubMethod(command = "post", usage = "添加app")
	void addApp(@CjStubInContentKey(key = "app", usage = "应用实例，json") Application app);

	@CjStubMethod(command = "post", usage = "移除app")
	void removeApp(@CjStubInContentKey(key = "appCode", usage = "应用编码") String appCode);

	@CjStubMethod(command = "post", usage = "获取app")
	@CjStubReturn(type = Application.class, usage = "返回应用")
	Application getApp(@CjStubInContentKey(key = "appCode", usage = "应用编码") String appCode);

	@CjStubMethod(usage = "获取应用数")
	long getAppCount();

	@CjStubMethod(command = "post", usage = "获取一页")
	@CjStubReturn(type = ArrayList.class, usage = "返回")
	List<Application> getPage(@CjStubInContentKey(key = "currPage", usage = "当前页") int currPage,
			@CjStubInContentKey(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(command = "post", usage = "获取应用的信息段")
	@CjStubReturn(type = ArrayList.class, usage = "返回")
	List<Segment> getSegmentsOfApp(@CjStubInContentKey(key = "appCode", usage = "应用编码") String appCode);

	@CjStubMethod(command = "post", usage = "为应用添加扩展信息段")
	void addSegmentOfApp(@CjStubInContentKey(key = "seg", usage = "信息段")AppSegment seg);

	@CjStubMethod(command = "post", usage = "移除应用指定关联的信息段")
	void removeSegmentOfApp(@CjStubInContentKey(key = "appCode", usage = "应用编码") String appCode,
			@CjStubInContentKey(key = "segCode", usage = "信息段编码") String segCode);

	@CjStubMethod(command = "post", usage = "清空该应用的信息段")
	void emptySegmentsOfApp(@CjStubInContentKey(key = "appCode", usage = "应用编码") String appCode);
}
