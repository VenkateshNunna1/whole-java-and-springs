package com.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete")
public class delete_servlet extends HttpServlet {
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  int id = Integer.parseInt(req.getParameter("id"));
	  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	try {
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","venky");
			 PreparedStatement ps =con.prepareStatement("delete from student1 where id=?");
			 ps.setInt(1, id);
			 ps.execute();
			 PrintWriter out = resp.getWriter();
			 out.println("<h1>data deleted successfully</h1>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
}
}
