class student{
    int rollno;
    String name;
    int marks;
    void greeting(){
        System.out.println("my name is "+this.name);
    }
    
    student(int roll,String name,int marks){
        this.rollno=roll;
        this.name=name;
        this.marks=marks;
    }

}
class This2{
    public static void main(String args[]){
        student kunal=new student(13,"kunal",89);
        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        kunal.greeting();
        student venky=new student(14,"venky",90);
        System.out.println(venky.rollno);
        System.out.println(venky.name);
        System.out.println(venky.marks);
        venky.greeting();
}
}