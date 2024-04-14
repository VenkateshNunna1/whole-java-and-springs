package com.hibernate.OneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venky");
		EntityManager em = emf.createEntityManager();
		
		Company company = em.find(Company.class, 1);
		System.out.println(company.getCompanyId());
		System.out.println(company.getCompanyName());
		System.out.println(company.getCeo());

	     List<Employee> employees = company.getEmployees();
	     for(Employee e:employees) {
	    	 System.out.println(e.getId());
	    	 System.out.println(e.getName());
	    	 System.out.println(e.getRole());
	    	 System.out.println("==================================================");
	     }
	     
	     
	}

}
