package BasementProblem;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 for book slot for bike: ");
		System.out.println("Enter 2 for book slot for car: ");

		int slot = sc.nextInt();

		switch (slot) {

		case 1:
			Bike.Bike();

			break;

		case 2:

			Car.car();

			break;

		default:
			System.out.println("Please enter a right number");
		}

	}
}
