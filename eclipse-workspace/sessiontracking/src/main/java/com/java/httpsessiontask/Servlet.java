package com.java.httpsessiontask;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/se1")
public class Servlet extends HttpServlet {
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   String name = req.getParameter("name");
	   String email = req.getParameter("email");
	   String phoneno = req.getParameter("phoneno");
	   String password = req.getParameter("password");
	HttpSession session1 = req.getSession();
	session1.setAttribute("name",name );
	session1.setAttribute("email", email);
	session1.setAttribute("phoneno", phoneno);
	session1.setAttribute("password", password);
	
	
	RequestDispatcher rd = req.getRequestDispatcher("httptask2.html");
	rd.forward(req, resp);
}
}
