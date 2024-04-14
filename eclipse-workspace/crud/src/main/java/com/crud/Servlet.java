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
@WebServlet("/insert")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	int id = Integer.parseInt(req.getParameter("id"));
    	String name = req.getParameter("name");
    	int yop = Integer.parseInt(req.getParameter("yop"));
    	int age = Integer.parseInt(req.getParameter("age"));
        String mob =req.getParameter("mob");
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","venky");
			 PreparedStatement ps =con.prepareStatement("insert into student1(id,name,yop,age,mob) values(?,?,?,?,?)");
			 ps.setInt(1, id);
			 ps.setString(2, name);
			 ps.setInt(3, yop);
			 ps.setInt(4,age);
			 ps.setString(5, mob);
			 ps.execute();
			 PrintWriter out = resp.getWriter();
			 out.println("<h1>data inserted successfully</h1>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
