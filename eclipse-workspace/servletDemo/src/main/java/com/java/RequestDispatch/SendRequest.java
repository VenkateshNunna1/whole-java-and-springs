package com.java.RequestDispatch;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/requestDispatch")
public class SendRequest extends GenericServlet  {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("welcome.html");//here we are sending request from servlet to html file
		rd.forward(req, res);
		
	}

}
