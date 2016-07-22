/**
 * Register Controller
 * ming 2016/07/22
 */
package com.yimeicloud.study.shiro_web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yimeicloud.study.shiro_web.model.User;
import com.yimeicloud.study.shiro_web.service.UserService;

@Controller
public class RegisterController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	//@Autowired
	//private UserService userService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String login(@RequestParam("username")String username, @RequestParam("password")String password) {
		// 封装用户信息
		logger.debug("封装用户信息...");
		User user = new User(username, password);
		
		// 创建用户
		logger.debug("创建用户...");
		//userService.createUser(user);
		
		// 返回登入页
		logger.debug("用户创建成功");
		return "login";
	}
}
