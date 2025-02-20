package com.yimeicloud.study.shiro_web.dao;

import java.util.List;

import com.yimeicloud.study.shiro_web.model.Role;

public interface RoleDao {

	/**
	 * 根据用户名查找用户角色
	 * @param name
	 * @return
	 */
	public List<String> selectByName(String name);
	
	
	
	
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table roles
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table roles
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	int insert(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table roles
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	int insertSelective(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table roles
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	Role selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table roles
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	int updateByPrimaryKeySelective(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table roles
	 * @mbggenerated  Wed Jul 20 16:06:00 CST 2016
	 */
	int updateByPrimaryKey(Role record);
}