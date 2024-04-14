package com.spring.core;

import org.springframework.stereotype.Component;


public class Nurse implements Hospital {

	@Override
	public void assist() {
		System.out.println("nurse is doing help for the doctors");
		
	}

}
