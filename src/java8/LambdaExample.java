package java8;

interface A {
	
	void show();
}

// as we have created a interface ans inside this e have one abstract method so we have to override in subclass

//class B implements A{
//
//	@Override
//	public void show() {
//		System.out.println("hello");
//		
//	}
//
//}

// for just overriding we have to make a class and also implementing this is quite taking space also
// but in java 8 through lambda expression and with the help of anonymus inner class we do not need to override 
//in separate class


public class LambdaExample {

	public static void main(String[] args) {

//		A a = new B();
//		a.show();
		
		A a;
		
//		a = new A() {
//
//			@Override
//			public void show() {
//				System.out.println("hello");
//			}
//			
//			
//		};
		
//		a.show();
		
		
//		insted of making 4 to 5 line of code we can use lambda expression to reduce un necsessary lines
		
		a = () ->{
			System.out.println("hello");
			
		};// we can also modify this as we have only one line code we can remove braces also
		a.show();
	}

}
