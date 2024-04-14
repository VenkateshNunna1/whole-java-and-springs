package basicprograms;

import java.util.Scanner;

public class SumOddaeven {
   public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n =1234;
	int oddsum=0;
	int evensum=0;
	while(n>0) {
		int rem = n%10;
		if(rem%2==0) {
			evensum+=rem;
		}
		else {
			oddsum+=rem;
		}
		n=n/10;
	}
	System.out.println(oddsum);
	System.out.println(evensum);
}
}
