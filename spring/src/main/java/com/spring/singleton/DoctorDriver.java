package com.spring.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.configurationclass;

public class DoctorDriver {

	public static void main(String[] args) {
	  ApplicationContext ac = new AnnotationConfigApplicationContext(configurationclass.class);
     doctor doctor = ac.getBean(doctor.class);
      doctor.setQualification("mbbs");
       System.out.println(doctor);
	  System.out.println(doctor.getQualification());
	  
	  doctor doctor1 = ac.getBean(doctor.class);
	  System.out.println(doctor1);
	  System.out.println(doctor1.getQualification());
	}

}
