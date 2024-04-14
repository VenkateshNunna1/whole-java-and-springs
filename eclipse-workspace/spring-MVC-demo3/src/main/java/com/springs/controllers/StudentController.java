package com.springs.controllers;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entityclass.Student;
import com.springs.dao.StudentDao;

@Controller
public class StudentController {
	@Autowired
	StudentDao dao;
	@RequestMapping("/sava")
	public String m1(ServletRequest req) {
		String id = req.getParameter("id");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		
		Student student = new Student();
		student.setId(Integer.parseInt(id));
		student.setName(name);
		student.setAge(Integer.parseInt(age));
		dao.saveStudent(student);
		return "Student";
	     
		
	}
	@RequestMapping("/save2")//@requestparam is used to fetch the data from the url
	public String m2(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("age") int age) {
		Student s= new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		dao.saveStudent(s);
		return "Student";
		
	}
	@RequestMapping("/hmm")
	public ModelAndView m3() {
		ModelAndView mv = new ModelAndView("demo");
		mv.addObject("m5","hello good morning");
		return mv;
	}
	
	@RequestMapping("/saven")
	public ModelAndView m4(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("age") int age) {
		Student s= new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		dao.saveStudent(s);
		ModelAndView mv = new ModelAndView("Student");
		mv.addObject("m5","data saved successfully");
		return mv;
	}

}
