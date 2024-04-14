package com.springs.beanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ADriver {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(configuration.class);
		A a=(A) ac.getBean("get A object");
		a.work();

	}

}
