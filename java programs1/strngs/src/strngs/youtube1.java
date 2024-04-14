package strngs;
import java.util.Scanner;
public class youtube1 {
  public static void main(String args[]) {
	  Scanner in = new Scanner(System.in);
	  String s = in.nextLine();
	  char[] c = s.toCharArray();
	  int count=0;
	  for(int i=0;i<c.length;i++) {
		  count++;
	  }
	  System.out.println(count);
	}
}
