package com.java.ServletContextAndServletConfig;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet3 extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ServletConfig config = getServletConfig();// in server every servlet object has one servlet config.
		String data =config.getInitParameter("name");
		System.out.println(data);
	
		
	}
}
