package com.venky.oops;
import java.util.Scanner;
class Rectangle{
	int length;
	int breadth;
	String color;
	String shape;
	Rectangle(String color,String shape){
		this.color=color;
		this.shape=shape;
	}
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	Rectangle(int num){
		this(num,num);
	}
	void area() {
		int area = length*breadth;
		System.out.println("the area of the rectangle is:"+area);
	}
	void perimeter() {
		int perimeter = 2*(length+breadth);
		System.out.println("the perimeter of the rectangle:"+perimeter);
	}
	
}
public class test2 {
  public static void main(String args[]) {
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  Rectangle  r = new Rectangle(n);
	  r.area();
	  r.perimeter();
  }
}
