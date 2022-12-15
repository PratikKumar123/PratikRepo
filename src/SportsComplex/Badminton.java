package SportsComplex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Badminton {

	public static void badminton() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			al.add(i);
		}
		HashMap<Integer, String> badmTime = new HashMap<>();
		badmTime.put(1,"07:00- 08:00");
		badmTime.put(2,"08:00- 09:00");
		badmTime.put(3,"09:00- 10:00");
		badmTime.put(4,"10:00- 11:00");
		badmTime.put(5,"11:00- 12:00");
		badmTime.put(6,"1:00- 2:00");
		badmTime.put(7,"2:00- 3:00");
		badmTime.put(8,"3:00- 4:00");
		badmTime.put(9,"4:00- 5:00");
		badmTime.put(10,"5:00- 6:00");

		char c;
		do {
			System.out.println("Enter your name :");
			String name = sc.next();

			System.out.println(" \t Badminton court: \n");
			System.out.println("For badmintion the available slots is  : ");

			Iterator<Integer> i = al.iterator();

			//timeslot
			
			System.out.println("Available TIME slot : ");
			for (Map.Entry<Integer, String> entry : badmTime.entrySet()) {
			    Integer key = entry.getKey();
			    String value = entry.getValue();
			    
			    System.out.println(key + " >  "+ value);
			}
			
			//timelsot
			System.out.println("Enter which slot you want  between 1 to 10 digts you have to select :");
			int check = sc.nextInt();
			if(badmTime.containsKey(check)) {
				
				badmTime.remove(check);
				
			}
			
			
			while (i.hasNext()) {

				System.out.println(" Available slots is >" + i.next());
			}
			
			System.out.println("Enter slot no between 1 to 10  ");

			int badmintionSlot = sc.nextInt();

			if (badmintionSlot > 10) {
				System.out.println("Slot not available for this no " + badmintionSlot);
			} else {
				if (al.contains(badmintionSlot)) {
					System.out.println();
					System.out.println("Details of User \n");
					System.out.println("This slot is booked successfully:");
					System.out.println("Name of the client is :" + name);
					System.out.println("You Have booked slot no :> " + badmintionSlot);
					System.out.println(name + " you have 1 Hr to play badminton ");
					
					al.remove(badmintionSlot - 1);
					

				} else {
					System.out.println("Slot is already booked  :");
				}
			}

			System.out.println("If you want to repeat this process then click y : ");
			c = sc.next().charAt(0);

		} while (c == 'y');
	}

}
