import java.util.Scanner;
class pattern1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int stars=1;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i>=n){
            stars--;
            }
            else{
                stars++;
            }
        }
    }
}