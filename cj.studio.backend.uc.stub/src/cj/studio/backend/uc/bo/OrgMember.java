package cj.studio.backend.uc.bo;

public class OrgMember {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orgmember.id
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orgmember.orgCode
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	private String orgcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orgmember.userCode
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	private String usercode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orgmember.appCode
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	private String appcode;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orgmember.id
	 * @return  the value of orgmember.id
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orgmember.id
	 * @param id  the value for orgmember.id
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orgmember.orgCode
	 * @return  the value of orgmember.orgCode
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public String getOrgcode() {
		return orgcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orgmember.orgCode
	 * @param orgcode  the value for orgmember.orgCode
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orgmember.userCode
	 * @return  the value of orgmember.userCode
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public String getUsercode() {
		return usercode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orgmember.userCode
	 * @param usercode  the value for orgmember.userCode
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orgmember.appCode
	 * @return  the value of orgmember.appCode
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public String getAppcode() {
		return appcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orgmember.appCode
	 * @param appcode  the value for orgmember.appCode
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}
}