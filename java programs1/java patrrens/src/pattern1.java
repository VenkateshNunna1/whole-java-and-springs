import java.util.Scanner;
public class pattern1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int spaces=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++) {
				System.out.print(j);
			}
			spaces=spaces+1;
			System.out.println();
		}

	}

}
