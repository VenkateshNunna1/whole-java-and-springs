//usig this keyword we can access class level variables and methodsand this is pointing towards current level object
class this3{
    int i=19;
    int j=90;
    public void add(int i,int j){
        this3 c= new this3();
        System.out.println(i+j);//first priority takes from method level here i=18 ,j=19 are local variables.
        System.out.println(c.i+c.j);//this is one way to access class level variables and methods/instance variables of current class using object creation.
        System.out.println(this.i+this.j);// using this keyword we can access instannce variables of current class.
    }
    public static void main(String args[]){
        this3 p = new this3();
        p.add(18,19);
    }
}