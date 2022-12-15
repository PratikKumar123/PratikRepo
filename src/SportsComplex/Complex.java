package SportsComplex;

import java.util.Scanner;

public class Complex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("From below list of sports which one you want to play: \n");

			System.out.println("For playing Badminton click 1:");
			System.out.println("For playing Football  click 2:");
			System.out.println("For playing Cricket  click 3:");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				Badminton.badminton();
				break;

			case 2:
				Football.football();
				break;
			case 3:
				Cricket.cricket();
				break;

			default:
				System.out.println("Please enter a valid digit: ");
			}
		} catch (Exception e) {
			System.out.println("Enter a digit :");
		}
	}

}
