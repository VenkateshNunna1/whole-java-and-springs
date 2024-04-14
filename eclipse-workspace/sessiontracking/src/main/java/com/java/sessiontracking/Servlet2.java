package com.java.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sessiontrack2")
public class Servlet2 extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String name1 = req.getParameter("name");
    	String email1 = req.getParameter("email");
    	String password1 = req.getParameter("password");
    	Cookie cookie1 = new Cookie("name",name1);
    	Cookie cookie2 = new Cookie("email",email1);
    	Cookie cookie3 = new Cookie("password",password1);
    	resp.addCookie(cookie1);
    	resp.addCookie(cookie2);
    	resp.addCookie(cookie3);
    	PrintWriter out = resp.getWriter();
    	out.println("<h1>cookies saved successfully</h1>");
    }
}
