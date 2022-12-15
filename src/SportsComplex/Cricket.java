package SportsComplex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cricket {

	public static void cricket() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> c = new ArrayList<>();
		for(int i = 1; i <= 20; i++) {
			c.add(i);
		}

		char c1;
		do {
			System.out.println("Enter your name :");
			String name = sc.next();

			System.out.println(" \t Cricket court: \n");
			System.out.println("For Cricket the available slots is  : ");

			Iterator<Integer> i = c.iterator();

			while (i.hasNext()) {

				System.out.println(" Available slots is >" + i.next());
			}
			System.out.println("Enter slot no between 1 to 20  ");

			int cricketSlot = sc.nextInt();
			if (cricketSlot > 20) {
				System.out.println("Slot not available for this no " + cricketSlot);
			} else {
				if (c.contains(cricketSlot)) {
					System.out.println();
					System.out.println("Details of User \n");
					System.out.println("This slot is booked successfully:");
					System.out.println("Name of the client is :" + name);
					System.out.println("You Have booked slot no :> " + cricketSlot);
					System.out.println(name + " you have 1 Hr to play Cricket ");
					c.remove(cricketSlot - 1);

				} else {
					System.out.println("Slot is already booked  :");
				}
			}

			System.out.println("If you want to repeat this process then click y : ");
			c1 = sc.next().charAt(0);

		} while (c1 == 'y');
	}

}
