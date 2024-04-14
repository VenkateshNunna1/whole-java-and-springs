package com.hibernate.OneToMany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venky");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Company company = new Company();
		company.setCompanyId(1);
		company.setCompanyName("Tiktok solutions");
		company.setCeo("Ganesh");
		
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("venkatesh");
		employee1.setRole("Developer");
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("sudhi");
		employee2.setRole("Tester");
		
		ArrayList<Employee> Employees = new ArrayList<Employee>();
		Employees.add(employee1);
		Employees.add(employee2);
		
		company.setEmployees(Employees);
	   et.begin();
	   em.persist(company);
	   em.persist(employee1);
	   em.persist(employee2);
		et.commit();
	}

}
