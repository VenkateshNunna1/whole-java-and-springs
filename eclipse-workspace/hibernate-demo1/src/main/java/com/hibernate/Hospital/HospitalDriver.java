package com.hibernate.Hospital;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venky");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hospital hospital = new Hospital();
		hospital.sethId(1);
		hospital.sethName("Apollo Hospitals");
		hospital.setCeo("Venkatesh");
		
		Branch branch1 = new Branch();
		branch1.setbId(1);
		branch1.setbName("Marathalli");
		branch1.setbManager("sudhi");
		branch1.setHospital(hospital);
		
		Branch branch2 = new Branch();
		branch2.setbId(2);
		branch2.setbName("WhiteField");
		branch2.setbManager("Ganesh");
		branch2.setHospital(hospital);
		
		List<Branch> branches = new ArrayList<Branch>();
		branches.add(branch1);
		branches.add(branch2);
		
		hospital.setBranches(branches);
		
		et.begin();
		em.persist(hospital);
		em.persist(branch1); // why we are not passing list references (branches) in the persist method 
		em.persist(branch2); // in persist method we have to pass the references of entity classes objects. and list is not a entity class 
		et.commit();

	}

}
