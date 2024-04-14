package strngs;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine().toUpperCase();
		char[] c= s.toCharArray();
		String s1="";
		for(int i=c.length-1;i>=0;i--) {
			s1=s1+c[i];
		}
		if(s.equals(s1)) {
			System.out.println(s1+" is a palindrome string");
		}
		else {
			System.out.println(s+" is not a palindrome string");
		}
	}

}
