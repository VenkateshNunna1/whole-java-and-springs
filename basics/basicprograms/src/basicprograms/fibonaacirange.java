package basicprograms;

import java.util.Scanner;

public class fibonaacirange {

	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	  long start = in.nextLong();
	  long end = in.nextInt();
	   System.out.print("0 1");
	   for(long i=start;i<=end;i++) {
		   long num=0;
		   long num1=1;
		   long temp=0;
		   for(long j=1;j<=i;j++) {
			   temp=num+num1;
			   num=num1;
			   num1=temp;
				   }
		   if(temp<=end && temp>=0 ) {
			   System.out.print(" "+temp + " ");
		
		   }
		   
	   }
	}

}
