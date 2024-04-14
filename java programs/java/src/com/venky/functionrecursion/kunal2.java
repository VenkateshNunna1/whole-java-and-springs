package com.venky.functionrecursion;

public class kunal2 {

	public static void main(String[] args) {
		int a =fact(5);
		System.out.println(a);
	}
	static int fact(int n) {
		if(n<=1)return 1;
	     return n*fact(n-1);
	}

}
