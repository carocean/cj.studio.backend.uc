package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.bo.UserAttribute;
import cj.studio.backend.uc.bo.UserAttributeExample;
import cj.studio.backend.uc.bo.UserExample;
import cj.studio.backend.uc.bo.UserSegment;
import cj.studio.backend.uc.plugin.dao.UserAttributeMapper;
import cj.studio.backend.uc.plugin.dao.UserMapper;
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

	@CjTransaction
	@Override
	public User getUser(String code) {
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
	public List<Organization> getOrgsOfUser(String userCode, String appCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@CjTransaction
	@Override
	public List<Account> getAccountsOfUser(String userCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@CjTransaction
	@Override
	public List<UserSegment> getSegmentsOfUser(String userCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@CjTransaction
	@Override
	public List<UserAttribute> getAttributesOfSegment(String segCode) {
		// TODO Auto-generated method stub
		return null;
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
	public User getUserByAttrValue(String segCode, String attrCode, String value) {
		return this.userAttributeMapper.getUserByAttrValue(segCode,attrCode,value);
	}

}
