import java.util.Scanner;
class pattern10
{
    public static void main(String args[])
   {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int spaces=0;
        int stars=2*n-1;
        for(int i=1;i<=n;i++) 
        {
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++)
            {
            System.out.print("*");
            }
        System.out.println();
        spaces++;
        stars-=2;
        }
}
}