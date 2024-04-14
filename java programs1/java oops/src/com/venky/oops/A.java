package com.venky.oops;

public class A {
	A a;
	A m1(A a) {
		this.a=a;
		return a;
	}
	A m2(A a3) {
		a=a3.a;
		return a;
	}
	void show() {
		System.out.println(a);
	}
	public static void main(String args[]) {
		A a1 = new A();
		a1.m1(a1);
		a1.show();
		//a1.m1(null);
		//a1.show();
		A a2 = new A();
		a2.m2(a1);
		a2.show();

		
	}
}
