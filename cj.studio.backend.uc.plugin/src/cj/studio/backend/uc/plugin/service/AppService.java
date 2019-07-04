package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.App;
import cj.studio.backend.uc.bo.AppExample;
import cj.studio.backend.uc.plugin.dao.AppMapper;
import cj.studio.backend.uc.service.IAppService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.util.StringUtil;

@CjBridge(aspects = "@transaction")
@CjService(name = "appService")
public class AppService implements IAppService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.AppMapper")
	AppMapper appMapper;

	@CjTransaction
	@Override
	public void addApp(String code, String name, String href, String icon, String tips, String comment)
			throws CircuitException {
		if (StringUtil.isEmpty(code)) {
			throw new EcmException("code为空");
		}
		if (StringUtil.isEmpty(name)) {
			throw new EcmException("name为空");
		}
		if (StringUtil.isEmpty(href)) {
			throw new EcmException("href为空");
		}
		if (StringUtil.isEmpty(icon)) {
			throw new EcmException("icon为空");
		}
		App app = new App();
		app.setCode(code);
		app.setComment(comment);
		app.setHref(href);
		app.setIcon(icon);
		app.setName(name);
		app.setTips(tips);
		appMapper.insertSelective(app);
	}

	@CjTransaction
	@Override
	public void removeApp(String code) {
		AppExample example = new AppExample();
		example.createCriteria().andCodeEqualTo(code);
		appMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public App getApp(String code) {
		AppExample example = new AppExample();
		example.createCriteria().andCodeEqualTo(code);
		List<App> list = appMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public List<App> pageApp(long currPage, int pageSize) {
		return this.appMapper.getPage(currPage, pageSize);
	}

}
