package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantGroup;
import cj.studio.backend.uc.service.ITenantGroupService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.ultimate.util.StringUtil;

import java.util.List;

@CjService(name = "/tenant/group.service")
public class TenantGroupStub implements ITenantGroupStub {
	@CjServiceRef(refByName = "ucplugin.tenantGroupService")
	ITenantGroupService tenantGroupService;
	
	@Override
	public void addGroup(String tenantCode, String groupCode, String groupName, String comment) throws CircuitException {
		if(StringUtil.isEmpty(tenantCode)) {
			throw new CircuitException("404", "缺少参数：tenantCode");
		}
		if(StringUtil.isEmpty(groupCode)) {
			throw new CircuitException("404", "缺少参数：groupCode");
		}
		if (getGroup(tenantCode, groupCode) != null) {
			throw new CircuitException("500", "已存在群组：" + groupCode);
		}
		
		TenantGroup group = new TenantGroup();
		group.setCode(groupCode);
		group.setComment(comment);
		group.setName(groupName);
		group.setTenant(tenantCode);
		tenantGroupService.addGroup(group);
	}

	@Override
	public TenantGroup getGroup(String tenantCode, String groupCode) {
		return tenantGroupService.getGroup(tenantCode,groupCode);
	}

	@Override
	public void removeGroup(String tenantCode, String groupCode) {
		tenantGroupService.removeGroup(tenantCode,groupCode);
	}

	@Override
	public List<TenantGroup> pageGroup(String tenantCode, int currPage, int pageSize) {
		return tenantGroupService.pageGroup(tenantCode,currPage,pageSize);
	}

	@Override
	public List<Account> getAccountsOnGroup(String tenantCode, String groupCode) {
		return tenantGroupService.getAccountsOnGroup(tenantCode,groupCode);
	}

	@Override
	public List<Account> pageAccountsOnGroup(String tenantCode, String groupCode, int currPage, int pageSize) {
		return tenantGroupService.pageAccountsOnGroup(tenantCode,groupCode,currPage,pageSize);
	}

	@Override
	public void addAccountOnGroup(String tenantCode, String accountCode, String groupCode) {
		tenantGroupService.addAccountOnGroup(tenantCode,accountCode,groupCode);
	}

	@Override
	public void removeAccountOnGroup(String tenantCode, String accountCode, String groupCode) {
		tenantGroupService.removeAccountOnGroup(tenantCode,accountCode,groupCode);
	}

	@Override
	public void emptyAccountsOnGroup(String tenantCode, String groupCode) {
		tenantGroupService.emptyAccountsOnGroup(tenantCode,groupCode);
	}

}
