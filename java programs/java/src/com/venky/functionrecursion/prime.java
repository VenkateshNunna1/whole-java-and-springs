package com.venky.functionrecursion;
public class prime{
	public static void main(String args[]) {
		prime(101);

	}
	static  boolean flag=true;
	static int i=2;
	static void prime(int n) {
		if(n==2||n<=1) {
			System.out.println(n+"not prime ");
			return;
		}
		if(i>=n) {
			if(flag==true) {
			System.out.println(n+" prime");
			}
			else
			{
				System.out.println(n+" not prime");
			}
			return;}
		if(i<=n/2) {
			if(n%i==0) {
				flag=false;
			}
			
		}
		i++;
		prime(n);
	}
}
