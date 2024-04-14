package basicprograms;

import java.util.Scanner;

public class primerange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int start = in.nextInt();
	    int end=in.nextInt();
	    for(int i=start;i<=end;i++) {
	    	boolean flag=true;
	    	for(int j=2;j<=i/2;j++) {
	    		if(i%j==0) {
	    			flag=false;
	    			break;
	    		}
	    		
	    	}
	    	if(flag) {
	    		System.out.println(i);
	    	}
	    	
	    }
	

	}

}
