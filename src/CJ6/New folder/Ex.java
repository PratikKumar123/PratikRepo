package CJ6;

public class Ex {

	public static void main(String[] args) {
		int a=10;
		int b=2;
		int c=0;
		System.out.println(a/2);
		System.out.println(a+b);
		System.out.println(a*b);
		try {
			
			System.out.println(a/c);
		}
		catch (Exception b1) {
			
			System.out.println(b1);
		}
		finally {
			System.out.println(" FINALLY BLOCK");
		}

		System.out.println(a%b);
		System.out.println(a-b);
		System.out.println(++a);
		

		

	}

}
