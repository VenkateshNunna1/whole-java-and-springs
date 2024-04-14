package com.venky.abstract1;
import java.util.Scanner;
abstract class shape{
	final double  pie =3.14;
	abstract void getarea();
	abstract void  getperimeter();
}
class circle extends shape{
     int radius;
     String color;
	circle(String color,int radius) {
		this.radius=radius;
		this.color=color;
	}
	@Override
	void getarea() {
	  double area = pie*radius*radius;
	  System.out.println("the area of the circle:"+area);
	  System.out.println("the color of the circle:"+color);	
	}
	@Override
	void getperimeter() {
       double perimeter = 2*pie*radius;
       System.out.println("the perimeter of the circle:"+perimeter);
       
	}
	static shape factorymethod() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the color for circle:");
		String c = in.next();
		System.out.println("enter the radius of circle:");
		int r =in.nextInt();
		shape s = new circle(c,r);
		  s.getarea();
		 s.getperimeter();
		return s;
	}
	
}
public class test2 {

	public static void main(String[] args) {
     shape s1 =circle.factorymethod();
     shape s2 =circle.factorymethod();
		
	}

}
