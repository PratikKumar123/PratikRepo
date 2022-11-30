package CJ4;


interface interface1{
	
	public default void display() {
		System.out.println("Interface 1 called");
	}
}

interface interface2 {
	
	public default void display(int a) {
		System.out.println("Interface 2 called");
	}
}


public class MultipleInheitance implements interface1, interface2{
	
	public void display() {
		
		System.out.println("method 3 called");
		
	}
	
	public static void main(String[] args) {
		MultipleInheitance m = new MultipleInheitance();
		m.display();
		
	}
}


