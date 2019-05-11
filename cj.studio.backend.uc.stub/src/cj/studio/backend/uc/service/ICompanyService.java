package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.Company;
import cj.studio.backend.uc.bo.CompanyAttribute;
import cj.studio.backend.uc.bo.Segment;

public interface ICompanyService {

	void addCompany(String companyCode, String cnname, String enname);

	void removeCompany(String companyCode);

	Company getCompany(String companyCode);

	List<Company> page(int currPage, int pageSize);

	void addCompanyAttribute(String companyCode, String segCode, String attrCode, String value);

	void removeCompanyAttribute(String companyCode, String segCode, String attrCode);

	String getCompanyAttribute(String companyCode, String segCode, String attrCode);

	void emptyCompanyAttributes(String companyCode, String segCode);

	List<CompanyAttribute> getCompanyAttributes(String companyCode, String segCode);

	List<Segment> getSegmentsOfCompany();

	void addSegmentOfCompany(String segCode, int sort);

	void removeSegmentOfCompany(String segCode);

	void emptySegmentsOfCompany();

}
