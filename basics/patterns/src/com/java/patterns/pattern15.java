package com.java.patterns;

public class pattern15 {

	public static void main(String[] args) {
		int n=5;
		int stars=n+1;
		int spaces=-1;
		for(int i=1;i<=2*n-1;i++) {
			if(i<=5) {
				stars=stars-1;
				spaces=spaces+1;
			}
			else {
				stars=stars+1;
				spaces=spaces-1;
			}
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
