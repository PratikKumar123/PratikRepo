package SportsComplex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Badminton1 {

	public static void badminton() {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, String> badmTime = new HashMap<>();
		badmTime.put(1, "07:00- 08:00");
		badmTime.put(2, "08:00- 09:00");
		badmTime.put(3, "09:00- 10:00");
		badmTime.put(4, "10:00- 11:00");
		badmTime.put(5, "11:00- 12:00");
		badmTime.put(6, "1:00- 2:00");
		badmTime.put(7, "2:00- 3:00");
		badmTime.put(8, "3:00- 4:00");
		badmTime.put(9, "4:00- 5:00");
		badmTime.put(10, "5:00- 6:00");

		char c;
		do {
			System.out.println("Enter your name :");
			String name = sc.next();

			while (!name.matches("[a-zA-Z]+")) {
				System.out.println("Please enter a valid name!");
				name = sc.next();
			}
			System.out.println(" \t Badminton court: \n");

			System.out.println("Available slot : \n");

			for (Map.Entry<Integer, String> entry : badmTime.entrySet()) {
				Integer key = entry.getKey();
				String value = entry.getValue();

				System.out.println(key + " >  " + value);
			}

			System.out.println("Enter which  slot you want  between 1 to 10 , digts you have to select :");
			int check = sc.nextInt();
			while (check > 10 || check <= 0) {
				System.out.println("Slot not available for this no try another one ");
				check = sc.nextInt();
			}
			
			for (Map.Entry<Integer, String> entry : badmTime.entrySet()) {
				if(entry.getKey() == check) {
					System.out.println("This slot is booked successfully:");
					System.out.println("Selected time slot is > :\n " + entry.getValue());
				}
			}
			if (badmTime.containsKey(check) ){
				
				System.out.println("Name of the client is :" + name);
				System.out.println("You Have booked slot no :> " + check);
			
				System.out.println(name + " you have 1 Hr to play badminton ");
				badmTime.remove(check);

			} else {
				System.out.println("Selected time slot is already booked , please check other time slot");

			}
			
			System.out.println("If you want to repeat this process then click y : ");
			c = sc.next().charAt(0);

		} while (c == 'y');

	}

}
