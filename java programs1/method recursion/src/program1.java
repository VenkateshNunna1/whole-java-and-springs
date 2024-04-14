
public class program1 {
	static int printnum(int n) {
		if(n==100)return n;
		System.out.println(n);
		 return printnum(n+1);
	}
	public static void main(String[] args) {
		int k = printnum(1);
		System.out.println(k);
	}

}
