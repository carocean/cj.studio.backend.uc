package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.OrgMember;
import cj.studio.backend.uc.bo.OrgMemberExample;
import cj.studio.backend.uc.bo.Organization;
import cj.studio.backend.uc.bo.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgMemberMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table orgmember
	 * 
	 * @mbg.generated Mon Jan 14 22:51:29 CST 2019
	 */
	long countByExample(OrgMemberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table orgmember
	 * 
	 * @mbg.generated Mon Jan 14 22:51:29 CST 2019
	 */
	int deleteByExample(OrgMemberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table orgmember
	 * 
	 * @mbg.generated Mon Jan 14 22:51:29 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table orgmember
	 * 
	 * @mbg.generated Mon Jan 14 22:51:29 CST 2019
	 */
	int insert(OrgMember record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table orgmember
	 * 
	 * @mbg.generated Mon Jan 14 22:51:29 CST 2019
	 */
	int insertSelective(OrgMember record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table orgmember
	 * 
	 * @mbg.generated Mon Jan 14 22:51:29 CST 2019
	 */
	List<OrgMember> selectByExample(OrgMemberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table orgmember
	 * 
	 * @mbg.generated Mon Jan 14 22:51:29 CST 2019
	 */
	OrgMember selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table orgmember
	 * 
	 * @mbg.generated Mon Jan 14 22:51:29 CST 2019
	 */
	int updateByExampleSelective(@Param("record") OrgMember record, @Param("example") OrgMemberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table orgmember
	 * 
	 * @mbg.generated Mon Jan 14 22:51:29 CST 2019
	 */
	int updateByExample(@Param("record") OrgMember record, @Param("example") OrgMemberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table orgmember
	 * 
	 * @mbg.generated Mon Jan 14 22:51:29 CST 2019
	 */
	int updateByPrimaryKeySelective(OrgMember record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table orgmember
	 * 
	 * @mbg.generated Mon Jan 14 22:51:29 CST 2019
	 */
	int updateByPrimaryKey(OrgMember record);

	List<User> getMembers(@Param(value = "appCode") String appCode, @Param(value = "orgCode") String orgCode);

	List<Organization> getOrganizations(@Param(value = "appCode") String appCode,
			@Param(value = "userCode") String userCode);
}