package com.java.patterns;

public class pattern11 {

	public static void main(String[] args) {
		int n=5;
		int stars =0;
		for(int i=1;i<=2*n-1;i++) {
			if(i<=5) {
				stars=stars+1;
			}
			else {
				stars=stars-1;
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
