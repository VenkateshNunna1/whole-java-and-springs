package com.springMVC;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebIntializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] arr = {Configuration.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String[] arr1= {"/hii"}; // if you add the only one url that page only map with servlet
		return arr1;
	}

}
