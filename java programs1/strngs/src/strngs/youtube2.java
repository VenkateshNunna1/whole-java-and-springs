package strngs;
import java.util.Scanner;
public class youtube2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		int count=0;
		char[] c =s.toCharArray();
		for(int i=0;i<=c.length-1;i++) {
		  if(c[i]==' ') {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
