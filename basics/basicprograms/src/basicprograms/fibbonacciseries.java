package basicprograms;

import java.util.Scanner;

public class fibbonacciseries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		System.out.print("0 1");
		for(int i=start;i<=end;i++){
			int num=0;
			int num1=1;
			int temp=0;
			for(int j=1;j<=i;j++) {
				temp=num+num1;
				num=num1;
				num1=temp;
				
			}
			if(temp<=end && temp>=0) {
			System.out.print(" "+temp +" ");
			}
		}

	}

}
