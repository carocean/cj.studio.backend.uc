package cj.studio.backend.uc.stub;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cj.studio.backend.uacc.security.ProtectedObject;
import cj.studio.backend.uacc.security.ProtectedObjectCollection;
import cj.studio.backend.uacc.security.stub.IProtectedObjectStub;
import cj.studio.backend.uc.service.IRoleService;
import cj.studio.backend.uc.service.IUserService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.gateway.stub.GatewayAppSiteRestStub;
import cj.studio.gateway.stub.annotation.CjStubMethod;
import cj.studio.gateway.stub.annotation.CjStubService;
import cj.ultimate.util.StringUtil;

@CjService(name = "/protectedObject.service")
public class ProtectedObjectStub extends GatewayAppSiteRestStub implements IProtectedObjectStub {
	Map<String, ProtectedObjectCollection> tables;
	@CjServiceRef(refByName = "ucplugin.userService")
	IUserService userService;
	@CjServiceRef(refByName = "ucplugin.roleService")
	IRoleService roleService;
	List<ProtectedObject> ucServices;

	public ProtectedObjectStub() {
		ucServices = new ArrayList<>();
		tables = new HashMap<>();
		ProtectedObjectCollection col = new ProtectedObjectCollection();
		col.setColName("ucServices");
		col.setColTitle("用户中心服务");
		col.setSysCode("uc");
		tables.put(col.getColName(), col);

		ProtectedObject user = new ProtectedObject();
		CjStubService us = IUserStub.class.getDeclaredAnnotation(CjStubService.class);
		user.setCode(us.bindService());
		user.setName(us.usage());
		ucServices.add(user);
		for (Method m : IUserStub.class.getDeclaredMethods()) {
			CjStubMethod sm = m.getAnnotation(CjStubMethod.class);
			if (sm == null)
				continue;
			ProtectedObject userM = new ProtectedObject();
			userM.setCode(StringUtil.isEmpty(sm.alias()) ? m.getName() : sm.alias());
			userM.setLeaf(true);
			userM.setName(sm.usage());
			user.getExtra().put(userM.getCode(), userM);
		}

		ProtectedObject password = new ProtectedObject();
		CjStubService ps = IPasswordStub.class.getDeclaredAnnotation(CjStubService.class);
		password.setCode(ps.bindService());
		password.setName(ps.usage());
		ucServices.add(password);
		for (Method m : IPasswordStub.class.getDeclaredMethods()) {
			CjStubMethod sm = m.getAnnotation(CjStubMethod.class);
			if (sm == null)
				continue;
			ProtectedObject userM = new ProtectedObject();
			userM.setCode(StringUtil.isEmpty(sm.alias()) ? m.getName() : sm.alias());
			userM.setLeaf(true);
			userM.setName(sm.usage());
			password.getExtra().put(userM.getCode(), userM);
		}

		ProtectedObject app = new ProtectedObject();
		CjStubService as = ITenantStub.class.getDeclaredAnnotation(CjStubService.class);
		app.setCode(as.bindService());
		app.setName(as.usage());
		ucServices.add(app);
		for (Method m : ITenantStub.class.getDeclaredMethods()) {
			CjStubMethod sm = m.getAnnotation(CjStubMethod.class);
			if (sm == null)
				continue;
			ProtectedObject userM = new ProtectedObject();
			userM.setCode(StringUtil.isEmpty(sm.alias()) ? m.getName() : sm.alias());
			userM.setLeaf(true);
			userM.setName(sm.usage());
			app.getExtra().put(userM.getCode(), userM);
		}
		ProtectedObject auth = new ProtectedObject();
		CjStubService auths = IAuthenticationStub.class.getDeclaredAnnotation(CjStubService.class);
		auth.setCode(auths.bindService());
		auth.setName(auths.usage());
		ucServices.add(auth);
		for (Method m : IAuthenticationStub.class.getDeclaredMethods()) {
			CjStubMethod sm = m.getAnnotation(CjStubMethod.class);
			if (sm == null)
				continue;
			ProtectedObject userM = new ProtectedObject();
			userM.setCode(StringUtil.isEmpty(sm.alias()) ? m.getName() : sm.alias());
			userM.setLeaf(true);
			userM.setName(sm.usage());
			auth.getExtra().put(userM.getCode(), userM);
		}
		ProtectedObject role = new ProtectedObject();
		CjStubService rs = IRoleStub.class.getDeclaredAnnotation(CjStubService.class);
		role.setCode(rs.bindService());
		role.setName(rs.usage());
		ucServices.add(role);
		for (Method m : IRoleStub.class.getDeclaredMethods()) {
			CjStubMethod sm = m.getAnnotation(CjStubMethod.class);
			if (sm == null)
				continue;
			ProtectedObject userM = new ProtectedObject();
			userM.setCode(StringUtil.isEmpty(sm.alias()) ? m.getName() : sm.alias());
			userM.setLeaf(true);
			userM.setName(sm.usage());
			role.getExtra().put(userM.getCode(), userM);
		}
	}

