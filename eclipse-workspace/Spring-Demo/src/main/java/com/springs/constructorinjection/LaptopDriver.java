package com.springs.constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class LaptopDriver {

	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("core.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		 Laptop laptop= (Laptop) bf.getBean("mylaptop");
		 System.out.println(laptop.id);
		 System.out.println(laptop.name);
		 System.out.println(laptop.price);
		 System.out.println(laptop.ram);
		
	}

}
