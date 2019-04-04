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
	public void removeAccount(String tenantCode,String accountCode) {
		this.accountService.removeAccount(tenantCode,accountCode);
	}

	@Override
	public Account getAccount(String tenantCode,String accountCode) {
		return this.accountService.getAccount(tenantCode,accountCode);
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
	public List<Segment> getSegmentsOfAccount(String tenantCode,String accountCode) {
		return accountService.getSegmentsOfAccount(tenantCode,accountCode);
	}

	@Override
	public void addSegmentOfAccount(AccountSegment seg) {
		this.accountService.addSegmentOfAccount(seg);
	}

	@Override
	public void removeSegmentOfAccount(String tenantCode,String accountCode, String segCode) {
		this.accountService.removeSegmentOfAccount(tenantCode,accountCode, segCode);
	}

	@Override
	public void emptySegmentsOfAccount(String tenantCode,String accountCode) {
		this.accountService.emptySegmentsOfAccount(tenantCode,accountCode);
	}

	@Override
	public void addAccountAttribute(AccountAttribute attr) {
		this.accountService.addAccountAttribute(attr);
	}

	@Override
	public void removeAccountAttribute(String tenantCode,String accountCode, String segCode, String attrCode) {
		this.accountService.removeAccountAttribute(tenantCode,accountCode, segCode, attrCode);
	}

	@Override
	public void emptyAccountAttributes(String tenantCode,String accountCode, String segCode) {
		this.accountService.emptyAccountAttributes(tenantCode,accountCode, segCode);
	}

	@Override
	public List<AccountAttribute> getAccountAttributes(String tenantCode,String accountCode, String segCode) {
		return this.accountService.getAccountAttributes(tenantCode,accountCode, segCode);
	}
	@Override
	public Account getAccountByAttrValue(String segCode, String attrCode, String value) {
		return accountService.getAccountByAttrValue(segCode, attrCode, value);
	}
}
