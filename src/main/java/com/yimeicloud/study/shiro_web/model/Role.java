package com.yimeicloud.study.shiro_web.model;

public class Role {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column roles.id
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column roles.role
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	private String role;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column roles.description
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column roles.available
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	private Boolean available;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column roles.id
	 * @return  the value of roles.id
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column roles.id
	 * @param id  the value for roles.id
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column roles.role
	 * @return  the value of roles.role
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	public String getRole() {
		return role;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column roles.role
	 * @param role  the value for roles.role
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	public void setRole(String role) {
		this.role = role == null ? null : role.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column roles.description
	 * @return  the value of roles.description
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column roles.description
	 * @param description  the value for roles.description
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column roles.available
	 * @return  the value of roles.available
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	public Boolean getAvailable() {
		return available;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column roles.available
	 * @param available  the value for roles.available
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	public void setAvailable(Boolean available) {
		this.available = available;
	}
}