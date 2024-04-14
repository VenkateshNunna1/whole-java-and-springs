package com.springs.ApplicationContextWithSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springs.xml");
		Pen p =(Pen) ac.getBean("pen");
        System.out.println(p.getId());
        System.out.println(p.getCompany());

	}

}
