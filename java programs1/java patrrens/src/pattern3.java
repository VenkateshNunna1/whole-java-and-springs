import java.util.Scanner;
class pattern3{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int spaces=0;
		int star=2*n-1;
		for(int i=1;i<=2*n+1;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=n) {
            spaces=spaces+1;
			star=star-2;
			}
			else if(i>n) {
				spaces=spaces-1;
				star=star+2;
			}
		}
	}
}