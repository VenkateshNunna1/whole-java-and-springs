package com.venky.extendingpropertieswithoutextends;
import java.util.Scanner;

class Shape{
	double radius;
	String color;
	public String area;
	void shape(double radius,String color){
		this.radius=radius;
		this.color=color;
	}
}
class circle  {//aquring parent class properties without inheritance 
	void area(Shape s) {
		double area=3.14*s.radius*s.radius;
		System.out.println("the area of radius:"+area);
		System.out.println("the color of the circle:"+s.color);
	}
	void perimeter(Shape s) {
		double perimeter= 2*3.14*s.radius;
		System.out.println("the perimeter of radius:"+perimeter);
	}
	

}
class factorymethod{
	void factorymethod() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the radius:");
		double r = in.nextDouble();
		System.out.println("enter the color ");
		String c = in.next();
		Shape s1 = new Shape();
		s1.shape(r, c);
		circle c1 = new circle();
		c1.area(s1);
		c1.perimeter(s1);
	}
}
public class Test {
    public static void main(String args[]) {
    	factorymethod f = new factorymethod();
    	f.factorymethod();
    }
}
