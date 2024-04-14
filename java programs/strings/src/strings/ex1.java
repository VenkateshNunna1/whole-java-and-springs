package strings;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	  int c=ex1(s);
	  System.out.println(c);
	
	}
	static int ex1(String s) {
		int count=0;
		char[] c = s.toCharArray();
		for(int i=0;i<=c.length-1;i++) {
			if(c[i]>='0'&&c[i]<='9') {
				count++;
			}
		}
		return count;
	}

}
