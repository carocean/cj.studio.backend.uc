package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.AccountExample;
import cj.studio.backend.uc.bo.GlobalRole;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.TenantGroup;
import cj.studio.backend.uc.bo.TenantPost;
import cj.studio.backend.uc.bo.TenantRole;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.bo.UserAttribute;
import cj.studio.backend.uc.bo.UserAttributeExample;
import cj.studio.backend.uc.bo.UserExample;
import cj.studio.backend.uc.plugin.dao.AccountMapper;
import cj.studio.backend.uc.plugin.dao.UserAttributeMapper;
import cj.studio.backend.uc.plugin.dao.UserMapper;
import cj.studio.backend.uc.plugin.util.NumberGen;
import cj.studio.backend.uc.service.IAccountService;
import cj.studio.backend.uc.service.IGlobalRoleService;
import cj.studio.backend.uc.service.IUserService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.util.StringUtil;

@CjBridge(aspects = "@transaction")
@CjService(name = "userService")
public class UserService implements IUserService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.UserMapper")
	UserMapper userMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.UserAttributeMapper")
	UserAttributeMapper userAttributeMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.AccountMapper")
	AccountMapper accountMapper;
	@CjServiceRef
	IGlobalRoleService globalRoleService;
	@CjServiceRef
	IAccountService accountService;

	@CjTransaction
	@Override
	public User getUser(String code) {
		if (StringUtil.isEmpty(code))
			return null;
		UserExample example = new UserExample();
		example.createCriteria().andUsercodeEqualTo(code);
		List<User> userlist = userMapper.selectByExample(example);
		if (userlist.isEmpty())
			return null;
		return userlist.get(0);
	}

	@CjTransaction
	@Override
	public void saveUser(User user) {
		if (StringUtil.isEmpty(user.getUsercode())) {
			String userCode = NumberGen.gen();
			while (userMapper.existsCode(userCode) > 0) {
				userCode = NumberGen.gen();
			}
			user.setUsercode(userCode);
		} else {
			if (userMapper.existsCode(user.getUsercode()) > 0) {
				throw new EcmException("已存在用户名：" + user.getUsercode());
			}
		}
		userMapper.insertSelective(user);
	}

	@CjTransaction
	@Override
	public long getUserCount() {
		UserExample example = new UserExample();
		return userMapper.countByExample(example);
	}

	@CjTransaction
	@Override
	public List<User> getPage(int currPage, int pageSize) {
		return userMapper.getPage(currPage, pageSize);
	}

	@CjTransaction
	@Override
	public void removeUser(String code) {
		UserExample example = new UserExample();
		example.createCriteria().andUsercodeEqualTo(code);
		userMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void addUserAttribute(UserAttribute attr) {
		attr.setId(null);
		if (StringUtil.isEmpty(attr.getAttrcode())) {
			throw new EcmException("属性代码为空");
		}
		if (StringUtil.isEmpty(attr.getSegcode())) {
			throw new EcmException("信息段代码为空");
		}
		if (StringUtil.isEmpty(attr.getUsercode())) {
			throw new EcmException("用户代码为空");
		}
		this.userAttributeMapper.insertSelective(attr);
	}

	@CjTransaction
	@Override
	public void removeUserAttribute(String userCode, String segCode, String attrCode) {
		UserAttributeExample example = new UserAttributeExample();
		example.createCriteria().andUsercodeEqualTo(userCode).andSegcodeEqualTo(segCode).andAttrcodeEqualTo(attrCode);
		this.userAttributeMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public String getUserAttribute(String userCode, String segCode, String attrCode) {
		UserAttributeExample example = new UserAttributeExample();
		example.createCriteria().andUsercodeEqualTo(userCode).andSegcodeEqualTo(segCode).andAttrcodeEqualTo(attrCode);
		List<UserAttribute> list = this.userAttributeMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0).getValue();
	}

	@CjTransaction
	@Override
	public void emptyUserAttributes(String userCode, String segCode) {
		UserAttributeExample example = new UserAttributeExample();
		example.createCriteria().andUsercodeEqualTo(userCode).andSegcodeEqualTo(segCode);
		this.userAttributeMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public List<UserAttribute> getUserAttributes(String userCode, String segCode) {
		UserAttributeExample example = new UserAttributeExample();
		example.createCriteria().andUsercodeEqualTo(userCode).andSegcodeEqualTo(segCode);
		return this.userAttributeMapper.selectByExample(example);
	}

	@CjTransaction
	@Override
	public List<User> getUsersByAttrValue(String segCode, String attrCode, String value) {
		return this.userAttributeMapper.getUsersByAttrValue(segCode, attrCode, value);
	}

	@Override
	public List<User> getUsersByAttrValueOnSegment(String segCode, String value) {
		return this.userAttributeMapper.getUsersByAttrValueOnSegment(segCode, value);
	}

	@CjTransaction
	@Override
	public UserAttribute getUserAttribute(String userCode, String segCode, String attrCode, String value) {
		UserAttributeExample example = new UserAttributeExample();
		example.createCriteria().andUsercodeEqualTo(userCode).andSegcodeEqualTo(segCode).andAttrcodeEqualTo(attrCode)
				.andValueEqualTo(value);
		List<UserAttribute> list = this.userAttributeMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public List<UserAttribute> getUserAttributes(String userCode, String segCode, String attrCode) {
		UserAttributeExample example = new UserAttributeExample();
		example.createCriteria().andUsercodeEqualTo(userCode).andSegcodeEqualTo(segCode).andAttrcodeEqualTo(attrCode);
		return this.userAttributeMapper.selectByExample(example);
	}

	@CjTransaction
	public Account getAccount(String userCode, String tenantCode) {
		AccountExample example = new AccountExample();
		example.createCriteria().andUsercodeEqualTo(userCode).andTenantcodeEqualTo(tenantCode);
		List<Account> list = accountMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public Account getAccountOfUserOnTenant(String userCode, String tenantCode) {
		AccountExample example = new AccountExample();
		example.createCriteria().andUsercodeEqualTo(userCode).andTenantcodeEqualTo(tenantCode);
		List<Account> accounts = this.accountMapper.selectByExample(example);
		if (accounts.isEmpty())
			return null;
		return accounts.get(0);
	}

	@CjTransaction
	@Override
	public List<Account> listAccountOfUser(String userCode) {
		AccountExample example = new AccountExample();
		example.createCriteria().andUsercodeEqualTo(userCode);
		return this.accountMapper.selectByExample(example);
	}

	@CjTransaction
	@Override
	public List<GlobalRole> listGlobalRoleOfUser(String userCode) {
		return this.globalRoleService.getRolesOnUser(userCode);
	}

	@CjTransaction
	@Override
	public List<TenantRole> listTenantRoleOfUser(String userCode, String tenantCode) {
		Account account = getAccount(userCode, tenantCode);
		if (account == null) {
			throw new EcmException(String.format("用户：%s 在 租户：%s 下无账户", userCode, tenantCode));
		}

		return accountService.listTenantRoleOfAccount(account.getCode(), tenantCode);
	}

	@CjTransaction
	@Override
	public List<TenantPost> listTenantPostOfUser(String userCode, String tenantCode) {
		Account account = getAccount(userCode, tenantCode);
		if (account == null) {
			throw new EcmException(String.format("用户：%s 在 租户：%s 下无账户", userCode, tenantCode));
		}

		return accountService.listTenantPostOfAccount(account.getCode(), tenantCode);
	}

	@CjTransaction
	@Override
	public List<TenantGroup> listTenantGroupOfUser(String userCode, String tenantCode) {
		Account account = getAccount(userCode, tenantCode);
		if (account == null) {
			throw new EcmException(String.format("用户：%s 在 租户：%s 下无账户", userCode, tenantCode));
		}

		return accountService.listTenantGroupOfAccount(account.getCode(), tenantCode);
	}

	@CjTransaction
	@Override
	public List<Organization> listTenantOrganizationOfUser(String userCode, String tenantCode) {
		Account account = getAccount(userCode, tenantCode);
		if (account == null) {
			throw new EcmException(String.format("用户：%s 在 租户：%s 下无账户", userCode, tenantCode));
		}

		return accountService.listTenantOrganizationOfAccount(account.getCode(), tenantCode);
	}
}
