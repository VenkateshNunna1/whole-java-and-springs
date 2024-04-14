import java.util.Scanner;
class armstrong{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = in.nextInt();
	    int temp=n;
		int length=0;
		for(;temp>0;) {
			temp=temp/10;
			length++;
		}
		System.out.println(length);
		temp=n;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			int mul=1;
			for(int i=1;i<=length;i++) {
				mul=mul*rem;
			}
			sum=sum+mul;
			temp=temp/10;
			
		}
		if(n==sum) {
			System.out.println("it is a armstrong number");
		}
		else {
			System.out.println("not a armstrong number");
		}
	}
}