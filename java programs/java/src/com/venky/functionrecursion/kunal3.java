package com.venky.functionrecursion;

public class kunal3 {

	public static void main(String[] args) {
		int a =m1(1);
		System.out.println(a);
	}
	static int m1(int n) {
		if(n==6)return 0;
		return n+m1(n+1);
	}

}
