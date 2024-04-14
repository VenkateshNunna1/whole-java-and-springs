package strings;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int k=sum(s);
		System.out.println(k);

	}
	static int sum(String s) {
		char[] c = s.toCharArray();
		int sum=0;
		for(int i=0;i<=c.length-1;i++) {
			if(c[i]>='0'&&c[i]<='9') {
				int n= c[i]-'0';
				sum=sum+n;
			}
		}
		return sum;
	}

}
