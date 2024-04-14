package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Doctor implements Hospital {
     private Qualification qualification;
    
	public Qualification getQualification() {
		return qualification;
	}
	 @Autowired
	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	public String getName() {
		return name;
	}
     @Value("venkatesh")
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
    @Value("1")
	public void setId(int id) {
		this.id = id;
	}

	private String name;
     private int id;
     
	@Override
	public void assist() {
	System.out.println("doctor has to do treatment for patients");
		
	}

}
