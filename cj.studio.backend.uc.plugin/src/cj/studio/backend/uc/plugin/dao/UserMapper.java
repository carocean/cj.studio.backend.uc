package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.User;
import cj.studio.backend.uc.bo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	long countByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int deleteByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	List<User> selectByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	User selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	int updateByPrimaryKey(User record);

	List<User> getPage(@Param(value="currPage")int currPage, @Param(value="pageSize")int pageSize);

	int existsCode(@Param(value="userCode")String userCode);
}