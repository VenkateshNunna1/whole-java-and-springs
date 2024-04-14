package basicprograms;

import java.util.Scanner;

public class StrongRange {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int start = in.nextInt();
	int end = in.nextInt();
	for(int i=start;i<=end;i++) {
		int sum=0;
		int n=i;
		while(n>0) {
			int rem=n%10;
			int mul=1;
			for(int j=1;j<=rem;j++) {
				  mul=mul*j;
			}
			sum=sum+mul;
			n=n/10;
		}
		
		if(i==sum) {
			System.out.println(i);
		}
	}

	}

}
