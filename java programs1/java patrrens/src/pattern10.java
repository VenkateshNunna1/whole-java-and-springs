import java.util.Scanner;
public class pattern10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int stars1 =1;
		int spaces=n+2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=stars1;j++) {
				System.out.print(j);
			}
			for(int j=1;j<=spaces;j++) {
				System.out.print(" "+"");
			}
		
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
			stars1=stars1+1;
			spaces=spaces-2;
			
			
		}

	}

}
