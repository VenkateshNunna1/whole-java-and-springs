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
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
               @Override
            protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				    String name = req.getParameter("name");
				   	int yop = Integer.parseInt(req.getParameter("yop"));
				   	int age = Integer.parseInt(req.getParameter("age"));
				    String mob =req.getParameter("mob"); 
				    int id =Integer.parseInt(req.getParameter("id"));
				    try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	try {
						Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","venky");
						 PreparedStatement ps =con.prepareStatement("update student1 set name=?,yop=?,age=?,mob=? where id =?");
						 ps.setString(1, name);
						 ps.setInt(2, yop);
						 ps.setInt(3,age);
						 ps.setString(4, mob);
						 ps.setInt(5, id);
						 ps.execute();
						 PrintWriter out = resp.getWriter();
						 out.println("<h1>data Updated successfully</h1>");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						PrintWriter out =resp.getWriter();
				         out.print("<h1>enter valid id details </h1>");
						
					}
            }
}
