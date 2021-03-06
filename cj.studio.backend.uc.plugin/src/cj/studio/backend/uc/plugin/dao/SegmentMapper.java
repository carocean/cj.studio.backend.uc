package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.SegmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SegmentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table segment
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	long countByExample(SegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table segment
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int deleteByExample(SegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table segment
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table segment
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int insert(Segment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table segment
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int insertSelective(Segment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table segment
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	List<Segment> selectByExample(SegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table segment
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	Segment selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table segment
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Segment record, @Param("example") SegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table segment
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int updateByExample(@Param("record") Segment record, @Param("example") SegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table segment
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int updateByPrimaryKeySelective(Segment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table segment
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int updateByPrimaryKey(Segment record);

	List<Segment> getPage(@Param(value="currPage")int currPage, @Param(value="pageSize")int pageSize);
}