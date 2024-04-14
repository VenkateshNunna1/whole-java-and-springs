import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int sum=0;
		String s="";
		for(int i=1;i<=m;i++) {
			int n = in.nextInt();
			sum=sum+n;
			s=s+i;
			if(i<m)
			s=s+"+";
		}
		System.out.println(s+"= "+sum);

	}

}
