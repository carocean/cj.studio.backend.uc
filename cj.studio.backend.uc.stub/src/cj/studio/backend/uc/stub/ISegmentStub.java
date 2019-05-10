package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Attribute;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/segment.service", usage = "信息段存根")
public interface ISegmentStub {
	@CjStubMethod(usage = "添加信息段")
	void addSegment(@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode,
			@CjStubInParameter(key = "segName", usage = "信息段名") String segName,
			@CjStubInParameter(key = "version", usage = "信息段版本") String version);

	@CjStubMethod(usage = "删除信息段")
	void removeSegment(@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode);

	@CjStubMethod(usage = "获取信息段")
	@CjStubReturn(type = Segment.class, usage = "返回信息段")
	Segment getSegment(@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode);

	@CjStubMethod(usage = "获取段个数")
	@CjStubReturn(type = Long.class, usage = "返回段个数")
	long getSegmentCount();

	@CjStubMethod(usage = "获取一页信息段")
	@CjStubReturn(type = ArrayList.class, elementType = Segment.class, usage = "返回一页段")
	List<Segment> getPage(@CjStubInParameter(key = "currPage", usage = "当前页位置") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "分页大小") int pageSize);

	@CjStubMethod(usage = "获取段属性")
	@CjStubReturn(type = ArrayList.class, elementType = Attribute.class, usage = "属性集合")
	List<Attribute> getAttributesOfSegment(@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode);

	@CjStubMethod(usage = "置空段的所有属性")
	void emptyAttributesOfSegment(@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode);

	@CjStubMethod(usage = "移除一个属性")
	void removeAttribute(@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性编码") String attrCode);

	@CjStubMethod(usage = "添加属性")
	void addAttribute(@CjStubInParameter(key = "attrCode", usage = "属性编码") String attrCode,
			@CjStubInParameter(key = "attrName", usage = "属性名") String attrName,
			@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode,
			@CjStubInParameter(key = "type", usage = "属性数据类型") String type,
			@CjStubInParameter(key = "sort", usage = "属性顺序") int sort);
}
