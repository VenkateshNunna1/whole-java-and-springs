import java.util.Scanner;
public class reverse {
	static void reverse(int n) {
		String s=" ";
		while(n>0) {
			int rem = n%10;
			s=s+rem;
			n=n/10;
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
          int n =in.nextInt();
          reverse(n);
	}

}
