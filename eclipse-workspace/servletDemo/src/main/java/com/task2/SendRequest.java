package com.task2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/signin")
public class SendRequest extends GenericServlet {
     String email1 = "venkynunna2001@gmail.com";
     String password1 ="venky1";

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		if(email.equals(email1) && password.equals(password1)) {
			RequestDispatcher rd = req.getRequestDispatcher("AfterSignin.html");
			rd.forward(req, res);
		}
		else {
			PrintWriter out =res.getWriter();
			out.println("invalid credentials");
			RequestDispatcher rd = req.getRequestDispatcher("signin.html");
			rd.include(req, res);
			res.setContentType("text/html");
			
		}
		
	}

}
