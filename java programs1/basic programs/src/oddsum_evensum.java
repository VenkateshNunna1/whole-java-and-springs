import java.util.Scanner;
public class oddsum_evensum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int evensum=0;
		int oddsum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				evensum=evensum+i;
			}
			else {
				oddsum=oddsum+i;
			}
		}
		System.out.println(evensum);
		System.out.println(oddsum);
	}

}
