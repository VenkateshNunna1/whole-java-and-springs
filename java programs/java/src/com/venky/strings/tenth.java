package com.venky.strings;
import java.util.Scanner;
class tenth{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s =in.next();
		String k=s.toUpperCase();
		char[] a =k.toCharArray();
		int count=0;
		for(int i=0;i<k.length();i++) {
			if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U') {
				count++;
			}
		}
		System.out.println(count);
	}
}