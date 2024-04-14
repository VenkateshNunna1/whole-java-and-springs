
 import java.util.Scanner;
public class pattern6
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	for(int i=1;i<=n;i++){
	    if(i%2!=0){
	        for(int j=1;j<=1;j++){
	            System.out.print("*");
	        }
	   
	    }
	    else{
	        for(int j=1;j<=2;j++){
	            System.out.print("*");
	        }
	         
	    }
	     System.out.println();
	    
	   
	}
	}
}
