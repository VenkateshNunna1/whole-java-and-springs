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
    student(student other){
        this.rollno=other.rollno;
        this.name=other.name;
        this.marks=other.marks;
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
class  Constructoroverloading2{
    public static void main(String args[]){
       student stud1=new student(10,"kunal",90);
       //student stud1=new student();
       student random=new student(stud1);
        System.out.println(random.rollno);
        System.out.println(random.name);
         System.out.println(random.marks);

      
    }
}