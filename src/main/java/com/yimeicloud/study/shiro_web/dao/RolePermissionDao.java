package com.yimeicloud.study.shiro_web.dao;

import com.yimeicloud.study.shiro_web.model.RolePermission;

public interface RolePermissionDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_permissions
     *
     * @mbggenerated Wed Jul 20 16:06:00 CST 2016
     */
    int deleteByPrimaryKey(RolePermission key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_permissions
     *
     * @mbggenerated Wed Jul 20 16:06:00 CST 2016
     */
    int insert(RolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_permissions
     *
     * @mbggenerated Wed Jul 20 16:06:00 CST 2016
     */
    int insertSelective(RolePermission record);
}