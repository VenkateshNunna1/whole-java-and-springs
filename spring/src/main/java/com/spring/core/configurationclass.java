package com.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.spring.singleton")
public class configurationclass {
	@Bean
  public Nurse m1() {
	  return new Nurse();
  }
}
