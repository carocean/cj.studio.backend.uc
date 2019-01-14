package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.AccountAttribute;
import cj.studio.backend.uc.bo.AccountSegment;
import cj.studio.backend.uc.bo.Segment;

public interface IAccountService {
	void addAccount(Account account);

	void removeAccount(String accountCode);

	Account getAccount(String accountCode);

	long getAccountCount();

	List<Account> getPage(int currPage, int pageSize);

	List<Segment> getSegmentsOfAccount(String accountCode);

	void addSegmentOfAccount(AccountSegment seg);

	void removeSegmentOfAccount(String accountCode, String segCode);

	void emptySegmentsOfAccount(String accountCode);

	void addAccountAttribute(AccountAttribute attr);

	void removeAccountAttribute(String accountCode, String segCode, String attrCode);

	void emptyAccountAttributes(String accountCode, String segCode);

	List<AccountAttribute> getAccountAttributes(String accountCode, String segCode);

}
