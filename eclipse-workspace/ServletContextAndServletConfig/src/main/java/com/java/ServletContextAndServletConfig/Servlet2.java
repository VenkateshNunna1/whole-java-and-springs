package com.java.ServletContextAndServletConfig;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
ServletContext context = getServletContext();
		
		String data =context.getInitParameter("name");//in server all servlets objects has only one servlet context
		System.out.println(data);
		System.out.println(context.getServerInfo());
		System.out.println(context.getContextPath());
		
	}
     
}
