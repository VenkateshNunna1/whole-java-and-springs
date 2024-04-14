package com.springs.springMVC;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] c= {Configuration.class};   // to specify the package name to the controller class
		return c;
	}

	@Override
	protected String[] getServletMappings() {//here sending the requesting to the handler controller
		String[] s = {"/"};          
		return s;
	}

}
