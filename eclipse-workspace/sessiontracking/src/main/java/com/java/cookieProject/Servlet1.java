package com.java.cookieProject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie1")
public class Servlet1 extends HttpServlet{
       @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String email = req.getParameter("email");
    	String password = req.getParameter("password");
    	
    	Cookie c1 = new Cookie("email",email);
    	c1.setMaxAge(172800);
    	Cookie c2 = new Cookie("password", password);
    	c2.setMaxAge(172800);
    	resp.addCookie(c1);
    	resp.addCookie(c2);
    	
    	RequestDispatcher rd = req.getRequestDispatcher("welcomeproject.html");
    	rd.forward(req, resp);
    }
}
