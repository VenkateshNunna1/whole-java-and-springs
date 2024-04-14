package com.java.loginpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/insert")
public class InsertDetails extends GenericServlet{
	  
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	   int id = Integer.parseInt(req.getParameter("id"));
	    String email = req.getParameter("email");
	    String password =req.getParameter("password");
	   int phoneno = Integer.parseInt(req.getParameter("phoneno"));
	   try {
	   Connection con =LoadAndRegister.loadRegister();
	   PreparedStatement ps= con.prepareStatement("insert into SignUpDetails(id,email,password,phoneno) values(?,?,?,?)");
	   ps.setInt(1, id);
	   ps.setString(2, email);
	   ps.setString(3, password);
	   ps.setInt(4, phoneno);
	   ps.execute();
	   PrintWriter out = res.getWriter();
    	out.println("<h1> data saved successfully</h1>");
    	out.println("<a href='signupForm(p).html'>Click here to save again</a>");
	   }
	   catch(SQLException e) {
		   System.out.println("something went wrong");
	   }
	   catch(ClassNotFoundException e) {
		   System.out.println("something went wrong");
	   }
		
	}
      
}
