
import java.util.Scanner;
public class perfect1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end=in.nextInt();
		int count=0;
		for(int j=start;j<=end;j++) {
		int sum=0;
		for(int i=1;i<=j/2;i++) {
			if(j%i==0) {
				sum=sum+i;
			}
		}
		if(j==sum) {
			count=count+1;
		if(count%2!=0) {
		    System.out.println(j);
		}
		}
		}
		

	}

}
