package cj.studio.backend.uc.service;

import java.util.List;

import cj.studio.backend.uc.bo.UA;

public interface IUAService {

	void add(UA ua);

	void emptyUsersOnColCode(String tenantCode, String colType, String colCode);

	void removeUserOnColCode(String tenantCode, String userCode, String colType, String colCode);

	List<String> getUsersOnColCode(String tenantCode, String colType, String colCode);

	List<String> pageUsersOnColCode(String tenantCode, String colType, String colCode, int currPage,
			int pageSize);

}
