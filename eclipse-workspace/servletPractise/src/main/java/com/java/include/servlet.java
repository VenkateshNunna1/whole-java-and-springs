package com.java.include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/gani22")
public class servlet extends HttpServlet {
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email="venky@gmail.com";
	String password ="venky@2001";
	String email1 = req.getParameter("email");
	String password1 = req.getParameter("password");
	
	if(email.equals(email1) && password.equals(password1)) {
		RequestDispatcher rd = req.getRequestDispatcher("welcome.html");
		rd.forward(req, resp);
	}
	else {
	     PrintWriter pw =   resp.getWriter();
	     pw.println("invalid credentials");
	     RequestDispatcher rd = req.getRequestDispatcher("login.html");
	     rd.include(req, resp);
	     resp.setContentType("text/html");
	}
}
}
