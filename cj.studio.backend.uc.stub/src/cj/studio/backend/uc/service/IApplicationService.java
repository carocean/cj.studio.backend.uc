package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.AppAttribute;
import cj.studio.backend.uc.bo.AppSegment;
import cj.studio.backend.uc.bo.Application;
import cj.studio.backend.uc.bo.Segment;

public interface IApplicationService {
	void addApp(Application app);
	void removeApp(String appCode);
	Application getApp(String appCode);
	long getAppCount();
	List<Application> getPage(int currPage, int pageSize);
	List<Segment> getSegmentsOfApp(String appCode);
	void addSegmentOfApp(AppSegment seg);
	void removeSegmentOfApp(String appCode,String segCode);
	void emptySegmentsOfApp(String appCode);
	
	void addAppAttribute(AppAttribute attr);

	void removeAppAttribute(String appCode, String segCode, String attrCode);

	void emptyAppAttributes(String appCode, String segCode);

	List<AppAttribute> getAppAttributes(String appCode, String segCode);
}
