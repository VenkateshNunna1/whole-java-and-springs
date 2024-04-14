import java.util.Scanner;
class pattern14{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int stars=1;
       for(int i=1;i<=n-1;i++){
           for(int j=1;j<=stars;j++){
               if(j==1||j==stars)
               System.out.print("*"+" ");
               else
               System.out.print(" ");
           }
           System.out.println();
           if(i<n/2){
           stars=stars+1;
           }
           else{
               stars=stars-1;
           }
       }
    }
}