package cj.studio.backend.uc.bo;

public class Organization {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column organization.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column organization.code
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column organization.tenantCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String tenantcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column organization.name
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column organization.pid
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String pid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column organization.id
	 * @return  the value of organization.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column organization.id
	 * @param id  the value for organization.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column organization.code
	 * @return  the value of organization.code
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column organization.code
	 * @param code  the value for organization.code
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column organization.tenantCode
	 * @return  the value of organization.tenantCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getTenantcode() {
		return tenantcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column organization.tenantCode
	 * @param tenantcode  the value for organization.tenantCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setTenantcode(String tenantcode) {
		this.tenantcode = tenantcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column organization.name
	 * @return  the value of organization.name
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column organization.name
	 * @param name  the value for organization.name
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column organization.pid
	 * @return  the value of organization.pid
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column organization.pid
	 * @param pid  the value for organization.pid
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}
}