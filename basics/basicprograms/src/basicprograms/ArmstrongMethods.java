package basicprograms;

import java.util.Scanner;

public class ArmstrongMethods {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 int start = in.nextInt();
	 int end = in.nextInt();
	 for(int i=start;i<=end;i++) {
	   int palin= isPalin(i);
	   if(i==palin) {
		   System.out.println(i);
	   }
	 }

	 }


	static int count(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	static int pow(int base,int exp) {
		int pow=1;
		for(int i=1;i<=exp;i++) {
			pow=pow*base;
		}
		return pow;
	}
	static int isPalin(int n) {
		int len =count(n);
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+pow(rem,len);
			n=n/10;
			
		}
		return sum;
		
	}

}
