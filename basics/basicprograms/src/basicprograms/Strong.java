package basicprograms;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  int temp=n;
	  int sum=0;
	  while(n>0) {
		  int rem = n%10;
		  int fact=1;
		  for(int i=1;i<=rem;i++) {
			  fact=fact*i;
		  }
		  sum+=fact;
		  n=n/10;
	  }
	  if(sum==temp) {
		  System.out.println("strong ");
	  }
	  else {
		  System.out.println("not a strong");
	  }
	  
      
      
	}

}
