package cj.studio.backend.uc.plugin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.AccountExample;

public interface AccountMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	long countByExample(AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int deleteByExample(AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int insert(Account record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int insertSelective(Account record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	List<Account> selectByExample(AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	Account selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int updateByPrimaryKeySelective(Account record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int updateByPrimaryKey(Account record);

	List<Account> getPage(@Param(value="tenantCode")String tenantCode,@Param(value="currPage")int currPage, @Param(value="pageSize")int pageSize);

}