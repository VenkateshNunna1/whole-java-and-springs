import java.util.Scanner;
public class perfect {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter a number:");
	int n = in.nextInt();
	int sum=0;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0) {
        	  sum=sum+i;
          }
	}
	if(sum==n) {
		System.out.println("it is a perfect number");
	}
	else {
		System.out.println("it is not a perfect number");
	}
	}

}
