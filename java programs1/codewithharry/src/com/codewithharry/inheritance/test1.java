package com.codewithharry.inheritance;
import java.util.Scanner;
class shape{
	int length;
	int breadth;
	String color;
	void getshape(int length,int breadth,String color) {
		this.length=length;
		this.breadth=breadth;
		this.color=color;
	}
}
class Rectangle2 extends shape{
	void area() {
		int area=length*breadth;
		System.out.println("the area of the rectangle:"+area);
		
	}
	void perimeter() {
		int perimeter = 2*(length+breadth);
		System.out.println("the perimeter of the rectangle:"+perimeter);
		System.out.println("the color of the rectangle:"+color);
	}
}
class factorymethod{
	void factory() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the length  for the rectangle:");
		int l = in.nextInt();
		System.out.println("enter the breadth  for the rectangle:");
		int b = in.nextInt();
		System.out.println("enter the color for the rectangle:");
		String c = in.next();
		Rectangle2 r1 = new Rectangle2();
		r1.getshape(l, b, c);
		r1.area();
		r1.perimeter();
		
	}
}
public class test1 {

	public static void main(String[] args) {
		factorymethod f = new factorymethod();
		f.factory();

	}

}
