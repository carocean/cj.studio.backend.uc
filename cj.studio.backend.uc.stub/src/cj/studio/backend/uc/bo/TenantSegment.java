package cj.studio.backend.uc.bo;

public class TenantSegment {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenantseg.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenantseg.tenantCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String tenantcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenantseg.segCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private String segcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tenantseg.sort
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	private Integer sort;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenantseg.id
	 * @return  the value of tenantseg.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenantseg.id
	 * @param id  the value for tenantseg.id
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenantseg.tenantCode
	 * @return  the value of tenantseg.tenantCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getTenantcode() {
		return tenantcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenantseg.tenantCode
	 * @param tenantcode  the value for tenantseg.tenantCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setTenantcode(String tenantcode) {
		this.tenantcode = tenantcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenantseg.segCode
	 * @return  the value of tenantseg.segCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public String getSegcode() {
		return segcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenantseg.segCode
	 * @param segcode  the value for tenantseg.segCode
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setSegcode(String segcode) {
		this.segcode = segcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tenantseg.sort
	 * @return  the value of tenantseg.sort
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public Integer getSort() {
		return sort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tenantseg.sort
	 * @param sort  the value for tenantseg.sort
	 * @mbg.generated  Thu Apr 04 22:03:54 CST 2019
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
}