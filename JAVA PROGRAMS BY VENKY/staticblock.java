class staticblock{
   static  int a=10;
   static int b;
   static{
       System.out.println("i am a static block");
       System.out.println(b);
        b=12;
   }
   public static void main(String args[]){
       staticblock obj = new staticblock();//static blocks can be accessed using object.and static blocks will be executed one when 
      System.out.println(a+" "+b);//the class is loaded
       b+=3;
       System.out.println(a+" "+b);
       staticblock obj2=new staticblock();
   }
    
}