package strngs;
import java.util.Scanner;
public class arrayo0fcharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s =in.nextLine();
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
	
		}
		for(char ch:c) {
			System.out.print(ch);
		}

	}

}
