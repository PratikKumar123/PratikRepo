package Q14;

import java.util.HashMap;
import java.util.Scanner;

class Mercedes {
	static char c;
	private static int quantity1 = 20;
	private static int quantity2 = 23;
	private static int quantity3 = 34;

	public static void Sedan() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> sedan = new HashMap<String, Integer>();
		
		sedan.put("Benz GLA", quantity1);
		sedan.put("Benz AMG E 53", quantity2);
		sedan.put("Benz EQS", quantity3);
		do {
		System.out.println("Select car list from below which you want to buy :-");
		System.out.println("Click 1 to buy Benz GLA \t Available Quantity of this car is :  "+quantity1);
		System.out.println("Click 2 to buy Benz AMG E 53 \t Available Quantity of this car is : "+quantity2);
		System.out.println("Click 3 to buy Benz EQ \t Available Quantity of this car is :     "+quantity3);
		int Check = sc.nextInt();

		try {
			switch (Check) {
			case 1:
				System.out.println("You are going to buy  Benz GLA");
				quantity1 = quantity1 - 1;
				sedan.replace("Benz GLA", quantity1);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + sedan.get("Benz GLA"));
				break;
			case 2:
				System.out.println("You are going to buy  Benz AMG E 53");
				quantity2 = quantity2 - 1;
				sedan.replace("Benz AMG E 53", quantity2);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + sedan.get("Benz AMG E 53"));
				break;
			case 3:
				System.out.println("You are going to buy  Benz EQS");
				quantity3 = quantity3 - 1;
				sedan.replace("Benz EQS", quantity3);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + sedan.get("Benz EQS"));
				break;
				
			default:
				System.out.println("we dont have this model right now! we will let you know when we have ");
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("IF YOU WANT TO BUY MORE THEN CLICK Y or y  or else click any key");
		c= sc.next().charAt(0);
		} while(c== 'Y' || c =='y');
	}
}
