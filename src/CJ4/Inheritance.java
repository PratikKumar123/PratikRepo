package CJ4;
//single inheritance
//multilevel inheritance
//Hierarchical inheritance
//multiple & hybrid not supported in java
class A{
	void display() {
		System.out.println("A class method");
	}
}
class B extends A{
	void display2() {
		super.display();
		System.out.println("B class method");
	}
	
}

class C extends B{
	void display3() {
		super.display2();
		System.out.println("c class method");
	}
}
class D extends A{
	void display4() {
		System.out.println("D class method");
	}
}
 public class Inheritance {
	 public static void main(String[] args) {

		 B b = new B();
		 b.display2();
		 C c= new C();
		 c.display3();
		 D d= new D();
		 d.display();
	}

}
