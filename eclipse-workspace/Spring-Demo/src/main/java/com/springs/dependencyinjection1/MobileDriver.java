package com.springs.dependencyinjection1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MobileDriver {

	public static void main(String[] args) {
		 ClassPathResource cpr = new ClassPathResource("springcore.xml");
		  BeanFactory bf = new XmlBeanFactory(cpr);
		  MobilePhone mobile= (MobilePhone) bf.getBean("myphone");
		  System.out.println(mobile.getMid());
		  System.out.println(mobile.getBrand());
		  System.out.println(mobile.getPrice());
		   Battery b= mobile.getBattery();
		  b.getBid();
		  b.getMah();
	}

}
