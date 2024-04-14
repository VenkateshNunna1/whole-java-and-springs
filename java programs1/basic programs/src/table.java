import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int j=in.nextInt();
		int n = in.nextInt();
		for(int i=1;i<=n;i++) {
			    int res=j*i;
			    System.out.println(j+"x"+i+"="+res);
		}

	}

}
