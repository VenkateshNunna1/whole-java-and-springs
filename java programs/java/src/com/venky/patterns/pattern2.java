package com.venky.patterns;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int j=1;j<=1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
