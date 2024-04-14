package strings;

public class ex4 {

	public static void main(String[] args) {
		String s="venkatesh";
		char[] c = s.toCharArray();
		for(int i=0;i<=c.length-1;i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		for(char k:c) {
			System.out.print(k);
		}
		

	}

}
