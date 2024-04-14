package com.venky.oops;
class shape{
	int radius;
	String color;
	void shape(int r,String c) {
		radius=r;
		color=c;
	}

}
class circle{
	String shape ="round";
	void circle(shape s) {
		System.out.println("the radius of the circle:"+s.radius);
		System.out.println("the color of the circle:"+s.color);
		System.out.println("the shape of the circle:"+shape);
		
	}
}
class cylinder{
	void cylinder(shape s,circle c) {
		System.out.println("the radius of the cylinder:"+s.radius);
		System.out.println("the color of the cylinder:"+s.color);
		System.out.println("the shape of the cylinder:"+c.shape);
	}
}
class design{
	void design() {
		System.out.println("*********************************************");
	}
}
public class test {

	public static void main(String[] args) {
		shape s = new shape();
		s.shape(10,"yellow");
		circle c = new circle();
		c.circle(s);
		design d = new design();
		d.design();
		cylinder cy = new cylinder();
		cy.cylinder(s,c);
		d.design();
		

	}

}
