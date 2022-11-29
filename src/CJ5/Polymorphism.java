package CJ5;
//overriding
class A{
	void display() {
		System.out.println("Overriding method 1");
	}
}

class B extends A {
	void display(int a, String s) {
		System.out.println("Overriding method 2");
	}
}
class C extends B {
	void display(int a, String s) {
		System.out.println("Overriding method 3");
	}
}

 class Polymorphism {
	 //overloading
//	 void show(int a) {
//		 System.out.println("overloading 1");
//	 }
//	 void show() {
//		 System.out.println("overloading 2");
//	 }
//	 
//	 void show(String s, int b) {
//		 System.out.println("overloading");
//	 }
//	 void show(int b, String s) {
//		 System.out.println("overloading");
//	 }
	 

	public static void main(String[] args) {
		
		Polymorphism p= new Polymorphism();
//		p.show(1,"pratik");
//		p.show();
		
		//over method
		
		A a= new A();
		a.display();
		
		
		C c = new C();
		c.display(1,"pratik");
		
		
		

	}

}
