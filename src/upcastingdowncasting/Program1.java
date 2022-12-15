package upcastingdowncasting;

class Parent {

	String s;

	public void p() {
		System.out.println("Parent method:");
	}

}

class Child extends Parent {

	public void p() {
		System.out.println("Child method:");
	}

}

public class Program1 {

	public static void main(String[] args) {

		Parent p1 = new Child(); // upcasting
		p1.p(); // we can only use parent class methods
		System.out.println(p1.s = "Praikt");

		Child c1 = (Child) p1; // downcasting
		c1.p();

	}

}
