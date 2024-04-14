package com.springs.applicationContext;

import org.springframework.stereotype.Component;

@Component
public class Car {
   public Car() {
	   System.out.println("car object is invoked ");
   }
   public void work() {
	   System.out.println("car is a 4 wheeler");
   }
}
