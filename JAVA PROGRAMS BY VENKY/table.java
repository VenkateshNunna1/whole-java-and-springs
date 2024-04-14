import java.util.Scanner;
class table{
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int  n = in.nextInt();
        int m = in.nextInt();
        int k;
        for(int i=1;i<=m;i++){
                 k=n*i;
                 System.out.println(n+"x"+i+"="+k);
        }
       

    }
}
