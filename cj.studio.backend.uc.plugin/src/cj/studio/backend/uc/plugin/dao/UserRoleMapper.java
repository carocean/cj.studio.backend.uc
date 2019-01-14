package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.UserRole;
import cj.studio.backend.uc.bo.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	long countByExample(UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	int deleteByExample(UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	int insert(UserRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	int insertSelective(UserRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	List<UserRole> selectByExample(UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	UserRole selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	int updateByPrimaryKeySelective(UserRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userrole
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	int updateByPrimaryKey(UserRole record);
}