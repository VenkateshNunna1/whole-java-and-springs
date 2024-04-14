package com.servlets.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loform1")
public class servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String name=req.getParameter("name");
    	String email =req.getParameter("email");
    	long mobilenumber =Long.parseLong(req.getParameter("mb"));
    	PrintWriter pw = resp.getWriter();
    	pw.print(name+" "+email+" "+mobilenumber);
    }
}
