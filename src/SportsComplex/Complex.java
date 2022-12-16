package SportsComplex;

import java.util.Scanner;

public class Complex {

	public static void content(int c) {
		switch (c) {

		case 1:
//			Badminton.badminton();
			
			Badminton1.badminton();
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
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		char c;
//		do {

			try {

				System.out.println("From below list of sports which one you want to play: \n");

				System.out.println("For playing Badminton click 1:");
				System.out.println("For playing Football  click 2:");
				System.out.println("For playing Cricket  click 3:");

				int choice = sc.nextInt();
				
//				while (!choice.matches("\\d+")) {
//					System.out.println("Please enter a valid digit!");
//					choice = sc.nextInt();
//				}
				Complex.content(choice);

			} catch (Exception e) {
				System.out.println("Please enter a valid number :");
			}
//			System.out.println("if you want to Repeat the process click y");
//		 c = sc.next().charAt(0);
//		} while (c == 'y');
	}

}
