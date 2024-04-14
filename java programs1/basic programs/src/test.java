import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int temp=n;
		int sum=0;
		while(n>9) {
			sum=0;
			
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		n=sum;
		System.out.println(sum);
		}
		

	}

}

