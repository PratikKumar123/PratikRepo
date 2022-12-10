package Q14;

import java.util.HashMap;
import java.util.Scanner;

class Jaguar {
	static char c;
	private static int quantity1 = 2;
	private static int quantity2 = 3;
	private static int quantity3 = 4;

	public static void Jaguar() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> jaguar = new HashMap<String, Integer>();
		
		jaguar.put("Jaguar F-TYPE", quantity1);
		jaguar.put("Jaguar XF", quantity2);
		jaguar.put("Jaguar F-Pace", quantity3);
		do {
		System.out.println("Select car list from below which you want to buy :-");
		System.out.println("Click 1 to buy Jaguar F-TYPE \t Available Quantity of this car is :  "+quantity1);
		System.out.println("Click 2 to buy Jaguar XF \t Available Quantity of this car is : "+quantity2);
		System.out.println("Click 3 to buy Jaguar F-Pace \t Available Quantity of this car is :     "+quantity3);
		int Check = sc.nextInt();

		try {
			switch (Check) {
			case 1:
				System.out.println("You are going to buy  Jaguar F-TYPE");
				quantity1 = quantity1 - 1;
				jaguar.replace("Jaguar F-TYPE", quantity1);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + jaguar.get("Jaguar F-TYPE"));
				break;
			case 2:
				System.out.println("You are going to buy Jaguar XF");
				quantity2 = quantity2 - 1;
				jaguar.replace("Jaguar XF", quantity2);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + jaguar.get("Jaguar XF"));
				break;
			case 3:
				System.out.println("You are going to buy  Jaguar F-Pace");
				quantity3 = quantity3 - 1;
				jaguar.replace("Jaguar F-Pace", quantity3);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + jaguar.get("Jaguar F-Pace"));
				break;
				
			default:
				System.out.println("we dont have this model right now! we will let you know when we have ");
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("IF YOU WANT TO BUY MORE THEN CLICK Y  or else click any key");
		c= sc.next().charAt(0);
		} while(c== 'Y');
	}
}

