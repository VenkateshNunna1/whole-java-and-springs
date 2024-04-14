package com.armstrong;

import java.util.Scanner;

public class armstrong1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int temp=n;
		int sum=0;
		int count =0;
		while(n>0) {
			count++;
			n=n/10;
		}
		n=temp;
		while(n>0) {
			int rem = n%10;
			int mul=1;
			for(int i=1;i<=count;i++) {
				  mul=mul*rem;
			}
			sum =sum+mul;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(sum+" it is a armstrong");
		}
		else {
			System.out.println(temp+"it is not a armstrong");
		}
	

	}

}
