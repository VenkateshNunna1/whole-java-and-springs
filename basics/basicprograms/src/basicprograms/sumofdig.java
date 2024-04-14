package basicprograms;

import java.util.Scanner;

public class sumofdig {
      public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum=0;
		while(n>0||sum>9) {
			if(n==0) {
				n=sum;
				sum=0;
			}
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println(sum);
	}
}
