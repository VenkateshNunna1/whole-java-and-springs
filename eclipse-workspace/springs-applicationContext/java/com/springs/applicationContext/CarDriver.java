package com.springs.applicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springs.xml");
		Car c=(Car) ac.getBean("car");
		c.work();
         
	}

}
