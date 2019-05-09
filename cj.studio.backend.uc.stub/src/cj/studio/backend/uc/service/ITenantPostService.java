package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantPost;

public interface ITenantPostService {

	void addPost(TenantPost post);

	TenantPost getPost(String tenantCode, String postCode);

	void removePost(String tenantCode, String postCode);

	List<TenantPost> pagePost(String tenantCode, int currPage, int pageSize);

	List<Account> getAccountsOnPost(String tenantCode, String postCode);

	List<Account> pageAccountsOnPost(String tenantCode, String postCode, int currPage, int pageSize);

	void addAccountOnPost(String tenantCode, String accountCode, String postCode);

	void removeAccountOnPost(String tenantCode, String accountCode, String postCode);

	void emptyAccountsOnPost(String tenantCode, String postCode);
	

}
