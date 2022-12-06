package java8;

//as previously we can not define a method inside a interface , but after 1.8 version means in java8 we can define 
//a method in interface by using two keyword default , static 
interface A{
	void msg(); // before java 1.8
	default void show () {
		System.out.println("insise A Default");
	}
	
	static void show1() {
		System.out.println("insise A static");
	}
}

class C implements A{

	public void msg() {
		System.out.println("hi pratik!");
	}
	
}


public class DefaultMethod{

	public static void main(String[] args) {
		

		A a = new C();
		a.show();
		A.show1();
		a.msg();

	}



}
