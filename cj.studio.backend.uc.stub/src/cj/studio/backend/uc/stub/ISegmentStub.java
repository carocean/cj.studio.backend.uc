package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.Attribute;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.ArrayList;
import java.util.List;

@CjOpenports(usage = "信息段存根")
public interface ISegmentStub extends IOpenportService {
	@CjOpenport(usage = "添加信息段")
	void addSegment(@CjOpenportParameter(name ="segCode", usage = "信息段编码") String segCode,
			@CjOpenportParameter(name ="segName", usage = "信息段名") String segName,
			@CjOpenportParameter(name ="version", usage = "信息段版本") String version);

	@CjOpenport(usage = "删除信息段")
	void removeSegment(@CjOpenportParameter(name ="segCode", usage = "信息段编码") String segCode);

	@CjOpenport(usage = "获取信息段",type = Segment.class)
	Segment getSegment(@CjOpenportParameter(name ="segCode", usage = "信息段编码") String segCode);

	@CjOpenport(type = Long.class,usage = "获取段个数")
	long getSegmentCount();

	@CjOpenport(type = ArrayList.class, elementType = Segment.class,usage = "获取一页信息段")
	List<Segment> getPage(@CjOpenportParameter(name ="currPage", usage = "当前页位置") int currPage,
			@CjOpenportParameter(name ="pageSize", usage = "分页大小") int pageSize);

	@CjOpenport(type = ArrayList.class, elementType = Attribute.class,usage = "获取段属性")
	List<Attribute> getAttributesOfSegment(@CjOpenportParameter(name ="segCode", usage = "信息段编码") String segCode);

	@CjOpenport(usage = "置空段的所有属性")
	void emptyAttributesOfSegment(@CjOpenportParameter(name ="segCode", usage = "信息段编码") String segCode);

	@CjOpenport(usage = "移除一个属性")
	void removeAttribute(@CjOpenportParameter(name ="segCode", usage = "信息段编码") String segCode,
			@CjOpenportParameter(name ="attrCode", usage = "属性编码") String attrCode);

	@CjOpenport(usage = "添加属性")
	void addAttribute(@CjOpenportParameter(name ="attrCode", usage = "属性编码") String attrCode,
			@CjOpenportParameter(name ="attrName", usage = "属性名") String attrName,
			@CjOpenportParameter(name ="segCode", usage = "信息段编码") String segCode,
			@CjOpenportParameter(name ="type", usage = "属性数据类型") String type,
			@CjOpenportParameter(name ="sort", usage = "属性顺序") int sort);
}
