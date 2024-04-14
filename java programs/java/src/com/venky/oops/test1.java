package com.venky.oops;

class circle1{
	int radius;
	String color;
	String shape;
	circle1(int radius,String color,String shape){
		this.radius=radius;
		this.color=color;
		this.shape=shape;
	}
	void area() {
		double area =3.14*radius*radius; 
		System.out.println("area of the cicle:"+area);
	}
	void perimeter() {
		double perimeter = 2*3.14*radius;
		System.out.println("perimeter of the circle:"+perimeter);
	}
}
class cylinder1{
	cylinder1(circle1 c,int height){
		double area = 2*3.14*c.radius*height + 2*3.14*c.radius*c.radius;
		System.out.println("area of the cylinder:"+area);
		double volume=3.14*c.radius*c.radius*height;
		System.out.println("volume of the cylinder:"+volume);
	}
}
class design1{
	void design() {
		System.out.println("*******************************************");
	}
}
public class test1 {
 public static void main(String args[]) {
	 circle1 c = new circle1(5,"yellow","round");
	 
	 
	 design d = new design();
	 c.area();
	 c.perimeter();
	 d.design();
	 cylinder1 cy = new cylinder1(c,10);
	 d.design();
 }
}
