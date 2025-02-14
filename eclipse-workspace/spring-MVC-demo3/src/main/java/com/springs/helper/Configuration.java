package com.springs.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = "com.springs")
@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean
     public InternalResourceViewResolver resolver() {
    	 InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    	 resolver.setSuffix(".jsp");
    	 resolver.setPrefix("/");
    	 return resolver;
     }
	@Bean
	public EntityManagerFactory getEMF() {
		return Persistence.createEntityManagerFactory("venkatesh");
	}
}
