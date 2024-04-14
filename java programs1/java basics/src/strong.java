import java.util.Scanner;
public class strong {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = in.nextInt();
		int temp=n;
			int sum=0;
		while(temp>0) {
			int rem=temp%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		System.out.println(sum);
		if(sum==n) {
			System.out.println("it is a strong number");
		}
		else {
			System.out.println("it is not a strong number");
		}
	}

}