	private void checkCodeError(String sysCode) {
		if (!"uc".equals(sysCode)) {
			throw new EcmException("仅提供uc系统的访问：" + sysCode);
		}

	}

	@Override
	public List<ProtectedObjectCollection> getAllProtectedObjectCollection(String sysCode) {
		checkCodeError(sysCode);
		return Arrays.asList(tables.values().toArray(new ProtectedObjectCollection[0]));
	}

	@Override
	public List<ProtectedObject> getChildObjects(String sysCode, String objColName, String parentObjCode, int currPage,
			int pageSize) {
		checkCodeError(sysCode);
		if (tables.containsKey(objColName)) {
			return getChildObjects(tables.get(objColName), parentObjCode, currPage, pageSize);
		}
		return new ArrayList<>();
	}

	private List<ProtectedObject> getChildObjects(ProtectedObjectCollection col, String parentObjCode, int currPage,
			int pageSize) {
		switch (col.getColName()) {
		case "ucServices":
			return getUcServiceObjects(parentObjCode, currPage, pageSize);
		}
		return new ArrayList<>();
	}

	private List<ProtectedObject> getUcServiceObjects(String parentObjCode, int currPage, int pageSize) {
		if (StringUtil.isEmpty(parentObjCode) || "$".equals(parentObjCode)) {
			return listRootUcServiceObjects(currPage, pageSize);
		}
		ProtectedObject obj = null;
		for (ProtectedObject po : ucServices) {
			if (po.getCode().equals(parentObjCode)) {
				obj = po;
				break;
			}
		}
		List<ProtectedObject> list = new ArrayList<>();
		if (obj == null)
			return list;
		Map<String, Object> map = obj.getExtra();
		ProtectedObject[] arr = map.values().toArray(new ProtectedObject[0]);
		for (int i = currPage; i < pageSize + currPage&&i<ucServices.size(); i++) {
			ProtectedObject bo = arr[i];
			ProtectedObject copy=new ProtectedObject();
			copy.setCode(bo.getCode());
			copy.setLeaf(bo.isLeaf());
			copy.setName(bo.getName());
			list.add(copy);
		}
		return list;
	}

	private List<ProtectedObject> listRootUcServiceObjects(int currPage, int pageSize) {
		List<ProtectedObject> list = new ArrayList<>();
		for (int i = currPage; i < pageSize + currPage&&i<ucServices.size(); i++) {
			ProtectedObject bo = ucServices.get(i);
			ProtectedObject copy=new ProtectedObject();
			copy.setCode(bo.getCode());
			copy.setLeaf(bo.isLeaf());
			copy.setName(bo.getName());
			list.add(copy);
		}
		return list;
	}

	@Override
	public ProtectedObjectCollection getProtectedObjectCollection(String sysCode, String objColName) {
		checkCodeError(sysCode);
		return tables.get(objColName);
	}

}
