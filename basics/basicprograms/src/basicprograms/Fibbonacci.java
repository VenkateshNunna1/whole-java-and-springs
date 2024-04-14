package basicprograms;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int num0=0;
		int num1=1;
		int temp=0;
		System.out.print(num0+ " "+num1+ " ");
		for(int i=2;i<n;i++) {
			temp=num0+num1;
			num0=num1;
			num1=temp;
			System.out.print(temp + " ");
		}
		
		
	}

}
