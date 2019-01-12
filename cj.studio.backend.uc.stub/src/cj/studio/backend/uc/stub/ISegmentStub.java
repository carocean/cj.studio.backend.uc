package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Attribute;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.gateway.stub.annotation.CjStubInContentKey;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/segment.service", usage = "信息段存根")
public interface ISegmentStub {
	@CjStubMethod(command = "post", usage = "添加信息段")
	void addSegment(@CjStubInContentKey(key="seg",usage = "信息段实体，Json格式") Segment seg);

	@CjStubMethod(usage = "删除信息段")
	void removeSegment(@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode);

	@CjStubMethod(usage = "获取信息段")
	@CjStubReturn(type = Segment.class, usage = "返回信息段")
	Segment getSegment(@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode);

	@CjStubMethod(usage = "获取段个数")
	@CjStubReturn(type = Long.class, usage = "返回段个数")
	long getSegmentCount();

	@CjStubMethod(usage = "获取一页信息段", command = "post")
	@CjStubReturn(type = ArrayList.class, usage = "返回一页段")
	List<Segment> getPage(@CjStubInContentKey(key = "currPage", usage = "当前页位置") int currPage,
			@CjStubInContentKey(key = "pageSize", usage = "分页大小") int pageSize);

	@CjStubMethod(usage = "获取段属性")
	@CjStubReturn(type = ArrayList.class, usage = "属性集合")
	List<Attribute> getAttributesOfSegment(@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode);

	@CjStubMethod(usage = "置空段的所有属性")
	void emptyAttributesOfSegment(@CjStubInParameter(key = "segCode", usage = "信息段编码") String segCode);

	@CjStubMethod(usage = "移除一个属性", command = "post")
	void removeAttribute(@CjStubInContentKey(key = "segCode", usage = "信息段编码") String segCode,
			@CjStubInContentKey(key = "attrCode", usage = "属性编码") String attrCode);

	@CjStubMethod(command = "post", usage = "添加属性")
	void addAttribute(@CjStubInContentKey(key="attr",usage = "属性实体，Json格式") Attribute attr);
}
