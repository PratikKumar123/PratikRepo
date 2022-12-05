package cj4;

//we can do constructor chaining by two ways through this keyword and super keyword
//this in case of in same class we have constructor
//super keyword in case of different class

class ConstructorChain{
	
	public ConstructorChain() {
		this(20);
		System.out.println(" first constructor");
	}
	
	public ConstructorChain(int i ) {
		
		this(20,20);
		System.out.println(" second constructor");
	}
	
	public ConstructorChain(int i , int j ) {
		
		System.out.println(" third constructor");
	}

}

public class ConstructorChain1 {

	public static void main(String[] args) {
		
		ConstructorChain a = new ConstructorChain();
		

	}

}
