package cj.studio.backend.uc.bo;

public class Tenant {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenant.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenant.code
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenant.name
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenant.createTime
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private Long createtime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenant.id
	 * @return  the value of tenant.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenant.id
	 * @param id  the value for tenant.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenant.code
	 * @return  the value of tenant.code
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenant.code
	 * @param code  the value for tenant.code
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenant.name
	 * @return  the value of tenant.name
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenant.name
	 * @param name  the value for tenant.name
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenant.createTime
	 * @return  the value of tenant.createTime
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public Long getCreatetime() {
		return createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenant.createTime
	 * @param createtime  the value for tenant.createTime
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setCreatetime(Long createtime) {
		this.createtime = createtime;
	}
}