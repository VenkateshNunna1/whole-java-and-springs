package basicprograms;

import java.util.Scanner;

public class seocondhighestprime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count=0;
		int start = in.nextInt();
		int end = in.nextInt();
		int a=0;
		int b=0;
		for(int i=start;i<=end;i++) {
			boolean flag=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				count++;
				if(count==3) {
					System.out.println(i);
                    break;
				}
			}
		}
		;
	}

}
