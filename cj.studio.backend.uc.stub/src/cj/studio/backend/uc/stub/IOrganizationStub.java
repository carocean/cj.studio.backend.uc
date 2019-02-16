package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.OrgAttribute;
import cj.studio.backend.uc.bo.OrgSegment;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.User;
import cj.studio.gateway.stub.annotation.CjStubInContentKey;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/organization.service", usage = "机构存根")
public interface IOrganizationStub {
	@CjStubMethod(command = "post", usage = "添加机构")
	void addOrganization(@CjStubInContentKey(key = "org", usage = "机构json") Organization org);

	@CjStubMethod(usage = "移除机构")
	void removeOrganization(@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(usage = "获取机构")
	Organization getOrganization(@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(usage = "获取机构数")
	long getOrganizationCount();

	@CjStubMethod(usage = "获取一页机构")
	@CjStubReturn(type = ArrayList.class,elementType=Organization.class, usage = "返回机构集合")
	List<Organization> getPage(@CjStubInParameter(key = "currPage", usage = "当前页码") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "获取机构信息段")
	@CjStubReturn(type = ArrayList.class,elementType=Segment.class, usage = "返回机构段集合")
	List<Segment> getSegmentsOfOrganization(@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(command = "post", usage = "添加机构信息段")
	void addSegmentOfOrganization(@CjStubInContentKey(key = "seg", usage = "机构信息段json") OrgSegment seg);

	@CjStubMethod(usage = "移除机构信息段")
	void removeSegmentOfOrganization(@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode,
			@CjStubInParameter(key = "segCode", usage = "段代码") String segCode);

	@CjStubMethod(usage = "清空机构下的所有信息段")
	void emptySegmentsOfOrganization(@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(command = "post", usage = "添加机构属性")
	void addOrganizationAttribute(@CjStubInContentKey(key = "attr", usage = "机构属性json") OrgAttribute attr);

	@CjStubMethod(usage = "移除机构属性")
	void removeOrganizationAttribute(@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode,
			@CjStubInParameter(key = "segCode", usage = "段代码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性代码") String attrCode);

	@CjStubMethod(usage = "清空机构信息段下的所有属性")
	void emptyOrganizationAttributes(@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode,
			@CjStubInParameter(key = "segCode", usage = "段代码") String segCode);

	@CjStubMethod(usage = "获取机构属性")
	@CjStubReturn(type = ArrayList.class,elementType=OrgAttribute.class, usage = "返回属性集合")
	List<OrgAttribute> getOrganizationAttributes(@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode,
			@CjStubInParameter(key = "segCode", usage = "段代码") String segCode);

	@CjStubMethod(usage = "添加机构成员")
	void addOrgMember(@CjStubInParameter(key = "appCode", usage = "应用代码") String appCode,
			@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(usage = "移除机构成员")
	void removeOrgMember(@CjStubInParameter(key = "appCode", usage = "应用代码") String appCode,
			@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(usage = "清空机构成员")
	void emptyOrgMembers(@CjStubInParameter(key = "appCode", usage = "应用代码") String appCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(usage = "获取机构成员")
	@CjStubReturn(type = ArrayList.class,elementType=User.class, usage = "返回成员列表")
	List<User> getOrgMembers(@CjStubInParameter(key = "appCode", usage = "应用代码") String appCode,
			@CjStubInParameter(key = "orgCode", usage = "机构代码") String orgCode);

	@CjStubMethod(usage = "获取机构成员")
	@CjStubReturn(type = ArrayList.class,elementType=Organization.class, usage = "返回机构列表")
	List<Organization> getOrganizationsOfUser(@CjStubInParameter(key = "appCode", usage = "应用代码") String appCode,
			@CjStubInParameter(key = "userCode", usage = "用户代码") String userCode);
}
