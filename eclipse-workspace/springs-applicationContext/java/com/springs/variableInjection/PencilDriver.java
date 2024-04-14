package com.springs.variableInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PencilDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Configure1.class);
		Pencil p=(Pencil) ac.getBean("pencil");
		p.write();

	}

}
