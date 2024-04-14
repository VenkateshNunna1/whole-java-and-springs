package strings;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		 ex3(s);
		
	}
	static void ex3(String s) {
	    for(int i=0;i<=s.length()-1;i++) {
	    	char k = s.charAt(i);
	    	if(k>='A'&&k<='Z') {
	    		k=(char) (k+32);
	    	}
	    	else {
	    		k=(char) (k-32);
	    	}
	    	System.out.print(k);
	    }
	
		
	}

}
