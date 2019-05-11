package cj.studio.backend.uc.plugin.dao;

import cj.studio.backend.uc.bo.Company;
import cj.studio.backend.uc.bo.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	long countByExample(CompanyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int deleteByExample(CompanyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int insert(Company record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int insertSelective(Company record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	List<Company> selectByExample(CompanyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	Company selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByPrimaryKeySelective(Company record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table company
	 * @mbg.generated  Sat May 11 15:47:57 CST 2019
	 */
	int updateByPrimaryKey(Company record);

	List<Company> page(@Param("currPage")int currPage, @Param("pageSize")int pageSize);
}