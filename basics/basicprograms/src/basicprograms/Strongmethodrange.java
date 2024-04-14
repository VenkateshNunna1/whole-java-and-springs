package basicprograms;

import java.util.Scanner;

public class Strongmethodrange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end= in.nextInt();
		for(int i=start;i<=end;i++) {
		  int strong = isStrong(i);
		  if(strong==i) {
			  System.out.println(i);
		  }
		}

	}
	static int isStrong(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			int fact=fact(rem);
			sum=sum+fact;
			n=n/10;
			
		}
		return sum;
	}
	static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
