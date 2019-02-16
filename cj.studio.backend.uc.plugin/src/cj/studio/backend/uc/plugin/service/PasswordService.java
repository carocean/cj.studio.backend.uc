package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.bo.UserAttribute;
import cj.studio.backend.uc.plugin.util.Encript;
import cj.studio.backend.uc.service.CheckPasswordException;
import cj.studio.backend.uc.service.IPasswordService;
import cj.studio.backend.uc.service.IUserService;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

@CjBridge(aspects = "@transaction")
@CjService(name = "passwordService")
public class PasswordService implements IPasswordService {
	@CjServiceRef
	IUserService userService;

	@CjTransaction
	@Override
	public void setPassword(String userCode, String pwd) {
		pwd=Encript.md5(pwd);
		User user = userService.getUser(userCode);
		if (user == null) {
			throw new RuntimeException("用户不存在");
		}
		List<UserAttribute> attrs = userService.getUserAttributes(userCode, "secretStore", "password");
		if (!attrs.isEmpty()) {
			throw new RuntimeException("用户密码已存在");
		}
		UserAttribute attr = new UserAttribute();
		attr.setAttrcode("password");
		attr.setSegcode("secretStore");
		attr.setUsercode(userCode);
		attr.setValue(pwd);
		userService.addUserAttribute(attr);
	}

	@CjTransaction
	@Override
	public void updatePassword(String userCode,String old, String pwd) {
		old=Encript.md5(old);
		pwd=Encript.md5(pwd);
		User user = userService.getUser(userCode);
		if (user == null) {
			throw new RuntimeException("用户不存在");
		}
		UserAttribute attr = userService.getUserAttribute(userCode, "secretStore", "password", old);
		if (attr == null) {
			throw new RuntimeException("用户原始密码验证失败");
		}
		userService.removeUserAttribute(userCode, "secretStore", "password");
		attr = new UserAttribute();
		attr.setAttrcode("password");
		attr.setSegcode("secretStore");
		attr.setUsercode(userCode);
		attr.setValue(pwd);
		userService.addUserAttribute(attr);
	}

	@CjTransaction
	@Override
	public void checkPassword(String userCode, String pwd) throws CheckPasswordException {
		pwd=Encript.md5(pwd);
		User user = userService.getUser(userCode);
		if (user == null) {
			throw new CheckPasswordException("用户不存在");
		}
		UserAttribute attr = userService.getUserAttribute(userCode, "secretStore", "password", pwd);
		if (attr == null) {
			throw new CheckPasswordException("密码验认失败");
		}
	}

}
