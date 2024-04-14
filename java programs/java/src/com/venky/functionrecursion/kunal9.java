package com.venky.functionrecursion;

public class kunal9 {

	public static void main(String[] args) {
		int a = m1(14);
		System.out.println(a);
	}
	static int res;
	static int m1(int n) {
		if(n<=0) return res;
		if(n>0) {
		if(n%2==0) {
			 res=n/2;
		}
		else {
			res=n-1;
		}
		}
		System.out.println(res);
		return m1(res);
	}

}
