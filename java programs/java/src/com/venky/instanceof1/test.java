package com.venky.instanceof1;
class A{
	
}
class B extends A {
	
}
public class test {

	public static void main(String[] args) {
	   Object o = new Object();
	    System.out.println(o instanceof Object);
	    System.out.println(o instanceof A);
	    System.out.println(o instanceof B);
	    A a = new A();
	    System.out.println(a instanceof Object);
	    System.out.println(a instanceof A);
	    System.out.println(a instanceof B);
	    B b = new B();
	    System.out.println(b instanceof Object);
	    System.out.println(b instanceof A);
	    System.out.println(b instanceof B);
	    Object o1 = new A();
	    System.out.println(o1 instanceof Object);
	    System.out.println(o1 instanceof A);
	    System.out.println(o1 instanceof B);
	    A a1 = new B();
	    System.out.println(a1 instanceof Object);
	    System.out.println(a1 instanceof A);
	    System.out.println(a1 instanceof B);
	}

}
