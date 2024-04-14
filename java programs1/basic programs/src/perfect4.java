
import java.util.Scanner;
public class perfect4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end=in.nextInt();
		int a=0;
		int b=0;
		for(int j=end;j>=start;j--) {
		int sum=0;
		for(int i=1;i<=j/2;i++) {
			if(j%i==0) {
				sum=sum+i;
			}
		}
		if(j==sum) {
			a=b;
			b=j;
		}
		}
		System.out.println(a);
		System.out.println(b);
		
	}

}
