package cj.studio.backend.uc.plugin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cj.studio.backend.uc.bo.Tenant;
import cj.studio.backend.uc.bo.TenantExample;

public interface TenantMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenant
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	long countByExample(TenantExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenant
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int deleteByExample(TenantExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenant
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenant
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int insert(Tenant record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenant
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int insertSelective(Tenant record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenant
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	List<Tenant> selectByExample(TenantExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenant
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	Tenant selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenant
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Tenant record, @Param("example") TenantExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenant
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByExample(@Param("record") Tenant record, @Param("example") TenantExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenant
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByPrimaryKeySelective(Tenant record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenant
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByPrimaryKey(Tenant record);

	List<Tenant> getPage(@Param(value="currPage")int currPage, @Param(value="pageSize")int pageSize);
}