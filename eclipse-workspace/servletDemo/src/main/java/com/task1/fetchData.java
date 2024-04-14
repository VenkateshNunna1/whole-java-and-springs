package com.task1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/fetchstudent")
public class fetchData extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	int id = Integer.parseInt(req.getParameter("id"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  try {
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "venky");
				 PreparedStatement ps = con.prepareStatement("select * from student where id=?") ;
				 ps.setInt(1, id);
				 ResultSet rs =ps.executeQuery();
				    
					PrintWriter out = res.getWriter();
				   if(rs.next()) {
					 out.println("<h1>user's data </h1><br>");
					out.println(rs.getInt(1));
					 out.println("<br>");
					out.println(rs.getString(2));
					out.println("<br>");
					out.println(rs.getString(3));
					out.println("<h2> data fetched successfully</h2>");
					out.println("<a href='StudentForm.html'>click to here fetch data again</a>");	
				   }     else {
						out.println("<h1> user not found </h1>");
				   }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
