package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.Attribute;
import cj.studio.backend.uc.bo.AttributeExample;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.SegmentExample;
import cj.studio.backend.uc.plugin.dao.AttributeMapper;
import cj.studio.backend.uc.plugin.dao.SegmentMapper;
import cj.studio.backend.uc.service.ISegmentService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.util.StringUtil;

@CjBridge(aspects = "@transaction")
@CjService(name = "segmentService")
public class SegmentService implements ISegmentService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.SegmentMapper")
	SegmentMapper segmentMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.AttributeMapper")
	AttributeMapper attributeMapper;

	@CjTransaction
	@Override
	public void addSegment(Segment seg) {
		if (seg.getCreatetime() == null) {
			seg.setCreatetime(System.currentTimeMillis());
		}
		segmentMapper.insertSelective(seg);
	}

	@CjTransaction
	@Override
	public void removeSegment(String segCode) {
		SegmentExample example = new SegmentExample();
		example.createCriteria().andCodeEqualTo(segCode);
		segmentMapper.deleteByExample(example);
		emptyAttributesOfSegment(segCode);
	}

	@CjTransaction
	@Override
	public Segment getSegment(String segCode) {
		SegmentExample example = new SegmentExample();
		example.createCriteria().andCodeEqualTo(segCode);
		List<Segment> list = segmentMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public long getSegmentCount() {
		SegmentExample example = new SegmentExample();
		return segmentMapper.countByExample(example);
	}

	@CjTransaction
	@Override
	public List<Segment> getPage(int currPage, int pageSize) {
		return segmentMapper.getPage(currPage, pageSize);
	}

	@CjTransaction
	@Override
	public List<Attribute> getAttributesOfSegment(String segCode) {
		AttributeExample example=new AttributeExample();
		example.createCriteria().andSegcodeEqualTo(segCode);
		return this.attributeMapper.selectByExample(example);
	}

	@CjTransaction
	@Override
	public void emptyAttributesOfSegment(String segCode) {
		AttributeExample example=new AttributeExample();
		example.createCriteria().andSegcodeEqualTo(segCode);
		this.attributeMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void removeAttribute(String segCode, String attrCode) {
		AttributeExample example=new AttributeExample();
		example.createCriteria().andSegcodeEqualTo(segCode).andCodeEqualTo(attrCode);
		this.attributeMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void addAttribute(Attribute attr) {
		if (StringUtil.isEmpty(attr.getCode())) {
			throw new EcmException("code为空");
		}
		if (StringUtil.isEmpty(attr.getSegcode())) {
			throw new EcmException("segcode为空");
		}
		int v = (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
		attr.setSort(v);
		this.attributeMapper.insert(attr);
	}

}
