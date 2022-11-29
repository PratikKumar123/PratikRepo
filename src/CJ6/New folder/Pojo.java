package Exception;

import java.util.Scanner;

class InvalidEmpoyeeID extends Exception{

	InvalidEmpoyeeID(String msg){
		super(msg);
	}
}
public class Pojo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name="pratik";
		int id=101;
		String address ="hyderabad";
		
		int id1=sc.nextInt();
		try {
			if(id1!=id) {
				throw new InvalidEmpoyeeID("given Employee ID is not found or mismatched");
			}else {
				System.out.println("Welcome to office ");
			}
			
		}
		catch(InvalidEmpoyeeID e) {
			e.printStackTrace();
		}
	
		
		
		
		
		

	}

}
