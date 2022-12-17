package cj4;

class Test{
	
	void display() {
		System.out.println("A");
	}
}
public class Main extends Test{
	
	
	void display2() {
		System.out.println("jkfbjkefb");
	}
	
	public static void main(String[] args) {
		Test t = new Main();
		t.display();

	}
}


