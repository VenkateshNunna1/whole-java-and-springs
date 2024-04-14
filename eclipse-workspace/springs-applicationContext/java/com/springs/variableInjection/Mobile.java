package com.springs.variableInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Value("1")
   int id;
	@Value("iphone")
   String name;
	@Value("15 pro max")
   String model;
	@Value("130000")
   double price;
	@Autowired
    Battery battery; 
	public void processor() {
		System.out.println("iphone 15 pro comes with A17 bio chip");
	}
   
}
