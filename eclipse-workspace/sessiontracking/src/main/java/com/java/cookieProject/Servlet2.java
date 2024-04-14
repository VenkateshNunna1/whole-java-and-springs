package com.java.cookieProject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie")
public class Servlet2 extends HttpServlet {
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   Cookie[] cookies = req.getCookies();
	   if(cookies==null) {
		   RequestDispatcher rd = req.getRequestDispatcher("signin.html");
		   rd.forward(req, resp);
	   }
	   else {
		   RequestDispatcher rd = req.getRequestDispatcher("welcomeproject.html");
		   rd.forward(req, resp);
	   }
}
   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   doPost(req, resp);
	}
}
