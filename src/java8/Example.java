package java8;


interface Apple {
	
	default void show() {
		System.out.println("I A");
	}
}
interface Bnana {
	
	default void show() {
		System.out.println("I B");
	}
}
public class Example implements Apple,Bnana{
	
	public void show() {
		
		Apple.super.show();
	}
	

	public static void main(String[] args) {
		
		Example e = new Example();
		e.show();
		

	}

}
