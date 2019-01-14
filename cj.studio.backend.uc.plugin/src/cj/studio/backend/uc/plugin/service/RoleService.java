package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.OrgMemberRole;
import cj.studio.backend.uc.bo.OrgMemberRoleExample;
import cj.studio.backend.uc.bo.Role;
import cj.studio.backend.uc.bo.RoleExample;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.bo.UserRole;
import cj.studio.backend.uc.bo.UserRoleExample;
import cj.studio.backend.uc.plugin.dao.OrgMemberMapper;
import cj.studio.backend.uc.plugin.dao.OrgMemberRoleMapper;
import cj.studio.backend.uc.plugin.dao.RoleMapper;
import cj.studio.backend.uc.plugin.dao.UserRoleMapper;
import cj.studio.backend.uc.service.IRoleService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.util.StringUtil;

@CjBridge(aspects = "@transaction")
@CjService(name = "roleService")
public class RoleService implements IRoleService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.RoleMapper")
	RoleMapper roleMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.UserRoleMapper")
	UserRoleMapper userRoleMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.OrgMemberMapper")
	OrgMemberMapper orgMemberMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.OrgMemberRoleMapper")
	OrgMemberRoleMapper orgMemberRoleMapper;

	@CjTransaction
	@Override
	public void addRole(Role role) {
		role.setId(null);
		if (StringUtil.isEmpty(role.getCode())) {
			throw new EcmException("角色编码为空");
		}
		this.roleMapper.insertSelective(role);
	}

	@CjTransaction
	@Override
	public void removeRole(String roleCode) {
		RoleExample example = new RoleExample();
		example.createCriteria().andCodeEqualTo(roleCode);
		this.roleMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public Role getRole(String roleCode) {
		RoleExample example = new RoleExample();
		example.createCriteria().andCodeEqualTo(roleCode);
		List<Role> list = this.roleMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@CjTransaction
	@Override
	public long getRoleCount() {
		RoleExample example = new RoleExample();
		return this.roleMapper.countByExample(example);
	}

	@CjTransaction
	@Override
	public List<Role> getPage(int currPage, int pageSize) {
		return this.roleMapper.getPage(currPage, pageSize);
	}

	@CjTransaction
	@Override
	public List<User> getUsersOnRole(String roleCode) {
		return userRoleMapper.getUsersOnRole(roleCode);
	}

	@CjTransaction
	@Override
	public void addUserOnRole(String userCode, String roleCode) {
		UserRole ur = new UserRole();
		ur.setRolecode(roleCode);
		ur.setUsercode(userCode);
		userRoleMapper.insertSelective(ur);
	}

	@CjTransaction
	@Override
	public void removeUserOnRole(String userCode, String roleCode) {
		UserRoleExample example = new UserRoleExample();
		example.createCriteria().andUsercodeEqualTo(userCode).andRolecodeEqualTo(roleCode);
		userRoleMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void emptyUsersOnRole(String roleCode) {
		UserRoleExample example = new UserRoleExample();
		example.createCriteria().andRolecodeEqualTo(roleCode);
		userRoleMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public List<User> getOrgMembersOnRole(String orgCode, String roleCode) {
		return orgMemberRoleMapper.getMembersOnRole(orgCode, roleCode);
	}

	@CjTransaction
	@Override
	public void addOrgMemberOnRole(String userCode, String orgCode, String roleCode) {
		OrgMemberRole omr = new OrgMemberRole();
		omr.setOrgcode(orgCode);
		omr.setRolecode(roleCode);
		omr.setUsercode(userCode);
		orgMemberRoleMapper.insertSelective(omr);
	}

	@CjTransaction
	@Override
	public void removeOrgMemberOnRole(String userCode, String orgCode, String roleCode) {
		OrgMemberRoleExample example = new OrgMemberRoleExample();
		example.createCriteria().andUsercodeEqualTo(userCode).andOrgcodeEqualTo(orgCode).andRolecodeEqualTo(roleCode);
		orgMemberRoleMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public void emptyOrgMembersOnRole(String orgCode, String roleCode) {
		OrgMemberRoleExample example = new OrgMemberRoleExample();
		example.createCriteria().andOrgcodeEqualTo(orgCode).andRolecodeEqualTo(roleCode);
		orgMemberRoleMapper.deleteByExample(example);
	}

	@CjTransaction
	@Override
	public List<Role> getRolesOnUser(String userCode) {
		return userRoleMapper.getRolesOnUser(userCode);
	}

	@CjTransaction
	@Override
	public List<Role> getRolesOnOrgMember(String userCode, String orgCode, String appCode) {
		return orgMemberRoleMapper.getRolesOnOrgMember(userCode, orgCode, appCode);
	}
}
