
import java.util.Scanner;
public class armstrong1{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end =in.nextInt();
		for(int j=start;j<=end;j++) {
		int temp=j;
		int count=0;
		while(j>0) {
			count++;
			j=j/10;
		}
		j=temp;
		int sum=0;
		while(j>0) {
			int rem=j%10;
			int mul=1;
			for(int i=1;i<=count;i++) {
				mul=mul*rem;
			}
			sum=sum+mul;
			j=j/10;
		}
		j=temp;
	       if(j==sum) {
		  System.out.println(j);
	       }
		}
	  }
		
	}