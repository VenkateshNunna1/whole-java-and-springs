package com.java.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sessiontrack1")
public class Servlet1 extends HttpServlet{
      @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	Cookie cookie1 = new Cookie("name","venkatesh" );
    	Cookie cookie2 = new Cookie("phoneno","6309875788");
    	Cookie cookie3 = new Cookie("sername","nunna");
          resp.addCookie(cookie1);//add cookie() is used to save cookies inside browser
          resp.addCookie(cookie2);
          resp.addCookie(cookie3);
          PrintWriter out = resp.getWriter();
          out.println("<h1>cookie saved successfully</h1>");
     	
    }
      
}
