package com.springs.primaryAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baby {
	@Autowired
	IceCream cream;
	
   public void eat() {
	   cream.eat();
   }
}
