package com.nagarro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@org.springframework.context.annotation.Configuration
@ComponentScan({ "com.nagarro.controllers", "com.nagarro.model", "com.nagarro.services", "com.nagarro.sheet" })
public class Configuration {

	@Bean
	public ViewResolver viewresolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		// resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		resolver.setOrder(0);
		return resolver;
	}

}
