package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.AccountAttribute;
import cj.studio.backend.uc.bo.AccountSegment;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.service.IAccountService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;

@CjService(name = "/account.service")
public class AccountStub extends GatewayAppSiteRestStub implements IAccountStub {
	@CjServiceRef(refByName = "ucplugin.accountService")
	IAccountService accountService;

	@Override
	public void addAccount(Account account) {
		this.accountService.addAccount(account);
	}

	@Override
	public void removeAccount(String accountCode) {
		this.accountService.removeAccount(accountCode);
	}

	@Override
	public Account getAccount(String accountCode) {
		return this.accountService.getAccount(accountCode);
	}

	@Override
	public long getAccountCount() {
		return this.accountService.getAccountCount();
	}

	@Override
	public List<Account> getPage(int currPage, int pageSize) {
		return this.accountService.getPage(currPage, pageSize);
	}

	@Override
	public List<Segment> getSegmentsOfAccount(String accountCode) {
		return accountService.getSegmentsOfAccount(accountCode);
	}

	@Override
	public void addSegmentOfAccount(AccountSegment seg) {
		this.accountService.addSegmentOfAccount(seg);
	}

	@Override
	public void removeSegmentOfAccount(String accountCode, String segCode) {
		this.accountService.removeSegmentOfAccount(accountCode, segCode);
	}

	@Override
	public void emptySegmentsOfAccount(String accountCode) {
		this.accountService.emptySegmentsOfAccount(accountCode);
	}

	@Override
	public void addAccountAttribute(AccountAttribute attr) {
		this.accountService.addAccountAttribute(attr);
	}

	@Override
	public void removeAccountAttribute(String accountCode, String segCode, String attrCode) {
		this.accountService.removeAccountAttribute(accountCode, segCode, attrCode);
	}

	@Override
	public void emptyAccountAttributes(String accountCode, String segCode) {
		this.accountService.emptyAccountAttributes(accountCode, segCode);
	}

	@Override
	public List<AccountAttribute> getAccountAttributes(String accountCode, String segCode) {
		return this.accountService.getAccountAttributes(accountCode, segCode);
	}

}
