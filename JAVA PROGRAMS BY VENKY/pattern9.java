import java.util.Scanner;
class pattern9{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int spaces=0;
        int stars=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            spaces=spaces+1;
            stars=stars-1;
        }
        
    }
}