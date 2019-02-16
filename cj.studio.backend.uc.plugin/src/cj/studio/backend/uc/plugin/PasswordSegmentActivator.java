package cj.studio.backend.uc.plugin;

import java.util.List;

import cj.studio.backend.uc.bo.Attribute;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.service.ISegmentService;
import cj.studio.ecm.IEntryPointActivator;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.context.IElement;
import cj.studio.ecm.context.IProperty;

public class PasswordSegmentActivator implements IEntryPointActivator {

	@Override
	public void activate(IServiceSite site, IElement e) {
		IProperty segmentCode = (IProperty) e.getNode("segmentCode");
		IProperty segmentName = (IProperty) e.getNode("segmentName");
		IProperty segmentVersion = (IProperty) e.getNode("segmentVersion");
		ISegmentService ss = (ISegmentService) site.getService("segmentService");
		Segment seg = ss.getSegment(segmentCode.getValue().getName());
		if (seg == null) {
			seg = new Segment();
			seg.setCode(segmentCode.getValue().getName());
			seg.setName(segmentName.getValue().getName());
			seg.setVersion(segmentVersion.getValue().getName());
			ss.addSegment(seg);
		}
		List<Attribute> list = ss.getAttributesOfSegment(seg.getCode());
		if (list.isEmpty()) {
			Attribute attr = new Attribute();
			attr.setCode("password");
			attr.setName("密码");
			attr.setSegcode(seg.getCode());
			attr.setSort(0);
			attr.setType("string");
			ss.addAttribute(attr);
		}
	}

	@Override
	public void inactivate(IServiceSite site) {
	}

}
