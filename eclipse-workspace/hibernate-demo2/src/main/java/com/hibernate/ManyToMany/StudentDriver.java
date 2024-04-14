package com.hibernate.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venky");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Venkatesh");
        student1.setYop(2023);
        
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Ganesh");
        student2.setYop(2025);
        
        Course course1  = new Course();
        course1.setId(1);
        course1.setName("SQL");
        course1.setDuration("1 month");
        
        Course course2 = new Course();
        course2.setId(2);
        course2.setName("Core Java");
        course2.setDuration("3 months");
        
        Course course3 = new Course();
        course3.setId(3);
        course3.setName("J2EE");
        course3.setDuration("1 month");
        
        List<Course> courses = new ArrayList<Course>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        
        List<Student> students = new ArrayList<Student>();
          students.add(student1);
          students.add(student2);
         
          student1.setCourses(courses);
          student2.setCourses(courses);
          
         course1.setStudents(students);
         course2.setStudents(students);
         course3.setStudents(students);
         
         et.begin();
         em.persist(student1);
         em.persist(student2);
         em.persist(course1);
         em.persist(course2);
         em.persist(course3);
         et.commit();
         
        }

}
