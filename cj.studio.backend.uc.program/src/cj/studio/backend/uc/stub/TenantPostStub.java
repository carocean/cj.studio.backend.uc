package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.TenantPost;
import cj.studio.backend.uc.service.ITenantPostService;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.ultimate.util.StringUtil;

import java.util.List;

@CjService(name = "/tenant/post.service")
public class TenantPostStub implements ITenantPostStub {
	@CjServiceRef(refByName = "ucplugin.tenantPostService")
	ITenantPostService tenantPostService;

	@Override
	public void addPost(String tenantCode, String postCode, String postName, String comment) throws CircuitException {
		if (StringUtil.isEmpty(tenantCode)) {
			throw new CircuitException("404", "缺少参数：tenantCode");
		}
		if (StringUtil.isEmpty(postCode)) {
			throw new CircuitException("404", "缺少参数：postCode");
		}
		if (getPost(tenantCode, postCode) != null) {
			throw new CircuitException("500", "已存在岗位：" + postCode);
		}
		TenantPost post = new TenantPost();
		post.setCode(postCode);
		post.setComment(comment);
		post.setName(postName);
		post.setTenant(tenantCode);
		tenantPostService.addPost(post);
	}

	@Override
	public TenantPost getPost(String tenantCode, String postCode) {
		return tenantPostService.getPost(tenantCode, postCode);
	}

	@Override
	public void removePost(String tenantCode, String postCode) {
		tenantPostService.removePost(tenantCode, postCode);
	}

	@Override
	public List<TenantPost> pagePost(String tenantCode, int currPage, int pageSize) {
		return tenantPostService.pagePost(tenantCode, currPage, pageSize);
	}

	@Override
	public List<Account> getAccountsOnPost(String tenantCode, String postCode) {
		return tenantPostService.getAccountsOnPost(tenantCode, postCode);
	}

	@Override
	public List<Account> pageAccountsOnPost(String tenantCode, String postCode, int currPage, int pageSize) {
		return tenantPostService.pageAccountsOnPost(tenantCode, postCode, currPage, pageSize);
	}

	@Override
	public void addAccountOnPost(String tenantCode, String accountCode, String postCode) {
		tenantPostService.addAccountOnPost(tenantCode, accountCode, postCode);
	}

	@Override
	public void removeAccountOnPost(String tenantCode, String accountCode, String postCode) {
		tenantPostService.removeAccountOnPost(tenantCode, accountCode, postCode);
	}

	@Override
	public void emptyAccountsOnPost(String tenantCode, String postCode) {
		tenantPostService.emptyAccountsOnPost(tenantCode, postCode);
	}

}
