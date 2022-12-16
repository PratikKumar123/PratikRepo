package Assesments;


interface A{
	
	void display();
}

public class Q3 {

	public static void main(String[] args) {
		A a = new A() {
//we can not create a object of interface but using anonymus inner class we do need to override 
//and wasting out memory we can use anonymus class to override the interface method here also.
			@Override
			public void display() {
				System.out.println("Interface , anonymus inner class");
				
			}
			 
		};
		a.display();

	}

}
