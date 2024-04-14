import java.util.Scanner;
public class armstrong1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start=in.nextInt();
		int end=in.nextInt();
		int count=0;
		for(int j=start;j<=end;j++) {
			int temp=j;
			int length=0;
			for(;temp>0;) {
				temp=temp/10;
				length++;
			}
			
			temp=j;
			int sum=0;
			while(temp>0) {
				int rem=temp%10;
				int mul=1;
				for(int i=1;i<=length;i++) {
					mul=mul*rem;
				}
				sum=sum+mul;
				temp=temp/10;
				
			}
			if(j==sum) {
				System.out.println(sum);
			}
			
			}
		}
	}


