import java.util.Scanner;
public class prime {
	static void prime(int n) {
		boolean flag=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}
	}
  public static void main(String args[]) {
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  
	  prime(n);
  }
}
