package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.service.IOrganizationService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;

import java.util.List;

@CjService(name = "/tenant/organization.service")
public class OrganizationStub  implements ITenantOrganizationStub {
	@CjServiceRef(refByName = "ucplugin.organizationService")
	IOrganizationService organizationService;

	@Override
	public void removeOrganization(String tenantCode,String orgCode) {
		organizationService.removeOrganization(tenantCode,orgCode);
	}

	@Override
	public Organization getOrganization(String tenantCode,String orgCode) {
		return organizationService.getOrganization(tenantCode,orgCode);
	}

	@Override
	public void addOrganization(String tenantCode, String orgCode, String orgName, String pid, String comment) {
		Organization org=new Organization();
		org.setCode(orgCode);
		org.setName(orgName);
		org.setPid(pid);
		org.setComment(comment);
		org.setTenantcode(tenantCode);
		organizationService.addOrganization(org);
	}

	@Override
	public long getOrganizationCount(String tenantCode) {
		return organizationService.getOrganizationCount();
	}

	@Override
	public List<Organization> listChilds(String tenantCode,String pid) {
		return organizationService.listChilds(tenantCode,pid);
	}

	@Override
	public long childCount(String tenantCode,String pid) {
		return organizationService.childCount(tenantCode,pid);
	}

	@Override
	public List<Account> getAccountsOnOrg(String tenantCode, String orgCode) {
		return organizationService.getAccountsOnOrg(tenantCode,orgCode);
	}

	@Override
	public List<Account> pageAccountsOnOrg(String tenantCode, String orgCode, int currPage, int pageSize) {
		return organizationService.pageAccountsOnOrg(tenantCode,orgCode,currPage,pageSize);
	}

	@Override
	public void addAccountOnOrg(String tenantCode, String accountCode, String orgCode) {
		organizationService.addAccountOnOrg(tenantCode,accountCode,orgCode);
	}

	@Override
	public void removeAccountOnOrg(String tenantCode, String accountCode, String orgCode) {
		organizationService.removeAccountOnOrg(tenantCode,accountCode,orgCode);
	}

	@Override
	public void emptyAccountsOnOrg(String tenantCode, String orgCode) {
		organizationService.emptyAccountsOnOrg(tenantCode,orgCode);
	}

}
