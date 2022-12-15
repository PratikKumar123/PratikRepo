package BasementProblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bike {

	public static void Bike() {

		Scanner sc = new Scanner(System.in);
		char c;
		ArrayList<Integer> bike = new ArrayList<>();
		
		
		
		for (int i = 1; i <= 15; i++) {
			bike.add(i);
		}

		do {
			
			System.out.println("Enter bike Registration no to book slot :");
			int br = sc.nextInt();

			System.out.println("Available slots for Bike is :");

			Iterator<Integer> i = bike.iterator();

			while (i.hasNext()) {

				System.out.println("Slot : > "+i.next());
			}
			
			System.out.println("Enter slot no between 1 to 15 , to book your slot for bike ");

			int bikeSlot = sc.nextInt();
			if(bikeSlot >15) {
				System.out.println("Slot no available : ");
			}else {
				if (bike.contains(bikeSlot)) {

					System.out.println("This slot is booked successfully:");

					bike.remove(bikeSlot - 1);

				} else {
					System.out.println("Slot is already booked for this regd no :");
				}
			}
			

			System.out.println("if you want to book again click y");
			c = sc.next().charAt(0);
		} 
		while (c == 'y');
	}

}
