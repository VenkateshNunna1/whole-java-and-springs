package com.java.HttpServlet1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/http2")
public class Servlet2 extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String name =req.getParameter("name");
    	String number =req.getParameter("number");
    	String age = req.getParameter("age");
    	System.out.println(name);
    	System.out.println(number);
    	System.out.println(age);
    }
}
