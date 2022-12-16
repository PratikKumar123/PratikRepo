package Assesments;
class Test{
	
	void display() {
		
		System.out.println("Method A");
	}
}
public class Q4 {

	public static void main(String[] args) {
		
		String name1= "Pratik";
		String name2 ="Pratik";
		
		
		System.out.println(name1.equals(name2));
		
		System.out.println("name1 hascode = "+name1.hashCode());
		System.out.println("name2 hascode = "+name2.hashCode());
		
		
		
		
		System.out.println("different values :");
		String name3= "Kumar";
		String name4 ="Bhatt";
		
		
		System.out.println(name3.equals(name4));
		
		System.out.println("name3 hascode = "+name3.hashCode());
		System.out.println("name4 hascode = "+name4.hashCode());
		
		
		Test t = new Test();
		t.display();
		System.out.println(t);// it will give package name, class name @ address //because when we r creating object the jvm calls to string method implicitly
		

	}

}
