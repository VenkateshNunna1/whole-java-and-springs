package com.venky.basics1;
import java.util.Scanner;
public class pattern1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
	 int stars=n;
		for(int i=1;i<=stars;i++ ) {
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
