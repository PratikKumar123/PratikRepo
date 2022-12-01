package enumprograms;

import java.util.Scanner;

enum State{
	ASSAM,BIHAR,JHARKHAND,KARNATKA;
}
	  
	  
public class Program1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
		System.out.println("Enter state name :");
		String str = sc.next().toUpperCase();
		
			State  s = State.valueOf(str);
			
			    switch(s) {
			      case ASSAM:
			    	  System.out.println("Dispur");
		                break;
			      case BIHAR:
			    	  System.out.println("Patna");
		                break;

			      case JHARKHAND:
			    	  System.out.println("Ranchi");
		                break;

			      case KARNATKA:
			    	  System.out.println("Bangalore");
		                break;

			      default:
			    	  System.out.println(" i could not find ");
			      }
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
		

	  
	  }

	}

