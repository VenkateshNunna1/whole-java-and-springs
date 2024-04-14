import java.util.Scanner;
class A{
	A(int n){
		int oddsum=0;
		int evensum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				 evensum=evensum+i;
			}
			else {
				 oddsum=oddsum+i;
			}
		}
		System.out.println(oddsum);
		System.out.println(evensum);
	}
}
public class odd_even {
    public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	A a = new A(n) ;
    }
}
