package com.springs.setterinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PenDriver {

	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("springcore.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Pen p =(Pen) bf.getBean("pendemo");
		
		System.out.println(p.getId());
		System.out.println(p.getBrand());
	    System.out.println(p.getPrice());

	}

}
