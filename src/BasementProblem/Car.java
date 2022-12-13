package BasementProblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Car {

	public static void car() {

		Scanner sc = new Scanner(System.in);
		char c;
		ArrayList<Integer> car = new ArrayList<>();

		for (int j = 1; j <= 15; j++) {
			car.add(j);
		}

		do {

			System.out.println("Enter Car Registration no to book slot :");
			int cr = sc.nextInt();

			System.out.println("Available slots for Car is :");

			Iterator<Integer> i2 = car.iterator();

			while (i2.hasNext()) {

				System.out.println(i2.next());
			}

			System.out.println("Enter slot no between 1 to 15 , to book your slot for car ");

			int carSlot = sc.nextInt();

			if (car.contains(carSlot)) {

				System.out.println("This slot is booked successfully:");

				car.remove(carSlot - 1);

			} else {
				System.out.println("Slot is already booked for this regd no :");
			}

			System.out.println("if you want to book again click y");
			c = sc.next().charAt(0);
		} while (c == 'y');
	}

}
