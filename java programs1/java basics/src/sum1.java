import java.util.Scanner;
public class sum1 {
	static int sum(int n,int m) {
		Scanner in = new Scanner(System.in);
		if(n!=0) {
			int sum=0;
			for(int i=1;i<=m;i++) {
				int k = in.nextInt();
				sum=sum+k;
			}
			return sum;
		}
		 
		 else {
			 System.out.println("please enter 0 only then only you get sum of n numbers");
		 }
		return 0;
	}
  
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m =in.nextInt();
		 int k =sum(n,m);
		 System.out.println(k);

	}

}
