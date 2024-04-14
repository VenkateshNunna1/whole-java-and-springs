
import java.util.Scanner;
class pattern8{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int spaces=n-1;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=num;j--){
                System.out.print(j);
            }
            for( int j=i;j>num;j--){
                System.out.print(j);
            }
            System.out.println();
            spaces=spaces-1;
                
            }
            spaces=1;
            for(int i=n-1;i>=1;i--){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=num;j--){
                System.out.print(j);
            }
            for(int j=i;j>num;j--){
                System.out.print(j);
            }
            System.out.println();
            spaces=spaces+1;
        }
            
        }
    }
