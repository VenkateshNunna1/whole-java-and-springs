package basicprograms;

import java.util.Scanner;

public class smofdigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int res=0;
		for(int i=1;i<=n;i++) {
			int digit = in.nextInt();
			res=res+digit;
		}
		System.out.println(res);

	}

}
