class main{
        int i;
        static  void fun(){
          main a = new main();
          System.out.println(a.i);// we can't access directly non static data members and member functions inside the static. the  
          a.i=90;                //only way to access is to create object in the static and access it.
          System.out.println(a.i);
    }
      void fun1(){
          System.out.println(i);
      }
}
class staticandnonstatic1
{
	public static  void main(String[] args) {
	        main.fun();  //we can access directly static data members and member functions inside the static
	                      //with the help of class
	        main b=new main();
	         b.fun1();
	          
	}
	  
}
