package com.basicprograms;


import java.util.Scanner;
public class prime2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end =in.nextInt();
		int a=0;
		int b=0;
		int c=0;
		for(int j=end;j>=start;j--) {
		boolean flag=true;
		if(j<=1)flag=false;
		for(int i=2;i<=j/2;i++) {
			if(j%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			a=b;
			b=c;
			c=j;
		}
		
		}
		System.out.println("third smallest number:"+a);
		System.out.println("seocond smallest number:"+b);
		System.out.println("first smallest number:"+c);

		

	}


}
