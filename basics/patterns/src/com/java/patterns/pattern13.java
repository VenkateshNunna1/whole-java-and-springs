package com.java.patterns;

public class pattern13 {

	public static void main(String[] args) {
		int n=5;
		int stars=n+4;
		int spaces=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			stars=stars-2;
			spaces=spaces+1;
			System.out.println();
		}

	}

}
