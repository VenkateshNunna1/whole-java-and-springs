package com.venky.functionrecursion;

public class kunal1 {

	public static void main(String[] args) {
		m1(5);
		
	}
	static void m1(int n) {
		if(n==0)return ;
		System.out.println(n);
		 m1(n-1);
	}

}
