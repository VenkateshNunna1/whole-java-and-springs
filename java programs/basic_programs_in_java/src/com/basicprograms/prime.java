package com.basicprograms;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean b =prime(n);
		System.out.println(b);

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
	   if(flag==true) {
			return true;
		}
	   return false;
	}

}
