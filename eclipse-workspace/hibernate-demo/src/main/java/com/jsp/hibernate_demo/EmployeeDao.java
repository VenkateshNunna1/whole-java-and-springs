package com.jsp.hibernate_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
    public void SaveData(Employee employee) {
    	et.begin();
    	em.persist(employee);
    	et.commit();
    }
}
