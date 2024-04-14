import java.util.Arrays;
public class varargs //variable length arguments
{
	public static void main(String[] args) {
		klm(19,78,99,00,90);
	}
	static void klm(int ...x){// usage of variable length arguments is do not know how many inputs we are giving  and internally takes as array of integers
	    System.out.print(Arrays.toString(x));//variable length arguments alwaya at the end
	}
}
