import java.util.Scanner;
class pattern3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int spaces=n+2;
        int num2=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" "+"");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+"");
            }
            System.out.println();
            spaces=spaces-2;
        }
    }
}