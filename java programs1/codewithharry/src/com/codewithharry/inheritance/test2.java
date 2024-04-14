package com.codewithharry.inheritance;
import java.util.Scanner;
class Rectangle89 {
	int length;
    int breadth;
    Rectangle89(int length,int breadth){
    	this.length=length;
    	this.breadth=breadth;
    }
    void area() {
    	int area = length*breadth;
    	System.out.println("the area  of rectangle:"+area);
    }
    void perimeter() {
    	int perimeter = 2*(length+breadth);
    	System.out.println("the breadth of rectangle:"+perimeter);
    }
}
class cubeoid extends Rectangle89{
	int height;
	cubeoid(int length,int breadth,int height){
		super(length,breadth);
		this.height=height;
	}
	void area1() {
		int area1 = 2*(length*breadth+breadth*height+length*height);
				System.out.println("the area of the cuboid:"+area1);
	}
	void perimeter1() {
		int perimeter = 4*(length+breadth+height);
		System.out.println("the perimeter of cuboid:"+perimeter);
	}
}
class factorymethod1{
	static void factory() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the length:");
		int l = in.nextInt();
		System.out.println("enter the breadth:");
		int b = in.nextInt();
	     System.out.println("enter the height:");
	     int h = in.nextInt();
		cubeoid c = new cubeoid(l,b,h);
		c.area();
		c.perimeter();
		c.area1();
		c.perimeter1();
	}
}
public class test2 {
       public static void main(String args[]) {
    	   factorymethod1.factory();
       }
}
