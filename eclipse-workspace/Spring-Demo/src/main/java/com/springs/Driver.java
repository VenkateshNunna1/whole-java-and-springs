package com.springs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Driver {

	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("springcore.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		
		A a=(A) bf.getBean("Ademo");
		a.m1();
		
		B b = (B) bf.getBean("Bdemo");
		b.m1();
	
		C c =(C) bf.getBean("Cdemo");
		c.m1();
	}

}
