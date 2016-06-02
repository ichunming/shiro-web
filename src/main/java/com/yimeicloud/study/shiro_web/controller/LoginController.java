package com.yimeicloud.study.shiro_web.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();
		log.info("logout...");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("username")String username, @RequestParam("password")String password, Model model) {
		// 获取当前用户
		Subject currentUser = SecurityUtils.getSubject();
		// 创建用户登录凭证
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);

		// 登入
		String eMsg = "";
		try {
			currentUser.login(token);
		} catch (UnknownAccountException e) {
			eMsg = "用户名错误";
		} catch (IncorrectCredentialsException e) {
			eMsg = "密码错误";
		} catch (AuthenticationException e) {
			eMsg = "认证异常";
		}

		// 认证
		if (currentUser.isAuthenticated()) {
			log.info("认证通过...");
		} else {
			log.info(eMsg);
			log.info("认证未通过...");
			
			model.addAttribute("eMsg", eMsg);
			return "login";
		}
		
		return "home";
	}
}
