package cj.studio.backend.uc.bo;

public class TenantRole {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenantrole.id
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenantrole.code
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenantrole.name
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenantrole.tenant
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	private String tenant;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenantrole.comment
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	private String comment;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenantrole.id
	 * @return  the value of tenantrole.id
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenantrole.id
	 * @param id  the value for tenantrole.id
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenantrole.code
	 * @return  the value of tenantrole.code
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenantrole.code
	 * @param code  the value for tenantrole.code
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenantrole.name
	 * @return  the value of tenantrole.name
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenantrole.name
	 * @param name  the value for tenantrole.name
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenantrole.tenant
	 * @return  the value of tenantrole.tenant
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	public String getTenant() {
		return tenant;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenantrole.tenant
	 * @param tenant  the value for tenantrole.tenant
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenantrole.comment
	 * @return  the value of tenantrole.comment
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenantrole.comment
	 * @param comment  the value for tenantrole.comment
	 * @mbg.generated  Tue May 07 18:57:16 CST 2019
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
}