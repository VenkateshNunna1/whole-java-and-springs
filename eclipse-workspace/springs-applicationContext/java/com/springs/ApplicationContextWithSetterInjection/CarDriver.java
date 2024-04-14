package com.springs.ApplicationContextWithSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springs.xml");
		Car c =(Car) ac.getBean("car");
		System.out.println(c.getId());
		System.out.println(c.getCarname());
		System.out.println(c.getModel());
		System.out.println(c.getPrice());
		System.out.println(c.getYor());
		Engine e = c.getEngine();
		System.out.println(e.getId());
		System.out.println(e.getCc());

	}

}
