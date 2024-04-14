import java.util.Scanner;
public class lcm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = (a<b)?(a<c?b:c):(b<c?b:c);
		while(true) {
			if(d%a==0&&d%b==0&&d%c==0) break;
			d++;
		}
		System.out.println(d);

	}

}
