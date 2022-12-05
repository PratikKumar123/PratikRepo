package cj4;

//super

class Parent {

	public Parent() {
		System.out.println("Parent constructor");
	}

	public Parent(int i) {
		this();
		System.out.println("int constructor");
	}

	public Parent(int i, int j) {
		this(10);
		System.out.println("int int  constructor");
	}
}

class Child extends Parent {
	Child() {

		super(20, 20);
		System.out.println("child class c");
	}
}

public class ConstructorChain2 {

	public static void main(String[] args) {
		Child c = new Child();

	}

}