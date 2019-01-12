package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.Application;
import cj.studio.backend.uc.bo.ApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table application
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	long countByExample(ApplicationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table application
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int deleteByExample(ApplicationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table application
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table application
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int insert(Application record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table application
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int insertSelective(Application record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table application
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	List<Application> selectByExample(ApplicationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table application
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	Application selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table application
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Application record, @Param("example") ApplicationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table application
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int updateByExample(@Param("record") Application record, @Param("example") ApplicationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table application
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int updateByPrimaryKeySelective(Application record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table application
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	int updateByPrimaryKey(Application record);
}