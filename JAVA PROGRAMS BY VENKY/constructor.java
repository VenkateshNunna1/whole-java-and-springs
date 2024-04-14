class student{
    int rollno;
    String name;
    int marks;
    student(){  //constructor creation
        this.rollno=39;
        this.name="venky";
        this.marks=90;
    }
}
class  Constructor{
    public static void main(String args[]){
        student stud1=new student();
        student venky=new student();
        System.out.println(stud1.rollno);
        System.out.println(stud1.name);
         System.out.println(stud1.marks);
         System.out.println(venky.rollno);
        System.out.println(venky.name);
         System.out.println(venky.marks);
      
    }
}