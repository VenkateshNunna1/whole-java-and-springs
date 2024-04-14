package basicprograms;

import java.util.Scanner;

public class perfectNumRange {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 int start = in.nextInt();
	 int end = in.nextInt();
	 for(int i=start;i<=end;i++) {
		 int sum=0;
		 for(int j=1;j<=i/2;j++) {
			 if(i%j==0) {
				 sum=sum+j;
			 }
		 }
		 if(sum==i) {
			 System.out.println(i);
		 }
	 }
	 

	}

}
