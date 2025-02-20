package com.yimeicloud.study.shiro_web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ManagerController {
	
	private static final Logger log = LoggerFactory.getLogger(ManagerController.class);
	
	@RequestMapping(value="/manager", method=RequestMethod.GET)
	public String manager() {
		
		log.info("ManagerController: /manager...");
		return "manager";
	}
}
