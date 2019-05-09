package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.Company;
import cj.studio.backend.uc.bo.CompanyAttribute;
import cj.studio.gateway.stub.annotation.CjStubInParameter;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubReturn;
import cj.studio.gateway.stub.annotation.CjStubService;

@CjStubService(bindService = "/company.service", usage = "公司存根")
public interface ICompanyStub {
	@CjStubMethod(usage = "添加公司")
	void addCompany(@CjStubInParameter(key = "companyCode", usage = "公司编码") String companyCode,
			@CjStubInParameter(key = "cnname", usage = "公司中文名，非空") String cnname,
			@CjStubInParameter(key = "enname", usage = "公司英文名，可空") String enname);

	@CjStubMethod(usage = "移除公司")
	void removeCompany(@CjStubInParameter(key = "companyCode", usage = "公司编码") String companyCode);

	@CjStubMethod(usage = "公司信息")
	Company getCompany(@CjStubInParameter(key = "companyCode", usage = "公司编码") String companyCode);

	@CjStubMethod(usage = "公司分页")
	@CjStubReturn(elementType = ArrayList.class, type = Company.class, usage = "返回")
	List<Company> page(@CjStubInParameter(key = "currPage", usage = "当前页") int currPage,
			@CjStubInParameter(key = "pageSize", usage = "页大小") int pageSize);

	@CjStubMethod(usage = "添加公司属性")
	void addCompanyAttribute(@CjStubInParameter(key = "companyCode", usage = "公司编码") String companyCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性编码") String attrCode,
			@CjStubInParameter(key = "value", usage = "属性值") String value);

	@CjStubMethod(usage = "移除公司下指定的属性")
	void removeCompanyAttribute(@CjStubInParameter(key = "companyCode", usage = "公司编码") String companyCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性编码") String attrCode);

	@CjStubMethod(usage = "获取公司下指定的属性值")
	String getCompanyAttribute(@CjStubInParameter(key = "companyCode", usage = "公司编码") String companyCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode,
			@CjStubInParameter(key = "attrCode", usage = "属性编码") String attrCode);

	@CjStubMethod(usage = "清空公司所有属性")
	void emptyCompanyAttributes(@CjStubInParameter(key = "companyCode", usage = "公司编码") String companyCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode);

	@CjStubMethod(usage = "获取公司属性")
	@CjStubReturn(type = ArrayList.class, elementType = CompanyAttribute.class, usage = "公司属性")
	List<CompanyAttribute> getUserAttributes(@CjStubInParameter(key = "companyCode", usage = "公司编码") String companyCode,
			@CjStubInParameter(key = "segCode", usage = "段编码") String segCode);

}
