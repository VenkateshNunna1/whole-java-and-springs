import java.util.Scanner;
class pattern4{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int spaces=0;
		int star=2*n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
            spaces=spaces+1;
			star=star-2;
			
		}
		int spaces1=n-1;
		int star1=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++) {
				System.out.print("*");
			}
			System.out.println();
            spaces1=spaces1-1;
			star1=star1+2;
			
		}

		
	}
}