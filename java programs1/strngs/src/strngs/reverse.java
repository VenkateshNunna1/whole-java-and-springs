package strngs;
import java.util.Scanner;
public class reverse {
     static String reverse(String s) {
	   char[] c = s.toCharArray();
	   for(int i=c.length-1;i>=0;i--) {
		      char temp=c[i];
		      
	   }
	   return s;
     }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
        System.out.println( reverse(s));
	}

}
