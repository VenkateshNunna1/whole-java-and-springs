package com.springs.applicationcontextWithConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MarkerDriver {
    public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springs.xml");
		Marker marker=(Marker) ac.getBean("markers");
		System.out.println(marker.id);
		System.out.println(marker.brand);
		System.out.println(marker.price);
	}
}
         