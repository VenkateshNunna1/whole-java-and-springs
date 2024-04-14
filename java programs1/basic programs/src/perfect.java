import java.util.Scanner;
public class perfect {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end=in.nextInt();
		for(int j=start;j<=end;j++) {
		int sum=0;
		for(int i=1;i<=j/2;i++) {
			if(j%i==0) {
				sum=sum+i;
			}
		}
		if(j==sum)
		System.out.println(j);
		}

	}

}
