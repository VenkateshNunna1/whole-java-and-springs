package com.java.httpservlettask;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/task1")
public class servlet2 extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String name = req.getParameter("name");
    	String phoneno = req.getParameter("phoneno");
    	PrintWriter out = resp.getWriter();
    	out.println(name);
    	out.println(phoneno);
    	
    	
    }
}
