package InnerClass;
//nonstatic inner classs
public class Program1 {
	
	class InnerClass{
		
		void m1() {
			System.out.println("Inside inner class");
		}
	}

	public static void main(String[] args) {
		
		
		Program1 p = new Program1();
		
		Program1.InnerClass in = p.new InnerClass(); //ACCESSING INNER CLASS CODE FROM STATIC AREA OF OUTER CLASS
		in.m1();
		
	}

}
