package strngs;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine() ;
		char c='0';
		for(int i=0;i<s.length();i++) {
		      c = s.charAt(i);
			if(c>='A'&&c<='Z') {
				c=  (char) (c+32);
			
			}
			else {
				c=(char) (c-32);
			
			}
			System.out.print(c);
		}
		
	}

}
