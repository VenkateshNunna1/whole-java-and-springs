package com.springs.primaryAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.variableInjection.Configure1;

public class BabyDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Configure.class);
		Baby baby=(Baby) ac.getBean("baby");
		baby.eat();

	}

}
