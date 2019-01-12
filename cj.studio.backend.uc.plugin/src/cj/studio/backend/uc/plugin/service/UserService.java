package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.Role;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.bo.UserAttribute;
import cj.studio.backend.uc.bo.UserExample;
import cj.studio.backend.uc.bo.UserSegment;
import cj.studio.backend.uc.plugin.dao.UserMapper;
import cj.studio.backend.uc.service.IUserService;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

@CjBridge(aspects = "@transaction")
@CjService(name = "userService")
public class UserService implements IUserService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.UserMapper")
	UserMapper userMapper;

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
		userMapper.insert(user);
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
	public List<Role> getRoleOfUser(String userCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@CjTransaction
	@Override
	public List<Role> getRoleOfUserInOrg(String userCode, String orgCode, String appCode) {
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

}
