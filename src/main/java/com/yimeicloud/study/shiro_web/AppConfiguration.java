package com.yimeicloud.study.shiro_web;

import org.apache.shiro.web.env.EnvironmentLoaderListener;
import org.apache.shiro.web.env.IniWebEnvironment;
import org.apache.shiro.web.servlet.ShiroFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	@Bean
	public IniWebEnvironment env() {
		return new IniWebEnvironment();
	}
	
	@Bean
	public EnvironmentLoaderListener listener() {
		return new EnvironmentLoaderListener();
	}
	
	@Bean
	public ShiroFilter filter() {
		return new ShiroFilter();
	}
}
