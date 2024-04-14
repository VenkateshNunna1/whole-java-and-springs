package com.springs.helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] a= {Configuration.class};
		return a;
	}

	@Override
	protected String[] getServletMappings() { //this method is used to send the request from client  to dispatcher servlet
			String[] urls = {"/"};
		return urls;
	}
	

}
