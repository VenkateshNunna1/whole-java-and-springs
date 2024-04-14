import java.util.Scanner;
public class reverse1 {
	static void reverse(int n) {
		int reverse=0;
		while(n>0) {
			int rem = n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
          int n =in.nextInt();
          reverse(n);
	}

}
