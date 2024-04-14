package strngs;
import java.util.Scanner;
public class palindrome1 {
         static boolean palindrome(String s) {
		  char[] c = s.toCharArray();
		  int i=0;
		  int j=c.length-1;
		  while(i<j) {
			  if(c[i]!=c[j]) {
				  return false;
			  }
			  i++;
			  j--;
		  }
		  return true;
         }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.nextLine().toLowerCase();	
		if(palindrome(s)==true) {		
			System.out.println("it is a palindrome");
		}
		else
			System.out.println("it is not a palindrome");
	}

}
