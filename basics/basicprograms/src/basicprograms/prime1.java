package basicprograms;

public class prime1 {

	public static void main(String[] args) {
		int n=9;
		boolean flag=true;
		if(n<=1) flag=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
			}
		}
		if(flag) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}

	}

}
