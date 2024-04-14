package com.venky.functionrecursion;

public class fibo {

	public static void main(String[] args) {
		
     fibo(20);
	}
	static int a=0;
	static int b=1;
	static int i=1;
	static int c;
	static void fibo(int n) {
		if(i>=n) {
			 System.out.println(c); 
			return;
		}
		if(i<n) {
			 c=a+b;
			  a=b;
			  b=c;
			 
		}
		i++;
		fibo(n);
	}

}
