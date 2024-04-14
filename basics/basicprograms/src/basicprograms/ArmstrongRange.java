package basicprograms;

import java.util.Scanner;

public class ArmstrongRange {

	public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int start = in.nextInt();
     int end = in.nextInt();
     for(int i=start;i<=end;i++) {
    	 int count=0;
    	 int temp=i;
    	 while(i>0) {
    		 count++;
    		i=i/10;
    	 }
    	i=temp;
    	 int sum=0;
    	 while(i>0) {
    		 int rem=i%10;
    		 int mul=1;
    		 for(int j=1;j<=count;j++) {
    			 mul=mul*rem;
    		 }
    		 sum=sum+mul;
    		 i=i/10;
    	 }
    	 i=temp;
    	 if(i==sum) {
    		 System.out.println(i);
    	 }
     }
	}

}
