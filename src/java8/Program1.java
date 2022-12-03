package java8;

interface A{
	public void display();
}

interface Msg{
	public void message();
}

interface Text{
	public void write(String s);
}


public class Program1 {

	public static void main(String[] args) {
		int i =10;
		
		A a=()->{  //lamda expression
			System.out.println(i);
		};
		a.display();
		
		Msg m =()->{
			
			System.out.println("hiiiiiiii");
			
		};
		m.message();
		
		
		Text t =(String s)->{
			System.out.println("Pratik "+ s);
			
		};
		t.write("how r u ?");
		
	}

}
