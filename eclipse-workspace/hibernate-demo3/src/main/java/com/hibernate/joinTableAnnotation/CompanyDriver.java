package com.hibernate.joinTableAnnotation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Company company = new Company();
		company.setName("Google");
		company.setCeo("sundar");
		
		Employee employee = new Employee();
		employee.setName("Venkatesh");
		employee.setRole("developer");
		
		Employee employee1 = new Employee();
		employee1.setName("Ganesh");
		employee1.setRole("tester");
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee1);
		
		company.setEmployees(employees);
          
		et.begin();
		em.persist(company);
		et.commit();
	} 

}
