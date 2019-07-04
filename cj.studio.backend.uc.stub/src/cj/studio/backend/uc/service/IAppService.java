package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.App;
import cj.studio.ecm.net.CircuitException;

public interface IAppService {
	
	void addApp(String code,String name,String href,String icon,String tips,String comment)throws CircuitException;
	void removeApp(String code);
	App getApp(String code);
	List<App> pageApp(long currPage,int pageSize);
	
}
