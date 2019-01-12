package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.OrgMemberRole;
import cj.studio.backend.uc.bo.OrgMemberRoleExample;
import cj.studio.backend.uc.bo.OrgMemberRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgMemberRoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orgmemrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	long countByExample(OrgMemberRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orgmemrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int deleteByExample(OrgMemberRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orgmemrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int deleteByPrimaryKey(OrgMemberRoleKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orgmemrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int insert(OrgMemberRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orgmemrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int insertSelective(OrgMemberRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orgmemrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	List<OrgMemberRole> selectByExample(OrgMemberRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orgmemrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	OrgMemberRole selectByPrimaryKey(OrgMemberRoleKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orgmemrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int updateByExampleSelective(@Param("record") OrgMemberRole record, @Param("example") OrgMemberRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orgmemrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int updateByExample(@Param("record") OrgMemberRole record, @Param("example") OrgMemberRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orgmemrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int updateByPrimaryKeySelective(OrgMemberRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orgmemrole
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int updateByPrimaryKey(OrgMemberRole record);
}