package com.venky.strings;
import java.util.Scanner;
public class twelve {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s =in.nextLine();
	char[] a =s.toCharArray();
	int sum=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>='0'&&a[i]<='9') {
		   int k =a[i]-'0';
			sum=sum+k;
			}
	}
	    System.out.println(sum);

	}

}
