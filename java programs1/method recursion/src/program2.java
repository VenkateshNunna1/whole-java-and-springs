
public class program2 {
	static int sum=0;
	static void sum1(int n) {
		if(n==6)return;
		 sum=sum+n;
		System.out.println(sum);
		
		sum1(n+1);
	}

	public static void main(String[] args) {
		sum1(1);
	}

}
