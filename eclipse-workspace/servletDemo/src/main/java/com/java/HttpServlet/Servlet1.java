package com.java.HttpServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/web")
public class Servlet1 extends HttpServlet{
	    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String email = req.getParameter("email");
    	String password =req.getParameter("password");
    	System.out.println(email);
    	System.out.println(password);
    }
}
