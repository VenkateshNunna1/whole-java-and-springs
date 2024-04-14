package com.java.httpsessiontask;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/se2")
public class Servlet1 extends HttpServlet{
         @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	HttpSession session2 = req.getSession();
        	System.out.println(session2.getAttribute("name"));
        	System.out.println(session2.getAttribute("email"));
        	System.out.println(session2.getAttribute("phoneno"));
        	System.out.println(session2.getAttribute("password"));
        	
        	
        }
}
 