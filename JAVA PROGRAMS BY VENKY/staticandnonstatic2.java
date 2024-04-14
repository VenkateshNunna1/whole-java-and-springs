class main{
        int i;
        static int j;
        void fun(){
           System.out.println(i);
           main a = new main();
           System.out.println(i);
      }
      static void fun1(){
          System.out.println(j);
          j=90;
          System.out.println(j);
          
      }
      static void fun2(){
          fun1();
      }
}
class staticandnonstatic2
{
	public static  void main(String[] args) {
	        
	        main b=new main();
	         b.fun();
	          main.fun2();
	}
	  
}
