package com.armstrong;

import java.util.Scanner;

public class armstrong3 {
	
	public static int count(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
		
	}
	public static int power(int rem,int len) {
		int mul=1;
		for(int i=1;i<=len;i++) {
			mul=mul*rem;
		}
		return mul;
	}
	public static int isarm(int n) {
		int sum=0;
		int len=count(n);
		while(n>0) {
			int rem=n%10;
			sum=sum+power(rem,len);
			n=n/10;
		}
		 
		
		return sum;
		
	}

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 int n = in.nextInt();
//	 int c=count(n);
//	 int p=power(n,c);
	 int k=isarm(n);
	 if(k==n) {
		 System.out.println("armstrong");
	 }
	}

}
