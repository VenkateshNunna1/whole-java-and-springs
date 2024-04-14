package com.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/view")
public class Fetch_servlet extends HttpServlet {
         @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           int id = Integer.parseInt(req.getParameter("id"));
           try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","venky");
              PreparedStatement ps=con.prepareStatement("select * from student1 where id =?");
              ps.setInt(1, id);
              ResultSet r = ps.executeQuery();
              PrintWriter out = resp.getWriter();
              if(r.next()) {
            	  out.println(r.getInt(1));
            	  out.println(r.getString(2));
            	  out.println(r.getInt(3));
            	  out.println(r.getInt(4));
            	  out.println(r.getString(5));
              }
              else {
            	  out.print("<h1>please enter valid id</h1");
              }
              
              
           }
           catch(SQLException | ClassNotFoundException  e) {
        	   e.printStackTrace();
           }
        }
}
