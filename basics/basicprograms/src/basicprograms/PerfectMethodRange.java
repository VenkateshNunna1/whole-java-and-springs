package basicprograms;

import java.util.Scanner;

public class PerfectMethodRange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		for(int i=start;i<=end;i++) {
		int per=isPerfect(i);
		if(per==i) {
			System.out.println(i);
		}
		}

	}
	static int  isPerfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

}
