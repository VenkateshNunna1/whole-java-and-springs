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
    student(){
        this.rollno=17;
        this.name="venky";
        this.marks=67;
    }
    student(int roll,String naam,int mark){  //constructor creation
      this.rollno=roll;
      this.name=naam;
        this.marks=mark;
    }
}
class  Constructoroverloading{
    public static void main(String args[]){
       student stud1=new student(10,"kunal",90);
       //student stud1=new student();
        stud1.greeting();
        System.out.println(stud1.rollno);
        System.out.println(stud1.name);
         System.out.println(stud1.marks);

      
    }
}