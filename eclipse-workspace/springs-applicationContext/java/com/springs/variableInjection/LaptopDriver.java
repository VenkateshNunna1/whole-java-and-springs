package com.springs.variableInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {
  public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("springs.xml");
	 Laptop laptop= (Laptop) ac.getBean("laptop");
	 System.out.println(laptop.id);
	 System.out.println(laptop.name);
	 System.out.println(laptop.price);
}
}
