package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.AccountAttribute;
import cj.studio.backend.uc.bo.AccountAttributeExample;
import cj.studio.backend.uc.bo.AccountExample;
import cj.studio.backend.uc.bo.AccountSegment;
import cj.studio.backend.uc.bo.AccountSegmentExample;
import cj.studio.backend.uc.bo.GlobalRole;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.Tenant;
import cj.studio.backend.uc.bo.TenantGroup;
import cj.studio.backend.uc.bo.TenantPost;
import cj.studio.backend.uc.bo.TenantRole;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.plugin.dao.AccountAttributeMapper;
import cj.studio.backend.uc.plugin.dao.AccountMapper;
import cj.studio.backend.uc.plugin.dao.AccountSegmentMapper;
import cj.studio.backend.uc.plugin.dao.UAMapper;
import cj.studio.backend.uc.service.IAccountService;
import cj.studio.backend.uc.service.ISegmentService;
import cj.studio.backend.uc.service.ITenantService;
import cj.studio.backend.uc.service.IUserService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.IServiceAfter;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.util.StringUtil;

@CjBridge(aspects = "@transaction")
@CjService(name = "accountService")
public class AccountService implements IAccountService, IServiceAfter {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.AccountMapper")
	AccountMapper accountMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.AccountSegmentMapper")
	AccountSegmentMapper accountSegmentMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.AccountAttributeMapper")
	AccountAttributeMapper accountAttributeMapper;
	@CjServiceRef(refByName = "segmentService")
	ISegmentService segmentService;
	ITenantService tenantService;
	IUserService userService;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.UAMapper")
	UAMapper uaMapper;

	@CjTransaction
	@Override
	public void onAfter(IServiceSite site) {
		userService = (IUserService) site.getService("userService");
		tenantService = (ITenantService) site.getService("tenantService");
	}

	@CjTransaction
	@Override
	public void addAccount(Account account) {
		account.setId(null);
		if (StringUtil.isEmpty(account.getCode())) {
			throw new EcmException("账户编码为空");
		}
		if (StringUtil.isEmpty(account.getTenantcode())) {
			throw new EcmException("应用编码为空");
		}
		Tenant tenant = tenantService.getTenant(account.getTenantcode());
		if (tenant == null) {
			throw new EcmException(String.format("无此租户：%s", account.getTenantcode()));
		}
		User user = userService.getUser(account.getUsercode());
		if (user == null) {
			throw new EcmException(String.format("无此用户：%s", account.getUsercode()));
		}
		accountMapper.insertSelective(account);
	}

	@CjTransaction
	@Override
	public void removeAccount(String tenantCode, String accountCode) {
		AccountExample example = new AccountExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andCodeEqualTo(accountCode);
		this.accountMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public Account getAccount(String tenantCode, String accountCode) {
		AccountExample example = new AccountExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andCodeEqualTo(accountCode);
		List<Account> list = accountMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public long getAccountCount(String tenantCode) {
		AccountExample example = new AccountExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode);
		return accountMapper.countByExample(example);
	}

	@CjTransaction
	@Override
	public List<Account> getPage(String tenantCode, int currPage, int pageSize) {
		return accountMapper.getPage(tenantCode, currPage, pageSize);
	}

	@CjTransaction
	@Override
	public List<Segment> getSegmentsOfAccount(String tenantCode, String accountCode) {
		return this.accountSegmentMapper.getSegments(tenantCode, accountCode);
	}

	@CjTransaction
	@Override
	public void addSegmentOfAccount(AccountSegment seg) {
		seg.setId(null);
		seg.setSort(Integer.valueOf((int) System.currentTimeMillis() % Integer.MAX_VALUE));
		this.accountSegmentMapper.insert(seg);
	}

	@CjTransaction
	@Override
	public void removeSegmentOfAccount(String tenantCode, String segCode) {
		AccountSegmentExample example = new AccountSegmentExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode)
				.andSegcodeEqualTo(segCode);
		this.accountSegmentMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void emptySegmentsOfAccount(String tenantCode) {
		AccountSegmentExample example = new AccountSegmentExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode);
		this.accountSegmentMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void addAccountAttribute(AccountAttribute attr) {
		attr.setId(null);
		if (StringUtil.isEmpty(attr.getAttrcode())) {
			throw new EcmException("属性编码为空");
		}
		if (StringUtil.isEmpty(attr.getAccountcode())) {
			throw new EcmException("账户编码为空");
		}
		if (StringUtil.isEmpty(attr.getSegcode())) {
			throw new EcmException("信息段编码为空");
		}
		this.accountAttributeMapper.insert(attr);
	}

	@CjTransaction
	@Override
	public void removeAccountAttribute(String tenantCode, String accountCode, String segCode, String attrCode) {
		AccountAttributeExample example = new AccountAttributeExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andAccountcodeEqualTo(accountCode)
				.andSegcodeEqualTo(segCode).andAttrcodeEqualTo(attrCode);
		this.accountAttributeMapper.deleteByExample(example);

	}

	@CjTransaction
	@Override
	public void emptyAccountAttributes(String tenantCode, String accountCode, String segCode) {
		AccountAttributeExample example = new AccountAttributeExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andAccountcodeEqualTo(accountCode)
				.andSegcodeEqualTo(segCode);
		this.accountAttributeMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public List<AccountAttribute> getAccountAttributes(String tenantCode, String accountCode, String segCode) {
		AccountAttributeExample example = new AccountAttributeExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andAccountcodeEqualTo(accountCode)
				.andSegcodeEqualTo(segCode);
		return this.accountAttributeMapper.selectByExample(example);
	}

	@CjTransaction
	@Override
	public Account getAccountByAttrValue(String tenantCode, String segCode, String attrCode, String value) {
		List<Account> list = this.accountAttributeMapper.getAccountByAttrValue(tenantCode, segCode, attrCode, value);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public List<Account> getAccountByAttrValueOnSegment(String tenantCode, String segCode, String value) {
		return this.accountAttributeMapper.getAccountByAttrValueOnSegment(tenantCode, segCode, value);
	}

	@CjTransaction
	@Override
	public List<Account> findAccountsWhereCodeList(List<String> where) {
		if (where.isEmpty()) {//由于mybatis in 空时报错
			where.add(".....");
		}
		AccountExample example = new AccountExample();
		example.createCriteria().andUsercodeIn(where);
		return this.accountMapper.selectByExample(example);
	}

	@CjTransaction
	@Override
	public List<GlobalRole> listGlobalRoleOfAccount(String accountCode, String tenantCode) {
		Account account = getAccount(tenantCode, accountCode);
		if (account == null) {
			throw new EcmException("账户不存在：" + accountCode + "@" + tenantCode);
		}
		return userService.listGlobalRoleOfUser(account.getUsercode());
	}

	@CjTransaction
	@Override
	public List<TenantRole> listTenantRoleOfAccount(String accountCode, String tenantCode) {
		return uaMapper.getTenantRolesOnAccount(tenantCode, accountCode);
	}

	@CjTransaction
	@Override
	public List<TenantPost> listTenantPostOfAccount(String accountCode, String tenantCode) {
		return uaMapper.getTenantPostsOnAccount(tenantCode, accountCode);
	}

	@CjTransaction
	@Override
	public List<TenantGroup> listTenantGroupOfAccount(String accountCode, String tenantCode) {
		return uaMapper.getTenantGroupsOnAccount(tenantCode, accountCode);
	}

	@CjTransaction
	@Override
	public List<Organization> listTenantOrganizationOfAccount(String accountCode, String tenantCode) {
		return uaMapper.getTenantOrgsOnAccount(tenantCode, accountCode);
	}
}
