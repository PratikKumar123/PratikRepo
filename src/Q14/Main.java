package Q14;

import java.util.Scanner;


public class Main {
	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter which car you want to buy from below list :");
		
		System.out.println(" Click 1 to check about Mercedes Series");
		
		System.out.println(" Click 2 to check about Audi Series");
		
		System.out.println(" Click 3 to check about Jaguar Series");
		
		int s = sc.nextInt();
		
		if(s==1) {
			Mercedes.Sedan();
		}
		
		else if(s==2) {
			Audi.Audi();
			
		}
		
		else if(s==3) {
			
			Jaguar.Jaguar();
		}
		else {
			throw new InvalidChoiceException();
		}
	}

}