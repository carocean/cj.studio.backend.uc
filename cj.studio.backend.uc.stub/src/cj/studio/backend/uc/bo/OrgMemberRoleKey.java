package cj.studio.backend.uc.bo;

public class OrgMemberRoleKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orgmemrole.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orgmemrole.orgCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String orgcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orgmemrole.userCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String usercode;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orgmemrole.id
	 * @return  the value of orgmemrole.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orgmemrole.id
	 * @param id  the value for orgmemrole.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orgmemrole.orgCode
	 * @return  the value of orgmemrole.orgCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getOrgcode() {
		return orgcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orgmemrole.orgCode
	 * @param orgcode  the value for orgmemrole.orgCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orgmemrole.userCode
	 * @return  the value of orgmemrole.userCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getUsercode() {
		return usercode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orgmemrole.userCode
	 * @param usercode  the value for orgmemrole.userCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
}