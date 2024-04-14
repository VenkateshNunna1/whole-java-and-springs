package com.venky.functionrecursion;

public class kunal4 {

	public static void main(String[] args) {
	  int a = m1(12345);
	  System.out.println(a);
	}
	static int m1(int n) {
		if(n<=0) return 0;
		return n%10+m1(n/10);
	}

}
