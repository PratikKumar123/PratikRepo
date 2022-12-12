package Q14;

import java.util.Scanner;


public class CarCompany {
	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which of the car company cars you want  :");
		
		System.out.println(" Click 1 to check about Mercedes ");
		
		System.out.println(" Click 2 to check about Audi ");
		
		System.out.println(" Click 3 to check about Jaguar ");
		
		int s = sc.nextInt();
		
		if(s==1) {
			Mtype.mtype();
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