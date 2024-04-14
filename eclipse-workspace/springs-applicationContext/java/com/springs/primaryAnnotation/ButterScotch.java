package com.springs.primaryAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ButterScotch implements IceCream {

	@Override
	public void eat() {
		System.out.println("baby is eating butterscotch");
		
		
	}

	

}
