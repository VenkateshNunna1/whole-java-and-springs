package com.java.patterns;

public class pattern12 {

	public static void main(String[] args) {
		int n=5;
		int spaces=n-1;
		int stars=n-4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			spaces--;
			stars++;
			System.out.println();
		}

	}

}
