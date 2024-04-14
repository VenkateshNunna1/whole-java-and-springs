package com.venky.singleton;
class A{
	private static A a=null;
	private A() {
		
	}
	public static A m1() {
		if(a==null) {    //A class atmost one object is known as singleton class.
			a=new A();
		}
		return a;
	}
}
class test{
	public static void main(String args[]) {
		A a1=A.m1();
		A a2= A.m1();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1==a2);
	}
}