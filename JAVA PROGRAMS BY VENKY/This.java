class student{
    int rollno;
    String name;
    int marks;
    void greeting(){
        System.out.println("my name is "+name);
    }
    void greeting1(String s){
        name=s;
        System.out.println("my name is "+name);
    }
    student(){
        this.rollno=17;
        this.name="venky";
        this.marks=89;
    }
    student(int roll,String naam,int mark){
        this.rollno=roll;
        this.name=naam;
        this.marks=mark;
        
    }
}
class This{
    public static void main(String args[]){
        student kunal=new student();
        System.out.println(kunal.rollno);
        kunal.greeting();
        student gani =new student();
        gani.greeting();
        student venky = new student(12,"venkatesh nunna",89);
        System.out.println(venky.rollno);
        student venky1 = new student();
        venky1.greeting1("venkata ganesh nunna");
    }
}