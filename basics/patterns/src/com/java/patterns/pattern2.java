package com.java.patterns;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	   int n = in.nextInt();
	   for(int i=1;i<=n;i++) {
		   for(int j=i;j>=1;j--) {
			   System.out.print(j+" ");
		   }
		   System.out.println();
	   }
	
	}

}
