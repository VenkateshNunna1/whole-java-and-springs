package com.java.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/setage")
public class SetAgeForCookie extends HttpServlet{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 Cookie c1 = new Cookie("name", "venkatesh");
	 c1.setMaxAge(10);
	 Cookie c2 = new Cookie("sername","nunna");
	 c2.setMaxAge(60);
	 Cookie c3 = new Cookie("phnno","6309875788");
	 c3.setMaxAge(120);
	 resp.addCookie(c1);
	 resp.addCookie(c2);
	 resp.addCookie(c3);
	 PrintWriter pw = resp.getWriter();
	 pw.println("<h1> cookies saved successfully and set the time for cookies</h1>");
}
}
