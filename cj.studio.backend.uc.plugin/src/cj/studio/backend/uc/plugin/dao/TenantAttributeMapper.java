package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.TenantAttribute;
import cj.studio.backend.uc.bo.TenantAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenantAttributeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantattr
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	long countByExample(TenantAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantattr
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int deleteByExample(TenantAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantattr
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantattr
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int insert(TenantAttribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantattr
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int insertSelective(TenantAttribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantattr
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	List<TenantAttribute> selectByExample(TenantAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantattr
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	TenantAttribute selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantattr
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByExampleSelective(@Param("record") TenantAttribute record,
			@Param("example") TenantAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantattr
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByExample(@Param("record") TenantAttribute record, @Param("example") TenantAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantattr
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByPrimaryKeySelective(TenantAttribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantattr
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByPrimaryKey(TenantAttribute record);
}