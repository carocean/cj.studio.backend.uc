package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.Attribute;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.service.ISegmentService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;

import java.util.List;

@CjService(name = "/segment.service")
public class SegmentStub implements ISegmentStub {
	@CjServiceRef(refByName="ucplugin.segmentService")
	ISegmentService segmentService;
	@Override
	public void addSegment(String segCode, String segName, String version) {
		Segment seg=new Segment();
		seg.setCode(segCode);
		seg.setName(segName);
		seg.setVersion(version);
		seg.setCreatetime(System.currentTimeMillis());
		this.segmentService.addSegment(seg);
	}

	@Override
	public void removeSegment(String segCode) {
		this.segmentService.removeSegment(segCode);
	}

	@Override
	public Segment getSegment(String segCode) {
		return this.segmentService.getSegment(segCode);
	}

	@Override
	public long getSegmentCount() {
		return this.segmentService.getSegmentCount();
	}

	@Override
	public List<Segment> getPage(int currPage, int pageSize) {
		return this.segmentService.getPage(currPage, pageSize);
	}

	@Override
	public List<Attribute> getAttributesOfSegment(String segCode) {
		return this.segmentService.getAttributesOfSegment(segCode);
	}

	@Override
	public void emptyAttributesOfSegment(String segCode) {
		this.segmentService.emptyAttributesOfSegment(segCode);
	}

	@Override
	public void removeAttribute(String segCode, String attrCode) {
		this.segmentService.removeAttribute(segCode, attrCode);
		
	}
	@Override
	public void addAttribute(String attrCode, String attrName, String segCode, String type, int sort) {
		Attribute attr=new Attribute();
		attr.setCode(attrCode);
		attr.setName(attrName);
		attr.setSegcode(segCode);
		attr.setSort(sort);
		attr.setType(type);
		this.segmentService.addAttribute(attr);
	}
	
}
