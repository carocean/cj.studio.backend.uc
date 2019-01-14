package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.OrgAttribute;
import cj.studio.backend.uc.bo.OrgAttributeExample;
import cj.studio.backend.uc.bo.OrgSegment;
import cj.studio.backend.uc.bo.OrgSegmentExample;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.OrganizationExample;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.plugin.dao.OrgAttributeMapper;
import cj.studio.backend.uc.plugin.dao.OrgSegmentMapper;
import cj.studio.backend.uc.plugin.dao.OrganizationMapper;
import cj.studio.backend.uc.service.IOrganizationService;
import cj.studio.backend.uc.service.ISegmentService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.util.StringUtil;

@CjBridge(aspects = "@transaction")
@CjService(name = "organizationService")
public class OrganizationService implements IOrganizationService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.OrganizationMapper")
	OrganizationMapper organizationMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.OrgSegmentMapper")
	OrgSegmentMapper orgSegmentMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.OrgAttributeMapper")
	OrgAttributeMapper orgAttributeMapper;
	@CjServiceRef(refByName = "segmentService")
	ISegmentService segmentService;

	@CjTransaction
	@Override
	public void addOrganization(Organization org) {
		org.setId(null);
		if (StringUtil.isEmpty(org.getCode())) {
			throw new EcmException("机构编码为空");
		}
		organizationMapper.insertSelective(org);
	}

	@CjTransaction
	@Override
	public void removeOrganization(String orgCode) {
		OrganizationExample example = new OrganizationExample();
		example.createCriteria().andCodeEqualTo(orgCode);
		this.organizationMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public Organization getOrganization(String orgCode) {
		OrganizationExample example = new OrganizationExample();
		example.createCriteria().andCodeEqualTo(orgCode);
		List<Organization> list = organizationMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public long getOrganizationCount() {
		OrganizationExample example = new OrganizationExample();
		return organizationMapper.countByExample(example);
	}

	@CjTransaction
	@Override
	public List<Organization> getPage(int currPage, int pageSize) {
		return organizationMapper.getPage(currPage, pageSize);
	}

	@CjTransaction
	@Override
	public List<Segment> getSegmentsOfOrganization(String orgCode) {
		return this.orgSegmentMapper.getSegments(orgCode);
	}

	@CjTransaction
	@Override
	public void addSegmentOfOrganization(OrgSegment seg) {
		seg.setId(null);
		seg.setSort(Integer.valueOf((int) System.currentTimeMillis() % Integer.MAX_VALUE));
		this.orgSegmentMapper.insert(seg);
	}

	@CjTransaction
	@Override
	public void removeSegmentOfOrganization(String orgCode, String segCode) {
		OrgSegmentExample example = new OrgSegmentExample();
		example.createCriteria().andOrgcodeEqualTo(orgCode).andSegcodeEqualTo(segCode);
		this.orgSegmentMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void emptySegmentsOfOrganization(String orgCode) {
		OrgSegmentExample example = new OrgSegmentExample();
		example.createCriteria().andOrgcodeEqualTo(orgCode);
		this.orgSegmentMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void addOrganizationAttribute(OrgAttribute attr) {
		attr.setId(null);
		if (StringUtil.isEmpty(attr.getAttrcode())) {
			throw new EcmException("属性编码为空");
		}
		if (StringUtil.isEmpty(attr.getOrgcode())) {
			throw new EcmException("账户编码为空");
		}
		if (StringUtil.isEmpty(attr.getSegcode())) {
			throw new EcmException("信息段编码为空");
		}
		this.orgAttributeMapper.insert(attr);
	}
	@CjTransaction
	@Override
	public void removeOrganizationAttribute(String orgCode, String segCode, String attrCode) {
		OrgAttributeExample example = new OrgAttributeExample();
		example.createCriteria().andOrgcodeEqualTo(orgCode).andSegcodeEqualTo(segCode)
				.andAttrcodeEqualTo(attrCode);
		this.orgAttributeMapper.deleteByExample(example);
	}
	@CjTransaction
	@Override
	public void emptyOrganizationAttributes(String orgCode, String segCode) {
		OrgAttributeExample example = new OrgAttributeExample();
		example.createCriteria().andOrgcodeEqualTo(orgCode).andSegcodeEqualTo(segCode);
		this.orgAttributeMapper.deleteByExample(example);
	}
	@CjTransaction
	@Override
	public List<OrgAttribute> getOrganizationAttributes(String orgCode, String segCode) {
		OrgAttributeExample example = new OrgAttributeExample();
		example.createCriteria().andOrgcodeEqualTo(orgCode).andSegcodeEqualTo(segCode);
		return this.orgAttributeMapper.selectByExample(example);
	}

}