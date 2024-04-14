package com.java.loginpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/login")
public class FetchDetailsAndValidation extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email1 = req.getParameter("email");
		String password1 = req.getParameter("password");
		try {
			   Connection con =LoadAndRegister.loadRegister();
			   PreparedStatement ps= con.prepareStatement("select email,password from signupdetails where email=? and password=?");
			   ps.setString(1, email1);
			   ps.setString(2, password1);
			   ResultSet rs = ps.executeQuery();
			   rs.next();
			   PrintWriter out = res.getWriter();
			   String em =rs.getString(1);
			   String pwd =rs.getString(2);
			   if(email1.equals(em) && password1.equals(pwd)) {
				   RequestDispatcher rd = req.getRequestDispatcher("AfterSignin1(p).html");
					rd.forward(req, res);
				}
			  
			}
			   catch(SQLException e) {
				   PrintWriter out1 =res.getWriter();
					out1.println("invalid credentials");
					RequestDispatcher rd = req.getRequestDispatcher("loginForm(p).html");
					rd.include(req, res);
					res.setContentType("text/html");
			   }
			   catch(ClassNotFoundException e) {
				   System.out.println("something went wrong2");
			   }
				
			}
		
	}


