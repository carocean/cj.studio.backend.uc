package cj.studio.backend.uc.bo;

public class Role {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role.id
	 * @mbg.generated  Mon Jan 14 22:51:29 CST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role.code
	 * @mbg.generated  Mon Jan 14 22:51:29 CST 2019
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role.name
	 * @mbg.generated  Mon Jan 14 22:51:29 CST 2019
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role.comment
	 * @mbg.generated  Mon Jan 14 22:51:29 CST 2019
	 */
	private String comment;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role.id
	 * @return  the value of role.id
	 * @mbg.generated  Mon Jan 14 22:51:29 CST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role.id
	 * @param id  the value for role.id
	 * @mbg.generated  Mon Jan 14 22:51:29 CST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role.code
	 * @return  the value of role.code
	 * @mbg.generated  Mon Jan 14 22:51:29 CST 2019
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role.code
	 * @param code  the value for role.code
	 * @mbg.generated  Mon Jan 14 22:51:29 CST 2019
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role.name
	 * @return  the value of role.name
	 * @mbg.generated  Mon Jan 14 22:51:29 CST 2019
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role.name
	 * @param name  the value for role.name
	 * @mbg.generated  Mon Jan 14 22:51:29 CST 2019
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role.comment
	 * @return  the value of role.comment
	 * @mbg.generated  Mon Jan 14 22:51:29 CST 2019
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role.comment
	 * @param comment  the value for role.comment
	 * @mbg.generated  Mon Jan 14 22:51:29 CST 2019
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
}