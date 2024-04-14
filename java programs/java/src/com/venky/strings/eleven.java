package com.venky.strings;
import java.util.Scanner;
public class eleven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s =in.next();
		char[] a = s.toCharArray();
		int count=0;
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]>='0'&&a[i]<='9') {
	    		count++;
	    	}
	    }
	    System.out.println(count);

	}

}
