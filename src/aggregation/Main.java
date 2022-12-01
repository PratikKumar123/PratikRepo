package aggregation;

public class Main {
	public static void main(String args[]) {
		Address a1=new Address("Hyderabad","Telangana");   
		  
		EmpDetail e=new EmpDetail(111,"varun",a1);  
		      
		e.display();  
	}

}
