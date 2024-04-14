package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalController {

	public static void main(String[] args) {
	  ApplicationContext ac = new AnnotationConfigApplicationContext(configurationclass.class);
	  Doctor doctor=ac.getBean(Doctor.class);
	  doctor.assist();
      System.out.println(doctor.getId());
      System.out.println(doctor.getName());
      Qualification qualification=    doctor.getQualification();
      System.out.println(qualification.getYop());
      System.out.println(qualification.getPercentage());
      System.out.println(qualification.getGrade());
       Nurse nurse=   ac.getBean(Nurse.class);
        nurse.assist();
	}

}
