package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.UserSegment;
import cj.studio.backend.uc.bo.UserSegmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSegmentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userseg
	 * @mbg.generated  Fri May 10 19:03:13 CST 2019
	 */
	long countByExample(UserSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userseg
	 * @mbg.generated  Fri May 10 19:03:13 CST 2019
	 */
	int deleteByExample(UserSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userseg
	 * @mbg.generated  Fri May 10 19:03:13 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userseg
	 * @mbg.generated  Fri May 10 19:03:13 CST 2019
	 */
	int insert(UserSegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userseg
	 * @mbg.generated  Fri May 10 19:03:13 CST 2019
	 */
	int insertSelective(UserSegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userseg
	 * @mbg.generated  Fri May 10 19:03:13 CST 2019
	 */
	List<UserSegment> selectByExample(UserSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userseg
	 * @mbg.generated  Fri May 10 19:03:13 CST 2019
	 */
	UserSegment selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userseg
	 * @mbg.generated  Fri May 10 19:03:13 CST 2019
	 */
	int updateByExampleSelective(@Param("record") UserSegment record, @Param("example") UserSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userseg
	 * @mbg.generated  Fri May 10 19:03:13 CST 2019
	 */
	int updateByExample(@Param("record") UserSegment record, @Param("example") UserSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userseg
	 * @mbg.generated  Fri May 10 19:03:13 CST 2019
	 */
	int updateByPrimaryKeySelective(UserSegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userseg
	 * @mbg.generated  Fri May 10 19:03:13 CST 2019
	 */
	int updateByPrimaryKey(UserSegment record);


	List<Segment> getSegments();
}