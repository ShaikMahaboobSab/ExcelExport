package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@PropertySource("classpath:app.properties")
@EnableTransactionManagement
@ComponentScan(basePackages="com.app")
public class AppConfig {
	
	@Autowired
	private Environment environment;
	
	

}
