package CJ5;


abstract class Vehicle{
	abstract void start();

	
}

class Car extends Vehicle{
	void start() {
		System.out.println("Car is starting");
	}
}
  public class Abstraction extends Car{
	 void start() {
		 super.start();
			System.out.println("Scooter is starting");
		}
 
	 public static void main(String[] args) {
		
		 Abstraction c = new Abstraction();
		 c.start();
		 
		 
	 }

}
