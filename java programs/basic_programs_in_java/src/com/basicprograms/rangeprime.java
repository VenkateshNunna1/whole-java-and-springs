package com.basicprograms;

import java.util.Scanner;
public class rangeprime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end=in.nextInt();
		for(int i=start;i<=end;i++) {
		   if(prime(i)) {
			   	System.out.println(i);
		   }
		
		}

	}
		static boolean prime(int n) {
		 boolean flag=true;
		if(n<=1) flag=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		if(flag)
			return true;
	   return false ;	    
	}

}
