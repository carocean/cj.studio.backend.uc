package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Organization;

public interface IOrganizationService {
	void addOrganization(Organization org);

	void removeOrganization(String tenantCode,String orgCode);

	Organization getOrganization(String tenantCode,String orgCode);

	long getOrganizationCount();

	List<Organization> getPage(int currPage, int pageSize);

	List<Organization> listChilds(String tenantCode,String pid);

	long childCount(String tenantCode,String pid);

	List<Account> getAccountsOnOrg(String tenantCode, String orgCode);

	List<Account> pageAccountsOnOrg(String tenantCode, String orgCode, int currPage, int pageSize);

	void addAccountOnOrg(String tenantCode, String accountCode, String orgCode);

	void removeAccountOnOrg(String tenantCode, String accountCode, String orgCode);

	void emptyAccountsOnOrg(String tenantCode, String orgCode);


}
