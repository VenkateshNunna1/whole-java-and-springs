package basicprograms;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int temp=n;
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		n=temp;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			int mul=1;
			for(int i=1;i<=count;i++) {
				 mul=mul*rem;
			}
			sum=sum +mul;
			n=n/10;
			
		}
		if(temp==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		

	}

}
