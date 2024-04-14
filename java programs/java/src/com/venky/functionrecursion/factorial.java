package com.venky.functionrecursion;

public class factorial {

	public static void main(String[] args) {
		int a =  factorial(5);
		System.out.println(a);

	}
	static int fact=1;
	static int factorial(int n) {
		if(n<=0) {
		return fact ;
		}
		fact=fact*n;
		return  factorial(n-1);

}
}