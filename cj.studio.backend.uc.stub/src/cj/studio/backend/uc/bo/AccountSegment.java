package cj.studio.backend.uc.bo;

public class AccountSegment {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column accountseg.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column accountseg.accountCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String accountcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column accountseg.tenantCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String tenantcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column accountseg.segCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String segcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column accountseg.sort
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private Integer sort;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column accountseg.id
	 * @return  the value of accountseg.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column accountseg.id
	 * @param id  the value for accountseg.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column accountseg.accountCode
	 * @return  the value of accountseg.accountCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getAccountcode() {
		return accountcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column accountseg.accountCode
	 * @param accountcode  the value for accountseg.accountCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setAccountcode(String accountcode) {
		this.accountcode = accountcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column accountseg.tenantCode
	 * @return  the value of accountseg.tenantCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getTenantcode() {
		return tenantcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column accountseg.tenantCode
	 * @param tenantcode  the value for accountseg.tenantCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setTenantcode(String tenantcode) {
		this.tenantcode = tenantcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column accountseg.segCode
	 * @return  the value of accountseg.segCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getSegcode() {
		return segcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column accountseg.segCode
	 * @param segcode  the value for accountseg.segCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setSegcode(String segcode) {
		this.segcode = segcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column accountseg.sort
	 * @return  the value of accountseg.sort
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public Integer getSort() {
		return sort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column accountseg.sort
	 * @param sort  the value for accountseg.sort
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
}