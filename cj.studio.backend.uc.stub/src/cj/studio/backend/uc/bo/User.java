package cj.studio.backend.uc.bo;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.id
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.userCode
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	private String usercode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.realName
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	private String realname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.nickName
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	private String nickname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.sex
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	private Byte sex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.face
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	private String face;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.phrase
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	private String phrase;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.createTime
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	private Long createtime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.id
	 * @return  the value of user.id
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.id
	 * @param id  the value for user.id
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.userCode
	 * @return  the value of user.userCode
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public String getUsercode() {
		return usercode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.userCode
	 * @param usercode  the value for user.userCode
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.realName
	 * @return  the value of user.realName
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public String getRealname() {
		return realname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.realName
	 * @param realname  the value for user.realName
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.nickName
	 * @return  the value of user.nickName
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.nickName
	 * @param nickname  the value for user.nickName
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.sex
	 * @return  the value of user.sex
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public Byte getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.sex
	 * @param sex  the value for user.sex
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setSex(Byte sex) {
		this.sex = sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.face
	 * @return  the value of user.face
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public String getFace() {
		return face;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.face
	 * @param face  the value for user.face
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setFace(String face) {
		this.face = face;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.phrase
	 * @return  the value of user.phrase
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public String getPhrase() {
		return phrase;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.phrase
	 * @param phrase  the value for user.phrase
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.createTime
	 * @return  the value of user.createTime
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public Long getCreatetime() {
		return createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.createTime
	 * @param createtime  the value for user.createTime
	 * @mbg.generated  Sat Jan 12 13:47:21 CST 2019
	 */
	public void setCreatetime(Long createtime) {
		this.createtime = createtime;
	}
}