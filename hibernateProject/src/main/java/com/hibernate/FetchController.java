package com.hibernate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch13")
public class FetchController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		 StudentDao dao = new StudentDao();
		 Student student=dao.fetch(id);
		 PrintWriter pw = resp.getWriter();
		 if(student!=null) {
			  pw.println(student.getName());
			  pw.println(student.getMobileNumber());
			  pw.println(student.getFatherName());
			  pw.println(student.getMotherName());
			  pw.println(student.getStandard());
		 }
		 else {
			 pw.println("invalid details");
		 }
	}

}
