package SportsComplex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Football {

	public static void football() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> fb = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			fb.add(i);
		}
		
		char c2;
		do {
			System.out.println("Enter your name :");
			String name = sc.next();

			System.out.println(" \t Football court: \n");
			System.out.println("For Football the available slots is  : ");

			Iterator<Integer> i = fb.iterator();

			while (i.hasNext()) {

				System.out.println(" Available slots is >" + i.next());
			}
			System.out.println("Enter slot no between 1 to 5  ");

			int footballSlot = sc.nextInt();
			if (footballSlot > 5) {
				System.out.println("Slot not available for this no " + footballSlot);
			} else {
				if (fb.contains(footballSlot)) {
					System.out.println();
					System.out.println("Details of User \n");
					System.out.println("This slot is booked successfully:");
					System.out.println("Name of the client is :" + name);
					System.out.println("You Have booked slot no :> " + footballSlot);
					System.out.println(name + " you have 1 Hr to play football ");
					System.out.println("Remaining ");

				} else {
					System.out.println("Slot is already booked  :");
				}
			}

			System.out.println("If you want to repeat this process then click y : ");
			c2 = sc.next().charAt(0);

		} while (c2 == 'y');
	}

}
