package com.java.patterns;

public class String1 {

	public static void main(String[] args) {
	  String s="aaabbbbaaaasssla";
	  int i=0;
	  while(i<s.length()) {
		 char c=s.charAt(i) ;
		 int count=1;
		 int j=i+1;
		 while(j<s.length() && s.charAt(j)==c) {
			 count++;
			 j++;
		 }
		 i=j;
		 System.out.println(c+"-"+count);
	  }

	}

}
