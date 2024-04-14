import java.util.Scanner;
public class fibo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		for(int i=3;i<=n;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c+" ");
		}

	}

}
