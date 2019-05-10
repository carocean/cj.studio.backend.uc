package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.Company;
import cj.studio.backend.uc.bo.CompanyAttribute;
import cj.studio.ecm.annotation.CjService;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;

@CjService(name = "/company.service")
public class CompanyStub extends GatewayAppSiteRestStub implements ICompanyStub {

	@Override
	public void addCompany(String companyCode, String cnname, String enname) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeCompany(String companyCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public Company getCompany(String companyCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> page(int currPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCompanyAttribute(String companyCode, String segCode, String attrCode, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeCompanyAttribute(String companyCode, String segCode, String attrCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCompanyAttribute(String companyCode, String segCode, String attrCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emptyCompanyAttributes(String companyCode, String segCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<CompanyAttribute> getUserAttributes(String companyCode, String segCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
