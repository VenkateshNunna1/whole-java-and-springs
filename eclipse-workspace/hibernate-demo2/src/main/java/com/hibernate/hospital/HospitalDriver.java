package com.hibernate.hospital;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver {

	public static void main(String[] args) {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
	  EntityManager em = emf.createEntityManager();
	  EntityTransaction et = em.getTransaction();
	  //hospital 
	  Hospital hospital = new Hospital();
	  hospital.setId(1);
	  hospital.setName("Apollo Hospitals");
	  hospital.setCeo("Anjali Devi");
	  
	  //first branch details
	  Branch branch1 = new Branch();
	  branch1.setId(1);
	  branch1.setName("Marathalli");
	  branch1.setDoe("12/10/2017");
	  
	  //seocond branch details
	  Branch branch2 = new Branch();
	  branch2.setId(2);
	  branch2.setName("White-Field");
	  branch2.setDoe("24/10/2018");
	  
	  List<Branch> branches = new ArrayList<Branch>();
	  branches.add(branch1);
	  branches.add(branch2);
	  
      hospital.setBranches(branches);
	  //first branch manager
	  Manager manager = new Manager();
	  manager.setId(1);
	  manager.setName("Ganesh");
	  manager.setYoe("10 years");
	  manager.setGraduation("Bpharmacy");
	  
	  //seocond branch manager
	  Manager manager1 = new Manager();
	  manager1.setId(2);
	  manager1.setName("Dilip");
	  manager1.setYoe("6 years");
	  manager1.setGraduation("Bpharmacy");
	  
	  branch1.setManager(manager);
	  branch2.setManager(manager1);
	  
	  //first branch address
	  Address address1 = new Address();
	  address1.setId(1);
	  address1.setStreetName("Narasimha Swamy Temple Street");
	  address1.setLandMark("Near Mediplus");
	  address1.setCity("Bangalore");
	  address1.setState("Karanataka");
	  address1.setPinCode(560037);
	  
	  branch1.setAddress(address1);
	  
	  //seocond branch address
	  Address address2 = new Address();
	  address2.setId(2);
	  address2.setStreetName("Malikapuram Street");
	  address2.setLandMark("Near Livspace");
	  address2.setCity("Bangalore");
	  address2.setState("Karanataka");
	  address2.setPinCode(560037);
	  
	  
	  branch2.setAddress(address2);
	  
	  //first branch doctors details
	  Doctor doctor1 = new Doctor();
	  doctor1.setId(1);
	  doctor1.setName("Rajesh");
	  doctor1.setSpecialization("Orthopedics");
	  doctor1.setYoe("5 years");
	  
	  Doctor doctor2 = new Doctor();
	  doctor2.setId(2);
	  doctor2.setName("Tarun");
	  doctor2.setSpecialization("Gynaecology");
	  doctor2.setYoe("8 years");
	  
	  List<Doctor> doctors = new ArrayList<Doctor>();
	  doctors.add(doctor1);
	  doctors.add(doctor2);
	  
	  branch1.setDoctors(doctors);
	  
	  //seocond branch doctors details
	  Doctor doc = new Doctor();
	  doc.setId(3);
	  doc.setName("Niranajan");
	  doc.setSpecialization("Orthopedics");
	  doc.setYoe("3 years");
	  
	  Doctor doc1 = new Doctor();
	  doc1.setId(4);
	  doc1.setName("Suresh");
	  doc1.setSpecialization("Neuro-Surgen");
	  doc1.setYoe("5 years");
	  
	  List<Doctor> doco = new ArrayList<Doctor>();
	  doco.add(doc);
	  doco.add(doc1);
	  
	  branch2.setDoctors(doco);
	  
	  //first branch patients details
	  Patient patient1 = new Patient();
	  patient1.setId(1);
	  patient1.setName("Seshu");
	  patient1.setAge(23);
	  patient1.setMobileNumber(9632154870l);
	  patient1.setBloodGroup("A+");
	
	  Patient patient2 = new Patient();
	  patient2.setId(2);
	  patient2.setName("Srikanth");
	  patient2.setAge(23);
	  patient2.setMobileNumber(9632002870l);
	  patient2.setBloodGroup("B-");
	  
	  List<Patient> patients = new ArrayList<Patient>();
	  patients.add(patient1);
	  patients.add(patient2);
	  
	  branch1.setPatients(patients);
	  
	  //Seocond branch patients details
	  Patient pat = new Patient();
	  pat.setId(3);
	  pat.setName("Ian");
	  pat.setAge(23);
	  pat.setMobileNumber(9232154870l);
	  pat.setBloodGroup("A+");
	
	  Patient pat1 = new Patient();
	  pat1.setId(4);
	  pat1.setName("Siva Gopi");
	  pat1.setAge(23);
	  pat1.setMobileNumber(9632112870l);
	  pat1.setBloodGroup("O-");
	  
	  List<Patient> pats = new ArrayList<Patient>();
	  patients.add(pat);
	  patients.add(pat1);
	  
	  branch2.setPatients(pats);
	  
	  Disease disease = new Disease();
	  disease.setId(1);
	  disease.setName("A");
	  disease.setSymptoms("Neck pain,fever");
	  
	  Disease disease1 = new Disease();
	  disease1.setId(2);
	  disease1.setName("B");
	  disease1.setSymptoms("Malaria");
	  
	  List<Disease>  diseases = new ArrayList<Disease>();
	  diseases.add(disease);
	  diseases.add(disease1);
	  
	  patient1.setDisease(diseases);
	  patient2.setDisease(diseases);
	  pat.setDisease(diseases);
	  pat1.setDisease(diseases);
	  
	  
	  
	  
	  
	  et.begin();
	  em.persist(hospital);
	  em.persist(branch1);
	  em.persist(branch2);
	  em.persist(manager);
	  em.persist(manager1);
	  em.persist(address1);
	  em.persist(address2);
	  em.persist(doctor1);
	  em.persist(doctor2);
	  em.persist(doc);
	  em.persist(doc1);
	  em.persist(patient1);
	  em.persist(patient2);
	  em.persist(pat);
	  em.persist(pat1);
	  em.persist(disease);
	  em.persist(disease1);
	  et.commit();
	   
	   
	}

}
