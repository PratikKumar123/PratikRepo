package Generics;


class A{
	
	public <Temp> void display(Temp data) {
		System.out.println(data);
	}
	
}
class B extends A{
	public <Temp, E> void display(Temp data, E str) {
		System.out.println(data+" "+str);
	}
}



public class GenericMethod {

	public static void main(String[] args) {

		B b = new B();
		
		b.<Integer>display(10);
		
		
		
		b.<String>display("Pratik here");
		
		b.<Double>display(20.7);
		
		b.<Integer , String>display(101,"Pratik");
		
		
		
		
		
		
	}

}
