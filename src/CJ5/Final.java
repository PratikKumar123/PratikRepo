package CJ5;

//final can be method 
//final can be class
//final can be variable

final class F{
	void display() {
		System.out.println("method 1");
	}
}

public class Final extends F {

	public static void main(String[] args) {

		final int a=10;

//			a=a+10;
//give compilation error because final variable can not be modified 
//		System.out.println(a);
		
		Final f = new Final();
		f.display();
		

	}

}
