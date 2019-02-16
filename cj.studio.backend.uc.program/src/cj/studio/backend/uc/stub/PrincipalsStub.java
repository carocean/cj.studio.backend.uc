package cj.studio.backend.uc.stub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cj.studio.backend.uacc.security.PrincipalCollection;
import cj.studio.backend.uacc.security.Principals;
import cj.studio.backend.uacc.security.Relactionship;
import cj.studio.backend.uacc.security.RshipType;
import cj.studio.backend.uacc.security.stub.IPrincipalsStub;
import cj.studio.backend.uc.bo.Role;
import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.service.IRoleService;
import cj.studio.backend.uc.service.IUserService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;
import cj.ultimate.util.StringUtil;

@CjService(name = "/principals.service")
public class PrincipalsStub extends GatewayAppSiteRestStub implements IPrincipalsStub {
	Map<String, PrincipalCollection> tables;
	@CjServiceRef(refByName = "ucplugin.userService")
	IUserService userService;
	@CjServiceRef(refByName = "ucplugin.roleService")
	IRoleService roleService;

	public PrincipalsStub() {
		tables = new HashMap<>();
		PrincipalCollection userTable = new PrincipalCollection();
		userTable.setColName("user");
		userTable.setColTitle("用户");
		userTable.setSysCode("uc");
		Relactionship userrole = new Relactionship();
		userrole.setColName("role");
		userrole.setType(RshipType.manyToMany);
		userTable.getRelactionships().add(userrole);
		tables.put(userTable.getColName(), userTable);

		PrincipalCollection roleTable = new PrincipalCollection();
		roleTable.setColName("role");
		roleTable.setColTitle("角色");
		roleTable.setSysCode("uc");
		Relactionship roleuser = new Relactionship();
		roleuser.setColName("user");
		roleuser.setType(RshipType.manyToMany);
		roleTable.getRelactionships().add(roleuser);
		tables.put(roleTable.getColName(), roleTable);
	}

	@Override
	public List<PrincipalCollection> getAllPrincipalCollections(String sysCode) {
		checkCodeError(sysCode);
		return Arrays.asList(tables.values().toArray(new PrincipalCollection[0]));
	}

	@Override
	public List<Principals> getChildPrincipals(String sysCode, String principalColName, String parentPrincipalCode,
			int currPage, int pageSize) {
		checkCodeError(sysCode);

		if ("user".equals(principalColName)) {
			return getUserChildPrincipals(currPage, pageSize);
		}
		if ("role".equals(principalColName)) {
			return getRoleChildPrincipals(currPage, pageSize);
		}
		return new ArrayList<>();
	}

	private List<Principals> getRoleChildPrincipals(int currPage, int pageSize) {
		List<Principals> list = new ArrayList<Principals>();
		List<Role> roles = roleService.getPage(currPage, pageSize);
		for (Role r : roles) {
			Principals p = new Principals(r.getCode(), r.getName(), "", r.getComment(), true);
			list.add(p);
		}
		return list;
	}

	private List<Principals> getUserChildPrincipals(int currPage, int pageSize) {
		List<Principals> list = new ArrayList<Principals>();
		List<User> users = userService.getPage(currPage, pageSize);
		for (User u : users) {
			String name = "";
			if (!StringUtil.isEmpty(u.getNickname())) {
				name = u.getNickname();
			}
			if (StringUtil.isEmpty(name) && !StringUtil.isEmpty(u.getRealname())) {
				name = u.getRealname();
			}
			Principals p = new Principals(u.getUsercode(), name, u.getFace(), "", true);
			list.add(p);
		}
		return list;
	}

	@Override
	public List<Principals> getContainsPrincipals(String sysCode, String principalColName,
			String relactionshipPrincipalColName, String principalCode, int currPage, int pageSize) {
		checkCodeError(sysCode);

		if ("user".equals(principalColName) && "user_role".equals(relactionshipPrincipalColName)) {
			return getRolesOnUser(principalCode, currPage, pageSize);
		}
		if ("role".equals(principalColName) && "role_user".equals(relactionshipPrincipalColName)) {
			return getUsersOnRole(principalCode, currPage, pageSize);
		}
		return new ArrayList<>();
	}

	private List<Principals> getUsersOnRole(String principalCode, int currPage, int pageSize) {
		List<Principals> list = new ArrayList<Principals>();
		List<User> users = roleService.getUsersOnRoleByPage(principalCode,currPage,pageSize);
		for (User u : users) {
			String name = "";             
			if (!StringUtil.isEmpty(u.getNickname())) {
				name = u.getNickname();
			}
			if (StringUtil.isEmpty(name) && !StringUtil.isEmpty(u.getRealname())) {
				name = u.getRealname();
			}
			Principals p = new Principals(u.getUsercode(), name, u.getFace(), "", true);
			list.add(p);
		}
		return list;
	}

	private List<Principals> getRolesOnUser(String principalCode, int currPage, int pageSize) {
		List<Principals> list = new ArrayList<Principals>();
		List<Role> roles = roleService.getRolesOnUserByPage(principalCode,currPage,pageSize);
		for (Role r : roles) {
			Principals p = new Principals(r.getCode(), r.getName(), "", r.getComment(), true);
			list.add(p);
		}
		return list;
	}

	@Override
	public PrincipalCollection getPrincipalCollection(String sysCode, String principalColName) {
		checkCodeError(sysCode);
		return tables.get(principalColName);
	}

	private void checkCodeError(String sysCode) {
		if (!"uc".equals(sysCode)) {
			throw new EcmException("仅提供uc系统的访问：" + sysCode);
		}

	}

}
