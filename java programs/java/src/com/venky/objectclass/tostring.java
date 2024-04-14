package com.venky.objectclass;
class A{
	int i;
	A(int i){
	this.i=i;	
	}
	int m1() {
		return i;
	}
	@Override
	public String toString() {
		return "A [i=" + i + "]";
	}
	
}

public class tostring {

	public static void main(String[] args) {
	  A a = new A(10);
	  System.out.println(a.m1());
	  System.out.println(a);

	}

	
	

}
