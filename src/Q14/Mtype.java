package Q14;

import java.util.Scanner;

public class Mtype {
		public static void mtype() {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("These are the type of mercedes car we have you can choose from below list :");
			
			System.out.println("Click 1 to see type A series of MERCEDES");
			System.out.println("Click 2 to see type B series of MERCEDES");
			System.out.println("Click 3 to see type C series of MERCEDES");
			
			int typem = sc.nextInt();
			
			switch(typem) {
			
			case 1 :
				Mercedes.Sedan();
				break;
				
			case 2 :
				Mercedes.Sedan();
				break;
				
			case 3 :
				Mercedes.Sedan();
				break;
				
			default: System.out.println("Enter right type no ");
			
			}
			

		
		
		}
}
