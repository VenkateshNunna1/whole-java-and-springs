public class shadowing
{
    static int x=8; // this will be shadowed at the line x=90
	public static void main(String[] args) {
		System.out.println(x);
		int x=90;       // the lower variable(x=90) is overided the upper variable(x=8)
		System.out.println(x);
		klm();
	}
	static void klm(){
	    System.out.print(x);
	}
}
