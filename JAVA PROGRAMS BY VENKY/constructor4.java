class student{
    int rollno;
    String name;
    int marks;
    void greeting(){
        System.out.println("my name is "+name);
    }
    void changename(String newname){
        name=newname;
    }
    student(int rollno,String name,int marks){  //constructor creation
       rollno=rollno;
      name=name;
        marks=marks;
    }
}
class  Constructor4{
    public static void main(String args[]){
        student stud1=new student(10,"kunal",90);
        stud1.greeting();
        System.out.println(stud1.rollno);
        System.out.println(stud1.name);
         System.out.println(stud1.marks);

      
    }
}