package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.AppAttribute;
import cj.studio.backend.uc.bo.AppAttributeExample;
import cj.studio.backend.uc.bo.AppSegment;
import cj.studio.backend.uc.bo.AppSegmentExample;
import cj.studio.backend.uc.bo.Application;
import cj.studio.backend.uc.bo.ApplicationExample;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.plugin.dao.AppAttributeMapper;
import cj.studio.backend.uc.plugin.dao.AppSegmentMapper;
import cj.studio.backend.uc.plugin.dao.ApplicationMapper;
import cj.studio.backend.uc.service.IApplicationService;
import cj.studio.backend.uc.service.ISegmentService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.util.StringUtil;

@CjBridge(aspects = "@transaction")
@CjService(name = "applicationService")
public class ApplicationService implements IApplicationService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.ApplicationMapper")
	ApplicationMapper applicationMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.AppSegmentMapper")
	AppSegmentMapper appSegmentMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.AppAttributeMapper")
	AppAttributeMapper appAttributeMapper;
	@CjServiceRef(refByName = "segmentService")
	ISegmentService segmentService;

	@CjTransaction
	@Override
	public void addApp(Application app) {
		if (StringUtil.isEmpty(app.getAppcode())) {
			throw new EcmException("appcode为空");
		}
		app.setCreatetime(System.currentTimeMillis());
		app.setId(null);
		applicationMapper.insertSelective(app);
	}

	@CjTransaction
	@Override
	public void removeApp(String appCode) {
		ApplicationExample example = new ApplicationExample();
		example.createCriteria().andAppcodeEqualTo(appCode);
		applicationMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public Application getApp(String appCode) {
		ApplicationExample example = new ApplicationExample();
		example.createCriteria().andAppcodeEqualTo(appCode);
		List<Application> list = applicationMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public long getAppCount() {
		ApplicationExample example = new ApplicationExample();
		return applicationMapper.countByExample(example);
	}

	@CjTransaction
	@Override
	public List<Application> getPage(int currPage, int pageSize) {
		return this.applicationMapper.getPage(currPage, pageSize);
	}

	@CjTransaction
	@Override
	public List<Segment> getSegmentsOfApp(String appCode) {
		return this.appSegmentMapper.getSegments(appCode);
	}

	@CjTransaction
	@Override
	public void addSegmentOfApp(AppSegment seg) {
		seg.setId(null);
		seg.setSort(Integer.valueOf((int) System.currentTimeMillis() % Integer.MAX_VALUE));
		this.appSegmentMapper.insert(seg);
	}

	@CjTransaction
	@Override
	public void removeSegmentOfApp(String appCode, String segCode) {
		AppSegmentExample example = new AppSegmentExample();
		example.createCriteria().andAppcodeEqualTo(appCode).andSegcodeEqualTo(segCode);
		this.appSegmentMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void emptySegmentsOfApp(String appCode) {
		AppSegmentExample example = new AppSegmentExample();
		example.createCriteria().andAppcodeEqualTo(appCode);
		this.appSegmentMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void addAppAttribute(AppAttribute attr) {
		attr.setId(null);
		if (StringUtil.isEmpty(attr.getAttrcode())) {
			throw new EcmException("属性编码为空");
		}
		if (StringUtil.isEmpty(attr.getAppcode())) {
			throw new EcmException("应用编码为空");
		}
		if (StringUtil.isEmpty(attr.getSegcode())) {
			throw new EcmException("信息段编码为空");
		}
		this.appAttributeMapper.insert(attr);
	}

	@CjTransaction
	@Override
	public void removeAppAttribute(String appCode, String segCode, String attrCode) {
		AppAttributeExample example = new AppAttributeExample();
		example.createCriteria().andAppcodeEqualTo(appCode).andSegcodeEqualTo(segCode).andAttrcodeEqualTo(attrCode);
		this.appAttributeMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void emptyAppAttributes(String appCode, String segCode) {
		AppAttributeExample example = new AppAttributeExample();
		example.createCriteria().andAppcodeEqualTo(appCode).andSegcodeEqualTo(segCode);
		this.appAttributeMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public List<AppAttribute> getAppAttributes(String appCode, String segCode) {
		AppAttributeExample example = new AppAttributeExample();;
		example.createCriteria().andAppcodeEqualTo(appCode).andSegcodeEqualTo(segCode);
		return this.appAttributeMapper.selectByExample(example);
	}

}
