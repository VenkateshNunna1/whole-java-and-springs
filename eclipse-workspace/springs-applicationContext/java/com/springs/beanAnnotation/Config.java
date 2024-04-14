package com.springs.beanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //@configuration specifies the source of definitions to spring
public class Config {
	@Bean("get A object")
   public A getA() {
	   return new A();
   }
}
