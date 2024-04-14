import java.util.Scanner;
public class hcf {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c= in.nextInt();
		int hcf=0;
		int d = (a<b)?(a<c?a:c):(b<c?b:c);
		for(int i=1;i<=d;i++) {
			if(a%i==0&&b%i==0&&c%i==0) {
				hcf=i;
			}
		}
		System.out.println(hcf );
	}

}
