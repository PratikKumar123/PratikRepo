package cj4;


public class Var {
	// Declared Instance Variable
	public String s;
	public int n;
	public boolean b;
	public static String name1 = "PRATIK"; //static variable


//	public InstanceVariable()
//	{ 
//
//		this.s = "Pratik kumar"; //defining Instance Variable
//	}
	
//	class Var
//	{
//	    // Static variable
//	    static int a; 
//	    
//	    // Instance variable
//	    int b;        
//	} 
	
	
	public static void main(String[] args)
	{
		 int loc = 10; //local var

		Var name = new Var();//object creation
		System.out.println(name.s);//output
		System.out.println(name.n);
		System.out.println(name.b);
		System.out.println(Var.name1);
		System.out.println(loc);
	}
}
