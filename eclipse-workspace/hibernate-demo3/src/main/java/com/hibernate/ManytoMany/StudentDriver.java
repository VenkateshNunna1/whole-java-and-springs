package com.hibernate.ManytoMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s = new Student();
		s.setId(1);
		s.setName("venkatesh");
		s.setAge(23);
		List<Student> students = new ArrayList<Student>();
		students.add(s);
		
		
		Course c = new Course();
		c.setId(1);
		c.setName("java");
		c.setDuration("3 months");
		List<Course> courses = new ArrayList<Course>();
		courses.add(c);
		
		s.setCourses(courses);
		c.setStudents(students);
		
		
		
		et.begin();
		em.persist(c);
		em.persist(s);
		et.commit();

	}

}
