package InnerClass;
//static inner class
public class Program2 {
	static int a ;
	static class InnerClass{
		
		 void m2() {
			System.out.println("static method");
		}
	}
	class Innerc2{
		void m3() {
			System.out.println("non static");
		}
	}
	
	
	public void outer() {
		Innerc2 ic = new Innerc2();
		ic.m3();  //ACCESSING INNER CLASS CODE FROM INSTANCE AREA OF OUTER CLASS
	}

	public static void main(String[] args) {
		
		System.out.println(Program2.a=1);
		
		Program2.InnerClass in = new Program2.InnerClass();
		in.m2();
		
		

	}

}
