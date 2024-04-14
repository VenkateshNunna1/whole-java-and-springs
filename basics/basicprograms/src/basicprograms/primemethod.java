package basicprograms;

import java.util.Scanner;

public class primemethod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean prime=isPrime(n);
		if(prime) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
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
