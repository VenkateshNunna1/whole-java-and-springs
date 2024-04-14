package com.venky.basics1;
import java.util.Scanner;
public class pattern6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int stars=1;
		int spaces=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("*"+" ");
			}
		 System.out.println();
		 stars=stars+1;
		 spaces=spaces-1;
		}

	}

}
