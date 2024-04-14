class student{
    int rollno=90;
    String name="venky";
    int marks=90;
    
}
class Class1{
    public static void main(String args[]){
        student stud1=new student();
        System.out.println(stud1.rollno);
        System.out.println(stud1.name);
         stud1.name="raju";
         System.out.println(stud1.name);
      
    }
}