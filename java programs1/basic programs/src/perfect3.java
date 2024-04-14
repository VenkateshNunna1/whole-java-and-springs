
import java.util.Scanner;
public class perfect3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end=in.nextInt();
		int a=0;
		int b=0;
		for(int j=start;j<=end;j++) {
		int sum=0;
		for(int i=1;i<=j/2;i++) {
			if(j%i==0) {
				sum=sum+i;
			}
		}
		if(j==sum) {
			a=b;
			b=j;
			System.out.println("the range between"+start+"and"+"is:"+j);
		}
		}
		System.out.println("the seocond largest no in a range:"+a);
		System.out.println("the largest no in range:"+b);
		
	}

}
