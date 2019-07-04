package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.CompanySegment;
import cj.studio.backend.uc.bo.CompanySegmentExample;
import cj.studio.backend.uc.bo.Segment;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanySegmentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table companyseg
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	long countByExample(CompanySegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table companyseg
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int deleteByExample(CompanySegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table companyseg
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table companyseg
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int insert(CompanySegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table companyseg
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int insertSelective(CompanySegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table companyseg
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	List<CompanySegment> selectByExample(CompanySegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table companyseg
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	CompanySegment selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table companyseg
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int updateByExampleSelective(@Param("record") CompanySegment record,
			@Param("example") CompanySegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table companyseg
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int updateByExample(@Param("record") CompanySegment record, @Param("example") CompanySegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table companyseg
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int updateByPrimaryKeySelective(CompanySegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table companyseg
	 * @mbg.generated  Thu Jul 04 12:56:50 CST 2019
	 */
	int updateByPrimaryKey(CompanySegment record);

	List<Segment> getSegments();
}