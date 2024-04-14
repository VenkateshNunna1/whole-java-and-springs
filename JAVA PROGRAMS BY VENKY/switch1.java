import java.util.Scanner;
class switch1{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       String n=in.next();
       int k=0;
       switch(n){
           case "january":
               k=31;
               break;
            case "february":
                k=28;
                break;
            case "march":
                k=31;
                break;
            case "april" :
                k=30;
                break;
            case "may":
                k=30;
                break;
            case "june":
                k=30;
                break;
            case "july":
                k=31;
                break;
            case "august":
                k=30;
                break;
            case "september":
                k=30;
                break;
            case "october":
                k=31;
                break;
            case "november":
                k=30;
                break;
            case "december":
                k=31;
                break;

               
       }
       int count=0;
        for(int i=1;i<=k;i++){
            if(i%2==0){
               count++; 
            }
        }
        System.out.print(count);
       
    }
} 
