package com.crud;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/update0")
public class Update0_servlet extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 int id = Integer.parseInt(req.getParameter("id"));
    	 System.out.println(id);
    	RequestDispatcher rd = req.getRequestDispatcher("update.html");
    	rd.forward(req, resp);
    	
    	
    }
}
