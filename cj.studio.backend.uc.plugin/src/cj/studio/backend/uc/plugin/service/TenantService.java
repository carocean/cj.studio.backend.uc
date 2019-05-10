package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.Tenant;
import cj.studio.backend.uc.bo.TenantAttribute;
import cj.studio.backend.uc.bo.TenantAttributeExample;
import cj.studio.backend.uc.bo.TenantExample;
import cj.studio.backend.uc.bo.TenantSegment;
import cj.studio.backend.uc.bo.TenantSegmentExample;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.plugin.dao.TenantAttributeMapper;
import cj.studio.backend.uc.plugin.dao.TenantMapper;
import cj.studio.backend.uc.plugin.dao.TenantSegmentMapper;
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
@CjService(name = "tenantService")
public class TenantService implements ITenantService, IServiceAfter {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.TenantMapper")
	TenantMapper tenantMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.TenantSegmentMapper")
	TenantSegmentMapper tenantSegmentMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.TenantAttributeMapper")
	TenantAttributeMapper tenantAttributeMapper;
	@CjServiceRef(refByName = "segmentService")
	ISegmentService segmentService;
	IAccountService accountService;
	@CjServiceRef(refByName = "userService")
	IUserService userService;

	@CjTransaction
	@Override
	public void onAfter(IServiceSite site) {
		accountService = (IAccountService) site.getService("accountService");
	}

	@CjTransaction
	@Override
	public void addTenant(Tenant tenant) {
		if (StringUtil.isEmpty(tenant.getCode())) {
			throw new EcmException("tenantcode为空");
		}
		tenant.setId(null);
		tenantMapper.insertSelective(tenant);
	}

	@CjTransaction
	@Override
	public void removeTenant(String tenantCode) {
		TenantExample example = new TenantExample();
		example.createCriteria().andCodeEqualTo(tenantCode);
		tenantMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public Tenant getTenant(String tenantCode) {
		TenantExample example = new TenantExample();
		example.createCriteria().andCodeEqualTo(tenantCode);
		List<Tenant> list = tenantMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public long getAppCount() {
		TenantExample example = new TenantExample();
		return tenantMapper.countByExample(example);
	}

	@CjTransaction
	@Override
	public List<Tenant> getPage(int currPage, int pageSize) {
		return this.tenantMapper.getPage(currPage, pageSize);
	}

	@CjTransaction
	@Override
	public List<Segment> getSegmentsOfTenant(String tenantCode) {
		return this.tenantSegmentMapper.getSegments(tenantCode);
	}

	@CjTransaction
	@Override
	public void addSegmentOfTenant(TenantSegment seg) {
		seg.setId(null);
		seg.setSort(Integer.valueOf((int) System.currentTimeMillis() % Integer.MAX_VALUE));
		this.tenantSegmentMapper.insert(seg);
	}

	@CjTransaction
	@Override
	public void removeSegmentOfTenant(String tenantCode, String segCode) {
		TenantSegmentExample example = new TenantSegmentExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andSegcodeEqualTo(segCode);
		this.tenantSegmentMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void emptySegmentsOfTenant(String tenantCode) {
		TenantSegmentExample example = new TenantSegmentExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode);
		this.tenantSegmentMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void addTenantAttribute(TenantAttribute attr) {
		attr.setId(null);
		if (StringUtil.isEmpty(attr.getAttrcode())) {
			throw new EcmException("属性编码为空");
		}
		if (StringUtil.isEmpty(attr.getTenantcode())) {
			throw new EcmException("应用编码为空");
		}
		if (StringUtil.isEmpty(attr.getSegcode())) {
			throw new EcmException("信息段编码为空");
		}
		String v = getTenantAttribute(attr.getTenantcode(), attr.getSegcode(), attr.getAttrcode());
		if (attr.getValue().equals(v)) {
			throw new EcmException("属性值已存在");
		}
		this.tenantAttributeMapper.insert(attr);
	}

	@CjTransaction
	@Override
	public String getTenantAttribute(String tenantCode, String segCode, String attrCode) {
		TenantAttributeExample example = new TenantAttributeExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andSegcodeEqualTo(segCode)
				.andAttrcodeEqualTo(attrCode);
		List<TenantAttribute> list = this.tenantAttributeMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0).getValue();
	}

	@CjTransaction
	@Override
	public void removeTenantAttribute(String tenantCode, String segCode, String attrCode) {
		TenantAttributeExample example = new TenantAttributeExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andSegcodeEqualTo(segCode)
				.andAttrcodeEqualTo(attrCode);
		this.tenantAttributeMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void emptyTenantAttributes(String tenantCode, String segCode) {
		TenantAttributeExample example = new TenantAttributeExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andSegcodeEqualTo(segCode);
		this.tenantAttributeMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public List<TenantAttribute> getTenantAttributes(String tenantCode, String segCode) {
		TenantAttributeExample example = new TenantAttributeExample();
		;
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andSegcodeEqualTo(segCode);
		return this.tenantAttributeMapper.selectByExample(example);
	}

	@CjTransaction
	@Override
	public Segment getSegmentOfTenant(String tenantCode, String segCode) {
		TenantSegmentExample example = new TenantSegmentExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andSegcodeEqualTo(segCode);
		List<TenantSegment> list = this.tenantSegmentMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		TenantSegment tseg = list.get(0);
		return this.segmentService.getSegment(tseg.getSegcode());
	}

	@CjTransaction
	@Override
	public void setCompanyOnTenant(String companyCode, String tenantCode) {
		TenantExample example = new TenantExample();
		example.createCriteria().andCodeEqualTo(tenantCode);
		Tenant record = getTenant(tenantCode);
		record.setOwnercode(companyCode);
		record.setOwnertype("company");
		this.tenantMapper.updateByExampleSelective(record, example);
	}


	@CjTransaction
	@Override
	public void addAccount(String tenantCode, String accountCode, String accountName, String userCode, String face) {
		Account exists = accountService.getAccount(tenantCode, accountCode);
		if (exists != null) {
			throw new EcmException("账户已存在：" + accountCode);
		}
		User user = userService.getUser(userCode);
		if (user == null) {// 为空则新建用户
			user = new User();
			user.setCreatetime(System.currentTimeMillis());
			user.setFace(face);
			user.setNickname(accountName);
			user.setUsercode(userCode);
			user.setSex((byte) 0);
			userService.saveUser(user);
		}
		Account account = new Account();
		account.setCode(accountCode);
		account.setName(accountName);
		account.setFace(face);
		account.setTenantcode(tenantCode);
		account.setUsercode(user.getUsercode());
		try {
			accountService.addAccount(account);
		} catch (Exception e) {
//			userService.removeUser(user.getUsercode());
			throw e;
		}
	}

	@CjTransaction
	@Override
	public void removeAccount(String tenantCode, String accountCode) {
		accountService.removeAccount(tenantCode, accountCode);
	}

	@CjTransaction
	@Override
	public long getAccountCount(String tenantCode) {
		return accountService.getAccountCount(tenantCode);
	}

	@CjTransaction
	@Override
	public List<Account> getPage(String tenantCode, int currPage, int pageSize) {
		return accountService.getPage(tenantCode, currPage, pageSize);
	}
	@CjTransaction
	@Override
	public Account getAccount(String tenantCode, String accountCode) {
		return accountService.getAccount(tenantCode, accountCode);
	}

}
