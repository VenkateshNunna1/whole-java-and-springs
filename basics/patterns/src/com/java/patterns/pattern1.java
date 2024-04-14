package com.java.patterns;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=n;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	}

}
