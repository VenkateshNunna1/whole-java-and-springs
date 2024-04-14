class student{
    int rollno;
    String name;
    int marks;
    void greeting(){
        System.out.println("my name is "+name);
    }
    student(){  //constructor creation
        this.rollno=39;
        this.name="venky";
        this.marks=90;
    }
}
class  constructor2{
    public static void main(String args[]){
        student stud1=new student();
        stud1.greeting();
        System.out.println(stud1.rollno);
        System.out.println(stud1.name);
         System.out.println(stud1.marks);
         
      
    }
}