package cj.studio.backend.uc.bo;

public class UserSegment {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column userseg.id
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column userseg.userCode
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	private String usercode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column userseg.segCode
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	private String segcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column userseg.sort
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	private Integer sort;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column userseg.id
	 * @return  the value of userseg.id
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column userseg.id
	 * @param id  the value for userseg.id
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column userseg.userCode
	 * @return  the value of userseg.userCode
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	public String getUsercode() {
		return usercode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column userseg.userCode
	 * @param usercode  the value for userseg.userCode
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column userseg.segCode
	 * @return  the value of userseg.segCode
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	public String getSegcode() {
		return segcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column userseg.segCode
	 * @param segcode  the value for userseg.segCode
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	public void setSegcode(String segcode) {
		this.segcode = segcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column userseg.sort
	 * @return  the value of userseg.sort
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	public Integer getSort() {
		return sort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column userseg.sort
	 * @param sort  the value for userseg.sort
	 * @mbg.generated  Mon Jan 14 17:59:03 CST 2019
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
}