package com.springs.Controllers;

import javax.servlet.ServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springs.Dao.EmployeeDao;
import com.springs.entityClasses.Employee;

@Controller
public class EmployeeController {
     @Autowired
	EmployeeDao dao ;
	
	@RequestMapping("/emp")
   public String m1(ServletRequest req) {
	   int id = Integer.parseInt(req.getParameter("id"));
	   String name=req.getParameter("name");
	   int mobilenumber =Integer.parseInt(req.getParameter("mn"));
	   int age=Integer.parseInt(req.getParameter("age"));
	   String gender = req.getParameter("gender");
	   	Employee e = new Employee();
	   	e.setId(id);
	   	e.setName(name);
	   	e.setAge(age);
	   	e.setMobileNumber(mobilenumber);
	   	e.setGender(gender);
	   	dao.insert(e);
	  return "Employee";
   }
	@RequestMapping("/emp12")
	public String m2(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("mn") int mobilenumber,@RequestParam("age") int age,@RequestParam("gender") String gender) {
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setMobileNumber(mobilenumber);
		e.setGender(gender);
		e.setAge(age);
		dao.insert(e);
		return "Employee";
	}
	
}
