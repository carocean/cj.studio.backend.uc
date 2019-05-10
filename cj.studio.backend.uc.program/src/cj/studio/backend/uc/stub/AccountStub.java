package cj.studio.backend.uc.stub;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.AccountAttribute;
import cj.studio.backend.uc.bo.AccountSegment;
import cj.studio.backend.uc.bo.GlobalRole;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.TenantGroup;
import cj.studio.backend.uc.bo.TenantPost;
import cj.studio.backend.uc.bo.TenantRole;
import cj.studio.backend.uc.service.IAccountService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;

@CjService(name = "/tenant/account.service")
public class AccountStub extends GatewayAppSiteRestStub implements IAccountStub {
	@CjServiceRef(refByName = "ucplugin.accountService")
	IAccountService accountService;

	@Override
	public Account getAccount(String tenantCode, String accountCode) {
		return this.accountService.getAccount(tenantCode, accountCode);
	}

	@Override
	public long getAccountCount(String tenantCode) {
		return this.accountService.getAccountCount(tenantCode);
	}

	@Override
	public List<Account> getPage(String tenantCode, int currPage, int pageSize) {
		return this.accountService.getPage(tenantCode, currPage, pageSize);
	}

	@Override
	public List<Segment> getSegmentsOfAccount(String tenantCode, String accountCode) {
		return accountService.getSegmentsOfAccount(tenantCode, accountCode);
	}

	@Override
	public void addSegmentOfAccount(String tenantCode, String accountCode, String segCode, int sort) {
		AccountSegment seg = new AccountSegment();
		seg.setSegcode(segCode);
		seg.setSort(sort);
		seg.setTenantcode(tenantCode);
		this.accountService.addSegmentOfAccount(seg);
	}

	@Override
	public void removeSegmentOfAccount(String tenantCode, String segCode) {
		this.accountService.removeSegmentOfAccount(tenantCode, segCode);
	}

	@Override
	public void emptySegmentsOfAccount(String tenantCode) {
		this.accountService.emptySegmentsOfAccount(tenantCode);
	}
	@Override
	public void addAccountAttribute(String tenantCode, String accountCode, String segCode, String attrCode,
			String value) {
		AccountAttribute attr=new AccountAttribute();
		attr.setAccountcode(accountCode);
		attr.setAttrcode(attrCode);
		attr.setSegcode(segCode);
		attr.setTenantcode(tenantCode);
		attr.setValue(value);
		this.accountService.addAccountAttribute(attr);
	}

	@Override
	public void removeAccountAttribute(String tenantCode, String accountCode, String segCode, String attrCode) {
		this.accountService.removeAccountAttribute(tenantCode, accountCode, segCode, attrCode);
	}

	@Override
	public void emptyAccountAttributes(String tenantCode, String accountCode, String segCode) {
		this.accountService.emptyAccountAttributes(tenantCode, accountCode, segCode);
	}

	@Override
	public List<AccountAttribute> getAccountAttributes(String tenantCode, String accountCode, String segCode) {
		return this.accountService.getAccountAttributes(tenantCode, accountCode, segCode);
	}

	@Override
	public Account getAccountByAttrValue(String tenantCode, String segCode, String attrCode, String value) {
		return accountService.getAccountByAttrValue(tenantCode, segCode, attrCode, value);
	}

	@Override
	public List<GlobalRole> listGlobalRoleOfAccount(String tenantCode, String accountCode) {
		return accountService.listGlobalRoleOfAccount(accountCode, tenantCode);
	}

	@Override
	public List<TenantRole> listTenantRoleOfAccount(String tenantCode, String accountCode) {
		return accountService.listTenantRoleOfAccount(accountCode, tenantCode);
	}

	@Override
	public List<TenantPost> listTenantPostOfAccount(String tenantCode, String accountCode) {
		return accountService.listTenantPostOfAccount(accountCode, tenantCode);
	}

	@Override
	public List<TenantGroup> listTenantGroupOfAccount(String tenantCode, String accountCode) {
		return accountService.listTenantGroupOfAccount(accountCode, tenantCode);
	}

	@Override
	public List<Organization> listTenantOrganizationOfAccount(String tenantCode, String accountCode) {
		return accountService.listTenantOrganizationOfAccount(accountCode, tenantCode);
	}
}
