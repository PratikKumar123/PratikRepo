package CJ5;



interface Animal
{
	public void run();
	String s ="10km/h";

}

class Dog implements Animal
{
	public void run()
	{
		System.out.println("Dog is running at the speed of "+s);
	}
}
public class Interface{

	public static void main(String args[])
	{
		Animal p = new Dog();
		p.run();
	}
}

