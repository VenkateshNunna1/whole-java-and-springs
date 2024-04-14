package patterns;

public class pattern1 {

	public static void main(String[] args) {
		pattern(5);
		}
	static void pattern(int n){
		int spaces=0;
		int stars=n+4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				if(i+j==10)
				System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			spaces=spaces+1;
			stars=stars-2;
		}
	}

}
