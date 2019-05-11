package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.Company;
import cj.studio.backend.uc.bo.CompanyAttribute;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.service.ICompanyService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;

@CjService(name = "/company.service")
public class CompanyStub extends GatewayAppSiteRestStub implements ICompanyStub {
	@CjServiceRef(refByName = "ucplugin.companyService")
	ICompanyService companyService;

	@Override
	public void addCompany(String companyCode, String cnname, String enname) {
		companyService.addCompany(companyCode, cnname, enname);
	}

	@Override
	public void removeCompany(String companyCode) {
		companyService.removeCompany(companyCode);
	}

	@Override
	public Company getCompany(String companyCode) {
		return companyService.getCompany(companyCode);
	}

	@Override
	public List<Company> page(int currPage, int pageSize) {
		return companyService.page(currPage, pageSize);
	}

	@Override
	public void addCompanyAttribute(String companyCode, String segCode, String attrCode, String value) {
		companyService.addCompanyAttribute(companyCode, segCode, attrCode, value);
	}

	@Override
	public void removeCompanyAttribute(String companyCode, String segCode, String attrCode) {
		companyService.removeCompanyAttribute(companyCode, segCode, attrCode);
	}

	@Override
	public String getCompanyAttribute(String companyCode, String segCode, String attrCode) {
		return companyService.getCompanyAttribute(companyCode, segCode, attrCode);
	}

	@Override
	public void emptyCompanyAttributes(String companyCode, String segCode) {
		companyService.emptyCompanyAttributes(companyCode, segCode);
	}

	@Override
	public List<CompanyAttribute> getCompanyAttributes(String companyCode, String segCode) {
		return companyService.getCompanyAttributes(companyCode, segCode);
	}

	@Override
	public List<Segment> getSegmentsOfCompany() {
		return companyService.getSegmentsOfCompany();
	}

	@Override
	public void addSegmentOfCompany(String segCode, int sort) {
		companyService.addSegmentOfCompany(segCode, sort);
	}

	@Override
	public void removeSegmentOfCompany(String segCode) {
		companyService.removeSegmentOfCompany(segCode);
	}

	@Override
	public void emptySegmentsOfCompany() {
		companyService.emptySegmentsOfCompany();
	}

}
