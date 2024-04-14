import java.util.Scanner;
public class pattern11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int  n = in.nextInt();
		int spaces=0;
		for(int i=1;i<=n;i++) {
			 char alpha='E';
			 char k=alpha;
			for(int j=n;j>=i;j--) {
			System.out.print(k+" ");
		        k--;

			}
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			System.out.println();
			spaces=spaces+1;
		}

	}

}
