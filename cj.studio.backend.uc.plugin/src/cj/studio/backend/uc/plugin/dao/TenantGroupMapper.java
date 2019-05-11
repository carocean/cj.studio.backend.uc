package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.TenantGroup;
import cj.studio.backend.uc.bo.TenantGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenantGroupMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	long countByExample(TenantGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int deleteByExample(TenantGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int insert(TenantGroup record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int insertSelective(TenantGroup record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	List<TenantGroup> selectByExample(TenantGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	TenantGroup selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByExampleSelective(@Param("record") TenantGroup record, @Param("example") TenantGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByExample(@Param("record") TenantGroup record, @Param("example") TenantGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByPrimaryKeySelective(TenantGroup record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenantgroup
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByPrimaryKey(TenantGroup record);

	List<TenantGroup> pageGroup(@Param("tenantCode")String tenantCode, @Param("currPage")int currPage,@Param("pageSize") int pageSize);
}