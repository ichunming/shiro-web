package com.yimeicloud.study.shiro_web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/article")
public class ArticleController {

	private static final Logger log = LoggerFactory.getLogger(ArticleController.class);
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String view() {
		log.info("ArticleController: /article/view...");
		return "view";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete() {
		log.info("ArticleController: /article/delete...");
		return "delete";
	}
}
