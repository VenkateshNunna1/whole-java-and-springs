package basicprograms;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean flag=true;
		if(n<=1)flag=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("prime no");
		}
		else {
			System.out.println("not prime");
		}

	}

}
