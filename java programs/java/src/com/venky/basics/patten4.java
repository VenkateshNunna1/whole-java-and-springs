package com.venky.basics;
import java.util.Scanner;
public class patten4 {
public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int num=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=num;j++) {
			System.out.print(j);
		}
		System.out.println();
		num=num+1;
		
	}
}
}
