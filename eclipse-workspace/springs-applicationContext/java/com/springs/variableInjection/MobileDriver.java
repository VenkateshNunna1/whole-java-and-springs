package com.springs.variableInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springs.xml");
		Mobile mobile=(Mobile) ac.getBean("mobile");
		System.out.println("---------mobile details------------");
		System.out.println(mobile.id);
		System.out.println(mobile.name);
		System.out.println(mobile.model);
		System.out.println(mobile.price);
		mobile.processor();
		System.out.println("-------------battery details-------");
		Battery battery=mobile.battery;
		System.out.println(battery.id);
		System.out.println(battery.mah);
		battery.battery();
		

	}

}
