/**
 * 自定义Realm
 * ming 2016/07/22
 */
package com.yimeicloud.study.shiro_web.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yimeicloud.study.shiro_web.helper.PasswordHelper;
import com.yimeicloud.study.shiro_web.model.User;
import com.yimeicloud.study.shiro_web.service.PermissionService;
import com.yimeicloud.study.shiro_web.service.RoleService;
import com.yimeicloud.study.shiro_web.service.UserService;

public class UserRealm extends AuthorizingRealm {

	private static final Logger logger = LoggerFactory.getLogger(UserRealm.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private PermissionService permissionService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// 用户名
        String username = (String)principals.getPrimaryPrincipal();
        
        // 角色权限信息
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        
        // 角色，权限设置
        logger.debug("角色，权限设置");
        authorizationInfo.setRoles(roleService.findRolesByName(username));
        authorizationInfo.setStringPermissions(permissionService.findPermissionsByName(username));
        return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 用户信息
		String username = (String)token.getPrincipal();
		String password = (String)token.getCredentials();
		
		// 通过用户名获取用户信息
		logger.debug("通过用户名获取用户信息...");
        User user = userService.findUserByName(username);
        
        if(user == null) {
        	// 用户不存在
        	logger.debug("用户不存在");
            throw new UnknownAccountException();
        }
        
        if(Boolean.TRUE.equals(user.getLocked())) {
        	// 用户被锁定
        	logger.debug("用户被锁定");
            throw new LockedAccountException();
        }

        if(!PasswordHelper.match(user, password)) {
        	// 密码不匹配
        	logger.debug("密码不匹配");
        	throw new IncorrectCredentialsException();
        }
        
        // 验证通过
        logger.debug("验证通过");
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(  
                user.getUsername(), //用户名
                user.getPassword(), //密码 
                ByteSource.Util.bytes(user.getUsername() + user.getSalt()),//salt=username+salt
                getName()  //realm name
        );  
        
        return authenticationInfo;
	}

}
