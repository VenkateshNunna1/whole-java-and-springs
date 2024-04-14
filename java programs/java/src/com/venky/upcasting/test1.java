  package com.venky.upcasting;
import java.util.Scanner;
class shape{
	String shape;
	final double  pie =3.14;
	shape(String shape){
		this.shape=shape;
	}
	void getarea() {
		
	}
	void getperimeter() {
		
	}
}
class circle extends shape{
	int radius;
	circle(int radius,String shape){
		super(shape);
		this.radius=radius;
	}
	void getarea() {
		double area = pie*radius*radius;
		System.out.println("the area of the circle:"+area);
	}
	void getperimeter() {
		double perimeter = 2*pie*radius;
		System.out.println("the perimeter of the circle"+perimeter);
		System.out.println("the shape of the circle:"+shape);
	}
 
}
class cylinder extends circle{
       int height;
	cylinder(int height,int radius,String shape){
		super(radius,shape);
		this.height=height;
	}
	void getarea() {
		double area=(2*pie*radius*height) + 2*pie*radius*radius;
		System.out.println("the area of the cylinder:"+area);
	}
	void getperimeter() {
		double perimeter = 4*radius + 2*height;
		System.out.println("the perimeter of the cylinder:"+perimeter);
		System.out.println("the shape of the cylinder:"+shape);
	}
}

public class test1 {

	public static void main(String[] args) {
		shape s1 = new shape("round");
		shape c1= new circle(5,"round");
		c1.getarea();
		c1.getperimeter();
		shape cy = new cylinder(5,5,"round");
		cy.getarea();
		cy.getperimeter();
	}

}
