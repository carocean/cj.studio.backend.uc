package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.AccountAttribute;
import cj.studio.backend.uc.bo.AccountAttributeExample;
import cj.studio.backend.uc.bo.AccountExample;
import cj.studio.backend.uc.bo.AccountSegment;
import cj.studio.backend.uc.bo.AccountSegmentExample;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.plugin.dao.AccountAttributeMapper;
import cj.studio.backend.uc.plugin.dao.AccountMapper;
import cj.studio.backend.uc.plugin.dao.AccountSegmentMapper;
import cj.studio.backend.uc.service.IAccountService;
import cj.studio.backend.uc.service.ISegmentService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.util.StringUtil;

@CjBridge(aspects = "@transaction")
@CjService(name = "accountService")
public class AccountService implements IAccountService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.AccountMapper")
	AccountMapper accountMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.AccountSegmentMapper")
	AccountSegmentMapper accountSegmentMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.AccountAttributeMapper")
	AccountAttributeMapper accountAttributeMapper;
	@CjServiceRef(refByName = "segmentService")
	ISegmentService segmentService;

	@CjTransaction
	@Override
	public void addAccount(Account account) {
		account.setId(null);
		if (StringUtil.isEmpty(account.getCode())) {
			throw new EcmException("账户编码为空");
		}
		if (StringUtil.isEmpty(account.getAppcode())) {
			throw new EcmException("应用编码为空");
		}
		accountMapper.insertSelective(account);
	}

	@CjTransaction
	@Override
	public void removeAccount(String accountCode) {
		AccountExample example = new AccountExample();
		example.createCriteria().andCodeEqualTo(accountCode);
		this.accountMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public Account getAccount(String accountCode) {
		AccountExample example = new AccountExample();
		example.createCriteria().andCodeEqualTo(accountCode);
		List<Account> list = accountMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public long getAccountCount() {
		AccountExample example = new AccountExample();
		return accountMapper.countByExample(example);
	}

	@CjTransaction
	@Override
	public List<Account> getPage(int currPage, int pageSize) {
		return accountMapper.getPage(currPage, pageSize);
	}

	@CjTransaction
	@Override
	public List<Segment> getSegmentsOfAccount(String accountCode) {
		return this.accountSegmentMapper.getSegments(accountCode);
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
	public void removeSegmentOfAccount(String accountCode, String segCode) {
		AccountSegmentExample example = new AccountSegmentExample();
		example.createCriteria().andAccountcodeEqualTo(accountCode).andSegcodeEqualTo(segCode);
		this.accountSegmentMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void emptySegmentsOfAccount(String accountCode) {
		AccountSegmentExample example = new AccountSegmentExample();
		example.createCriteria().andAccountcodeEqualTo(accountCode);
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
	public void removeAccountAttribute(String accountCode, String segCode, String attrCode) {
		AccountAttributeExample example = new AccountAttributeExample();
		example.createCriteria().andAccountcodeEqualTo(accountCode).andSegcodeEqualTo(segCode)
				.andAttrcodeEqualTo(attrCode);
		this.accountAttributeMapper.deleteByExample(example);

	}

	@CjTransaction
	@Override
	public void emptyAccountAttributes(String accountCode, String segCode) {
		AccountAttributeExample example = new AccountAttributeExample();
		example.createCriteria().andAccountcodeEqualTo(accountCode).andSegcodeEqualTo(segCode);
		this.accountAttributeMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public List<AccountAttribute> getAccountAttributes(String accountCode, String segCode) {
		AccountAttributeExample example = new AccountAttributeExample();
		example.createCriteria().andAccountcodeEqualTo(accountCode).andSegcodeEqualTo(segCode);
		return this.accountAttributeMapper.selectByExample(example);
	}
	@CjTransaction
	@Override
	public Account getAccountByAttrValue(String segCode, String attrCode, String value) {
		return this.accountAttributeMapper.getAccountByAttrValue( segCode,  attrCode,  value) ;
	}
}
