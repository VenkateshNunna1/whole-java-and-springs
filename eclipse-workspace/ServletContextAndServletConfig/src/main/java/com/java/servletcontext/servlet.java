package com.java.servletcontext;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class servlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	ServletContext context =getServletContext();
	 String s =context.getInitParameter("hello");
	 System.out.println(s);
	
		
	}

}
