import java.util.Scanner;
public class prime1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a range:");
		int start = in.nextInt();
		int end = in.nextInt();
		int count=0;
		for(int i=start;i<=end;i++) {
			boolean flag=true;
			if(i<=1) continue;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				count++;//alternative numbers
				if(count%2==0) {
				System.out.println(i);
				}
			}
		}

	}

}
