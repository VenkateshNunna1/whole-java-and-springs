package basicprograms;

import java.util.Scanner;

public class primerangemethod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		int count=0;
		for(int i=start;i<=end;i++) {
		boolean prime=isPrime(i);
		if(prime) {
			count++;
			 if(count%2!=0) {
		        System.out.println(i);
			 }
		}
		}
		
	}
	static boolean isPrime(int n) {
		boolean flag=true;
		if(n<=1) flag=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
