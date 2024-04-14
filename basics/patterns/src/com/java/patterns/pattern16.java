package com.java.patterns;

public class pattern16 {

	public static void main(String[] args) {
		int n=5;
		int spaces=n-1;
		for(int i=1;i<=n;i++) {
          for(int j=1;j<=spaces;j--) {
        	  System.out.print(" ");
          }
			for(int j=1;j<=n;j++) {
			   if(i==j||j==1||i==n) {
				System.out.print("*"+" ");
			   }
			   else {
				   System.out.print(" ");
			   }
			}
			spaces =spaces-1;
			System.out.println();
		}

	}

}
