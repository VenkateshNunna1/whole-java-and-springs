package com.springs.primaryAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Vanilla implements IceCream {

	@Override
	public void eat() {
		System.out.println("baby is eating vanilla");
		
	}

	
    
}
