
import java.util.Scanner;
public class pattern7
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
    for(int i=1;i<=n;i++){
        int stars=0;
        if(i%2!=0)  stars=stars+1;
        else stars=stars+2;
        for(int j=1;j<=stars;j++){
            System.out.print("*");
        }
        System.out.println();
        
    }
	}
}
