

import java.util.Scanner;
public class fibo2{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start=in.nextInt();
		int end=in.nextInt();
			int a=0;
			int b=1;
			int  c=0;
		if(start==0) {
		System.out.print(a+" "+b);
		}
		for(;;) {
			 c=a+b;
			if(c>end) {break;}
			if(c>=start) {
			  System.out.print(" "+c+" ");
			}
			a=b;
			b=c;
		}
		}

	}


