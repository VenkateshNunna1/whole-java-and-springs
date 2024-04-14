package com.task1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/SaveStudent")
public class InsertStudent extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	 String id = req.getParameter("id");
	 String name = req.getParameter("name");
	 String age = req.getParameter("age");
	 try {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","venky");
	     PreparedStatement ps = con.prepareStatement("insert into student(id,name,age) values(?,?,?)") ;
	     ps.setInt(1, Integer.parseInt(id));
	     ps.setString(2, name);
	     ps.setInt(3, Integer.parseInt(age));
	     ps.execute();
	     	PrintWriter out = res.getWriter();
	     	out.println("<h1> data saved successfully</h1>");
	     	out.println("<a href='StudentForm.html'>Click here to save again</a>");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
