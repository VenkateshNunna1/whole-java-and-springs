package com.hibernate;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentform")
public class InsertController extends HttpServlet{   
	
	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		String name=req.getParameter("name");
		long mobileNumber = Long.parseLong(req.getParameter("mb"));
		String father = req.getParameter("father");
		String mother = req.getParameter("mother");
		int  Class = Integer.parseInt(req.getParameter("class"));
		Student student = new Student();
		student.setName(name);
		student.setMobileNumber(mobileNumber);
		student.setFatherName(father);
		student.setMotherName(mother);
		student.setStandard(Class);
		StudentDao dao = new StudentDao();
		dao.saveData(student);
		RequestDispatcher  rd = req.getRequestDispatcher("saved.html");
		rd.forward(req, resp);
		System.out.println("data inserted successfully");
		
	}
}
