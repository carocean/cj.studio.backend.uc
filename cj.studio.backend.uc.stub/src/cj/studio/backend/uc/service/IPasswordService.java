package cj.studio.backend.uc.service;
/**
 * 密码服务，用于校验、修改或为用户添加密码
 * @author caroceanjofers
 *
 */
public interface IPasswordService {
	void setPassword(String userCode,String pwd);
	void updatePassword(String userCode,String old,String pwd);
	void checkPassword(String userCode,String pwd) throws CheckPasswordException;
}
