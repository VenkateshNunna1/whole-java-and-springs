package com.venky.functionrecursion;

public class kunal5 {

	public static void main(String[] args) {
	int a =product(12345);
	System.out.println(a);

	}
	static int product(int n) {
		if(n<=0) return 1;
		return n%10*product(n/10);
	}

}
