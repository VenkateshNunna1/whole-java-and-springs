
import java.util.Scanner;
class pattern4{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int stars1=1;
        int spaces=n+2;
        int stars2=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=stars1;j++){
                System.out.print("*"+"");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars2;j++){
                System.out.print("*"+"");
            }
            System.out.println();
            stars1=stars1+1;
            spaces=spaces-2;
            stars2=stars2+1;
        }
    }
}