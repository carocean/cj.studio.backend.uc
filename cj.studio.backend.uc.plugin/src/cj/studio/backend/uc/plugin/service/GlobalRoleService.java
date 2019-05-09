package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.GlobalRole;
import cj.studio.backend.uc.bo.GlobalRoleExample;
import cj.studio.backend.uc.bo.UA;
import cj.studio.backend.uc.bo.UAExample;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.plugin.dao.GlobalRoleMapper;
import cj.studio.backend.uc.plugin.dao.UAMapper;
import cj.studio.backend.uc.plugin.util.UCConstants;
import cj.studio.backend.uc.service.IGlobalRoleService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.util.StringUtil;

@CjBridge(aspects = "@transaction")
@CjService(name = "globalRoleService")
public class GlobalRoleService implements IGlobalRoleService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.GlobalRoleMapper")
	GlobalRoleMapper globalRoleMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.UAMapper")
	UAMapper uaMapper;

	@CjTransaction
	@Override
	public void addRole(String roleCode, String roleName, String comment) {
		if (StringUtil.isEmpty(roleCode)) {
			throw new EcmException("角色编码为空");
		}
		if (StringUtil.isEmpty(roleName)) {
			throw new EcmException("角色名为空");
		}
		GlobalRole exists = getRole(roleCode);
		if (exists != null) {
			throw new EcmException("已存在角色");
		}
		GlobalRole role = new GlobalRole();
		role.setCode(roleCode);
		role.setComment(comment);
		role.setName(roleName);
		this.globalRoleMapper.insertSelective(role);
	}

	@CjTransaction
	@Override
	public void removeRole(String roleCode) {
		GlobalRoleExample example = new GlobalRoleExample();
		example.createCriteria().andCodeEqualTo(roleCode);
		this.globalRoleMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public GlobalRole getRole(String roleCode) {
		GlobalRoleExample example = new GlobalRoleExample();
		example.createCriteria().andCodeEqualTo(roleCode);
		List<GlobalRole> list = this.globalRoleMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public long getRoleCount() {
		GlobalRoleExample example = new GlobalRoleExample();
		return this.globalRoleMapper.countByExample(example);
	}

	@CjTransaction
	@Override
	public List<GlobalRole> getPage(int currPage, int pageSize) {
		return this.globalRoleMapper.getPage(currPage, pageSize);
	}

	@CjTransaction
	@Override
	public List<User> getUsersOnRole(String roleCode) {
		return uaMapper.getUsersOnColCode(UCConstants.Root_Tenant, UCConstants.COLTYPE_Global_Role, roleCode);
	}

	@CjTransaction
	@Override
	public List<User> getUsersOnRoleByPage(String roleCode, int currPage, int pageSize) {
		return uaMapper.pageUsersOnColCode(UCConstants.Root_Tenant, UCConstants.COLTYPE_Global_Role, roleCode, currPage,
				pageSize);
	}

	@CjTransaction
	@Override
	public void addUserOnRole(String userCode, String roleCode) {
		UA ur = new UA();
		ur.setTenantcode(UCConstants.Root_Tenant);
		ur.setColtype(UCConstants.COLTYPE_Global_Role);
		ur.setColcode(roleCode);
		ur.setUsercode(userCode);
		uaMapper.insertSelective(ur);
	}

	@CjTransaction
	@Override
	public void removeUserOnRole(String userCode, String roleCode) {
		UAExample example = new UAExample();
		example.createCriteria().andUsercodeEqualTo(userCode).andTenantcodeEqualTo(UCConstants.Root_Tenant)
				.andColtypeEqualTo(UCConstants.COLTYPE_Global_Role).andColcodeEqualTo(roleCode);
		uaMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void emptyUsersOnRole(String roleCode) {
		UAExample example = new UAExample();
		example.createCriteria().andTenantcodeEqualTo(UCConstants.Root_Tenant)
				.andColtypeEqualTo(UCConstants.COLTYPE_Global_Role).andColcodeEqualTo(roleCode);
		uaMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public List<GlobalRole> getRolesOnUserByPage(String userCode, int currPage, int pageSize) {
		return uaMapper.pageRolesOnUser(userCode, UCConstants.Root_Tenant, UCConstants.COLTYPE_Global_Role, currPage,
				pageSize);
	}
	@CjTransaction
	@Override
	public List<GlobalRole> getRolesOnUser(String userCode) {
		return uaMapper.getRolesOnUser(userCode, UCConstants.Root_Tenant, UCConstants.COLTYPE_Global_Role);
	}
}
