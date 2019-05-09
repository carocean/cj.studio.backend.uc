package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.bo.UserAttribute;
import cj.studio.backend.uc.bo.UserAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAttributeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattr
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	long countByExample(UserAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattr
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int deleteByExample(UserAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattr
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattr
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int insert(UserAttribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattr
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int insertSelective(UserAttribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattr
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	List<UserAttribute> selectByExample(UserAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattr
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	UserAttribute selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattr
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int updateByExampleSelective(@Param("record") UserAttribute record, @Param("example") UserAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattr
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int updateByExample(@Param("record") UserAttribute record, @Param("example") UserAttributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattr
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int updateByPrimaryKeySelective(UserAttribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattr
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int updateByPrimaryKey(UserAttribute record);

	List<User> getUsersByAttrValue(@Param(value = "segCode") String segCode, @Param(value = "attrCode") String attrCode,
			@Param(value = "value") String value);

	List<User> getUsersByAttrValueOnSegment(@Param(value = "segCode")String segCode,@Param(value = "value")  String value);
}