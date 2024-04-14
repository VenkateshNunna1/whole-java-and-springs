package com.armstrong;

import java.util.Scanner;

public class armstrong2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lower = in.nextInt();
		int upper = in.nextInt();
		for(int i=lower;i<=upper;i++) {
		int temp=i;
		int sum=0;
		int count =0;
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		temp=i;
		while(temp>0) {
			int rem =temp%10;
			int mul=1;
			for(int j=1;j<=count;j++) {
				  mul=mul*rem;
			}
			sum =sum+mul;
			temp=temp/10;
		}
		if(sum==i) {
			System.out.println(i);
		}
	}

	}

}
