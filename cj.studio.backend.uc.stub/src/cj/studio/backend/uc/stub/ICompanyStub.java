package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.Company;
import cj.studio.backend.uc.bo.CompanyAttribute;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.ArrayList;
import java.util.List;

@CjOpenports(usage = "公司存根")
public interface ICompanyStub extends IOpenportService {
    @CjOpenport(usage = "添加公司")
    void addCompany(@CjOpenportParameter(name = "companyCode", usage = "公司编码") String companyCode,
                    @CjOpenportParameter(name = "cnname", usage = "公司中文名，非空") String cnname,
                    @CjOpenportParameter(name = "enname", usage = "公司英文名，可空") String enname);

    @CjOpenport(usage = "移除公司")
    void removeCompany(@CjOpenportParameter(name = "companyCode", usage = "公司编码") String companyCode);

    @CjOpenport(usage = "公司信息")
    Company getCompany(@CjOpenportParameter(name = "companyCode", usage = "公司编码") String companyCode);

    @CjOpenport(usage = "公司分页", elementType = ArrayList.class, type = Company.class)
    List<Company> page(@CjOpenportParameter(name = "currPage", usage = "当前页") int currPage,
                       @CjOpenportParameter(name = "pageSize", usage = "页大小") int pageSize);

    @CjOpenport(usage = "添加公司属性")
    void addCompanyAttribute(@CjOpenportParameter(name = "companyCode", usage = "公司编码") String companyCode,
                             @CjOpenportParameter(name = "segCode", usage = "段编码") String segCode,
                             @CjOpenportParameter(name = "attrCode", usage = "属性编码") String attrCode,
                             @CjOpenportParameter(name = "value", usage = "属性值") String value);

    @CjOpenport(usage = "移除公司下指定的属性")
    void removeCompanyAttribute(@CjOpenportParameter(name = "companyCode", usage = "公司编码") String companyCode,
                                @CjOpenportParameter(name = "segCode", usage = "段编码") String segCode,
                                @CjOpenportParameter(name = "attrCode", usage = "属性编码") String attrCode);

    @CjOpenport(usage = "获取公司下指定的属性值")
    String getCompanyAttribute(@CjOpenportParameter(name = "companyCode", usage = "公司编码") String companyCode,
                               @CjOpenportParameter(name = "segCode", usage = "段编码") String segCode,
                               @CjOpenportParameter(name = "attrCode", usage = "属性编码") String attrCode);

    @CjOpenport(usage = "清空公司所有属性")
    void emptyCompanyAttributes(@CjOpenportParameter(name = "companyCode", usage = "公司编码") String companyCode,
                                @CjOpenportParameter(name = "segCode", usage = "段编码") String segCode);

    @CjOpenport(usage = "获取公司属性", type = ArrayList.class, elementType = CompanyAttribute.class)
    List<CompanyAttribute> getCompanyAttributes(@CjOpenportParameter(name = "companyCode", usage = "公司编码") String companyCode,
                                                @CjOpenportParameter(name = "segCode", usage = "段编码") String segCode);


    @CjOpenport(usage = "获取公司段", type = ArrayList.class, elementType = Segment.class)
    List<Segment> getSegmentsOfCompany();

    @CjOpenport(usage = "添加公司段")
    void addSegmentOfCompany(@CjOpenportParameter(name = "segCode", usage = "段编码") String segCode,
                             @CjOpenportParameter(name = "sort", usage = "排序") int sort);

    @CjOpenport(usage = "移除公司段")
    void removeSegmentOfCompany(@CjOpenportParameter(name = "segCode", usage = "段编码") String segCode);

    @CjOpenport(usage = "清空公司段")
    void emptySegmentsOfCompany();
}
