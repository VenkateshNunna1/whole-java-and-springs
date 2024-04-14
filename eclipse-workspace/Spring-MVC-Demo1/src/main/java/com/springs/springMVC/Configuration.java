
package com.springs.springMVC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = "com.springs.springMVC")  //purpose of creating class is to specify package to handler mapping
@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean
    public InternalResourceViewResolver resolver() { // purpose of method to mention  new technology  //it is a view resolver
    	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    	resolver.setSuffix(".jsp");
    	resolver.setPrefix("/"); // in setprefix() / represents web app folder
    	return resolver;
    	}

}
