package cj.studio.backend.uc.plugin.service;

import java.util.ArrayList;
import java.util.List;

import cj.studio.backend.uc.bo.UA;
import cj.studio.backend.uc.bo.UAExample;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.plugin.dao.UAMapper;
import cj.studio.backend.uc.service.IUAService;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

@CjBridge(aspects = "@transaction")
@CjService(name = "uaService")
public class UAService implements IUAService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.UAMapper")
	UAMapper uaMapper;

	@CjTransaction
	@Override
	public void add(UA ua) {
		uaMapper.insert(ua);
	}

	@CjTransaction
	@Override
	public void emptyUsersOnColCode(String tenantCode, String colType, String colCode) {
		UAExample example = new UAExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andColcodeEqualTo(colCode).andColtypeEqualTo(colType);
		uaMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void removeUserOnColCode(String tenantCode, String userCode, String colType, String colCode) {
		UAExample example = new UAExample();
		example.createCriteria().andUsercodeEqualTo(userCode).andTenantcodeEqualTo(tenantCode)
				.andColcodeEqualTo(colCode).andColtypeEqualTo(colType);
		uaMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public List<String> getUsersOnColCode(String tenantCode, String colType, String colCode) {
		UAExample example = new UAExample();
		example.createCriteria().andTenantcodeEqualTo(tenantCode).andColcodeEqualTo(colCode).andColtypeEqualTo(colType);
		List<UA> ualist = uaMapper.selectByExample(example);
		List<String> users = new ArrayList<String>();
		for (UA ua : ualist) {
			users.add(ua.getUsercode());
		}
		return users;
	}

	@CjTransaction
	@Override
	public List<String> pageUsersOnColCode(String tenantCode, String colType, String colCode, int currPage,
			int pageSize) {
		List<User> users = uaMapper.pageUsersOnColCode(tenantCode, colType, colCode, currPage, pageSize);
		List<String> list = new ArrayList<String>();
		for (User u : users) {
			list.add(u.getUsercode());
		}
		return list;
	}
}
