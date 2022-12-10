package Q14;

import java.util.HashMap;
import java.util.Scanner;

class Audi {
	static char c;
	private static int quantity1 = 5;
	private static int quantity2 = 8;
	private static int quantity3 = 40;

	public static void Audi() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> audi = new HashMap<String, Integer>();
		
		audi.put("Audi A4", quantity1);
		audi.put("Audi Q7", quantity2);
		audi.put("Audi Q3", quantity3);
		do {
		System.out.println("Select car list from below which you want to buy :-");
		System.out.println("Click 1 to buy Audi A4 \t Available Quantity of this car is :  "+quantity1);
		System.out.println("Click 2 to buy Audi Q7 \t Available Quantity of this car is : "+quantity2);
		System.out.println("Click 3 to buy Audi Q3 \t Available Quantity of this car is :     "+quantity3);
		
		int Check = sc.nextInt();

		try {
			switch (Check) {
			case 1:
				System.out.println("You are going to buy  Audi A4");
				quantity1 = quantity1 - 1;
				audi.replace("Audi A4", quantity1);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + audi.get("Audi A4"));
				break;
			case 2:
				System.out.println("You are going to buy Audi Q7");
				quantity2 = quantity2 - 1;
				audi.replace("Audi Q7", quantity2);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + audi.get("Audi Q7"));
				break;
			case 3:
				System.out.println("You are going to buy  Audi Q3");
				quantity3 = quantity3 - 1;
				audi.replace("Audi Q3", quantity3);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + audi.get("Audi Q3"));
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

