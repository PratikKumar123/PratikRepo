package Q15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Book slot for Bike then click 1 :\n");
		
		System.out.println("Book slot for Cars then click 2 :");
		
		int slot = sc.nextInt();
		
		switch(slot) {
		
		case 1: Basements b= new Basements();
				b.bikes();
				
				break;
		case 2: Basements2 b2= new Basements2();
				b2.cars();
		
				break;
		default : System.out.println("Wrong no Enter no either 1 or 2 only");
		
		}
		
		

	}

}
