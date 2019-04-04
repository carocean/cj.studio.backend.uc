package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.AccountSegment;
import cj.studio.backend.uc.bo.AccountSegmentExample;
import cj.studio.backend.uc.bo.Segment;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountSegmentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountseg
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	long countByExample(AccountSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountseg
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	int deleteByExample(AccountSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountseg
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountseg
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	int insert(AccountSegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountseg
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	int insertSelective(AccountSegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountseg
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	List<AccountSegment> selectByExample(AccountSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountseg
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	AccountSegment selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountseg
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	int updateByExampleSelective(@Param("record") AccountSegment record,
			@Param("example") AccountSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountseg
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	int updateByExample(@Param("record") AccountSegment record, @Param("example") AccountSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountseg
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	int updateByPrimaryKeySelective(AccountSegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table accountseg
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	int updateByPrimaryKey(AccountSegment record);

	List<Segment> getSegments(@Param(value="tenantCode")String tenantCode,@Param(value="accountCode")String accountCode);
}