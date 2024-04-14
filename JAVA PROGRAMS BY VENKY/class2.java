class Student{
    int rollno;
    String name;
    float marks;
     Student(){
        this(15,"venky",78);//calling constructor from another constructor
    }
    Student(int roll,String name,float marks){
        this.rollno=roll;
        this.name=name;
        this.marks=marks;
    }

}
class class2{
    public static void main(String args[]){
         //Student kunal=new Student(14,"venky",67);
         Student random=new Student();
         System.out.println(random.rollno);
         System.out.println(random.name);
         System.out.println(random.marks);
         random.name="gani";//if any change made to the object of reference variable
         System.out.println(random.name);//that will  reflected to other variable pointing to same object
         Student one=random;
         System.out.println(one.name);
         
         
         
         
    }
}