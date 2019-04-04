package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.Tenant;
import cj.studio.backend.uc.bo.TenantAttribute;
import cj.studio.backend.uc.bo.TenantAttributeExample;
import cj.studio.backend.uc.bo.TenantExample;
import cj.studio.backend.uc.bo.TenantSegment;
import cj.studio.backend.uc.bo.TenantSegmentExample;
import cj.studio.backend.uc.plugin.dao.TenantAttributeMapper;
import cj.studio.backend.uc.plugin.dao.TenantMapper;
import cj.studio.backend.uc.plugin.dao.TenantSegmentMapper;
import cj.studio.backend.uc.service.ISegmentService;
import cj.studio.backend.uc.service.ITenantService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.util.StringUtil;

@CjBridge(aspects = "@transaction")
@CjService(name = "tenantService")
public class TenantService implements ITenantService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.TenantMapper")
	TenantMapper tenantMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.TenantSegmentMapper")
	TenantSegmentMapper tenantSegmentMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.TenantAttributeMapper")
	TenantAttributeMapper tenantAttributeMapper;
	@CjServiceRef(refByName = "segmentService")
	ISegmentService segmentService;

	@CjTransaction
	@Override
	public void addTenant(Tenant tenant) {
		if (StringUtil.isEmpty(tenant.getCode())) {
			throw new EcmException("appcode为空");
		}
		tenant.setCreatetime(System.currentTimeMillis());
		tenant.setId(null);
		tenantMapper.insertSelective(tenant);
	}

	@CjTransaction
	@Override
	public void removeTenant(String tenantCode) {
		TenantExample example = new TenantExample();
		example.createCriteria().andCodeEqualTo(tenantCode);
		tenantMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public Tenant getTenant(String tenantCode) {
		TenantExample example = new TenantExample();
		example.createCriteria().andCodeEqualTo(tenantCode);
		List<Tenant> list = tenantMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public long getAppCount() {
		TenantExample example = new TenantExample();
		return tenantMapper.countByExample(example);
	}

	@CjTransaction
	@Override
	public List<Tenant> getPage(int currPage, int pageSize) {
		return this.tenantMapper.getPage(currPage, pageSize);
	}

	@CjTransaction
	@Override
	public List<Segment> getSegmentsOfTenant(String tenantCode) {
		return this.tenantSegmentMapper.getSegments(tenantCode);
	}

	@CjTransaction
	@Override
	public void addSegmentOfTenant(TenantSegment seg) {
		seg.setId(null);
		seg.setSort(Integer.valueOf((int) System.currentTimeMillis() % Integer.MAX_VALUE));
		this.tenantSegmentMapper.insert(seg);
	}

	@CjTransaction
	@Override
	public void removeSegmentOfTenant(String tenantCode, String segCode) {
		TenantSegmentExample example = new TenantSegmentExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andSegcodeEqualTo(segCode);
		this.tenantSegmentMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void emptySegmentsOfTenant(String tenantCode) {
		TenantSegmentExample example = new TenantSegmentExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode);
		this.tenantSegmentMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void addTenantAttribute(TenantAttribute attr) {
		attr.setId(null);
		if (StringUtil.isEmpty(attr.getAttrcode())) {
			throw new EcmException("属性编码为空");
		}
		if (StringUtil.isEmpty(attr.getTenantcode())) {
			throw new EcmException("应用编码为空");
		}
		if (StringUtil.isEmpty(attr.getSegcode())) {
			throw new EcmException("信息段编码为空");
		}
		this.tenantAttributeMapper.insert(attr);
	}

	@CjTransaction
	@Override
	public void removeTenantAttribute(String tenantCode, String segCode, String attrCode) {
		TenantAttributeExample example = new TenantAttributeExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andSegcodeEqualTo(segCode).andAttrcodeEqualTo(attrCode);
		this.tenantAttributeMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void emptyTenantAttributes(String tenantCode, String segCode) {
		TenantAttributeExample example = new TenantAttributeExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andSegcodeEqualTo(segCode);
		this.tenantAttributeMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public List<TenantAttribute> getTenantAttributes(String tenantCode, String segCode) {
		TenantAttributeExample example = new TenantAttributeExample();;
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andSegcodeEqualTo(segCode);
		return this.tenantAttributeMapper.selectByExample(example);
	}

}
