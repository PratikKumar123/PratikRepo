package SportsComplex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Cricket {

	public static void cricket() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> c = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			c.add(i);
		}
		HashMap<Integer, String> cricTime = new HashMap<>();
		cricTime.put(1,"07:00- 07:30");
		cricTime.put(2,"07:30- 08:00");
		cricTime.put(3,"08:00- 08:30");
		cricTime.put(4,"08:30- 09:00");
		cricTime.put(5,"09:00- 09:30");
		cricTime.put(6,"09:30- 10:00");
		cricTime.put(7,"10:00- 10:30");
		cricTime.put(8,"10:30- 11:00");
		cricTime.put(9,"11:00- 11:30");
		cricTime.put(10,"11:30- 12:00");
		
		cricTime.put(11,"12:00- 12:30");
		cricTime.put(12,"12:30- 1:00");
		cricTime.put(13,"1:00- 1:30");
		cricTime.put(14,"1:30- 2:00");
		cricTime.put(15,"2:00- 2:30");
		cricTime.put(16,"2:30- 3:00");
		cricTime.put(17,"3:00- 3:30");
		cricTime.put(18,"3:30- 4:00");
		cricTime.put(19,"4:30- 5:00");
		cricTime.put(20,"5:00- 5:30");

		char c1;
		do {
			System.out.println("Enter your name :");
			String name1 = sc.next();
			
			while(!name1.matches("[a-zA-Z]+")){
			    System.out.println("Please enter a valid name!");
			    name1 = sc.next();
			}
			System.out.println(" \t Cricket court: \n");
			
			
			//timeslot
			
			System.out.println("Available TIME slot : \n");
			for (Map.Entry<Integer, String> entry : cricTime.entrySet()) {
			    Integer key = entry.getKey();
			    String value = entry.getValue();
			    
			    System.out.println(key + " >  "+ value);
			}
			
			//timelsot
			System.out.println("Enter which TIME slot you want  between 1 to 20 , digts you have to select :");
			int check1 = sc.nextInt();
			while(check1 > 20 || check1<=0) {
				System.out.println("Slot not available for this no try another one ");
				check1 = sc.nextInt();
			}
			if(cricTime.containsKey(check1)) {
				
				cricTime.remove(check1);
				
			}else {
				System.out.println("Selected time slot is already booked , please check other time slot");
				break;

			}
			//slot
			Iterator<Integer> i1 = c.iterator();
			while (i1.hasNext()) {

				System.out.println(" Available slots is >" + i1.next());
			}
			
			System.out.println("Enter slot no between 1 to 20  ");

			int cricketSlot = sc.nextInt();
			
			while(cricketSlot > 20 || cricketSlot<=0) {
				System.out.println("Slot not available for this no try another one ");
				cricketSlot = sc.nextInt();
			}
			
			if (c.contains(cricketSlot)) {
				System.out.println();
				System.out.println("Details of User \n");
				System.out.println("This slot is booked successfully:");
				System.out.println("Name of the client is :" + name1);
				System.out.println("You Have booked slot no :> " + cricketSlot);
				System.out.println(name1 + " you have 30min to play Cricket ");
				
				c.remove(cricketSlot - 1);
				

			} else {
				System.out.println("Slot is already booked  :");
			}
			
			

			System.out.println("If you want to repeat this process then click y : ");
			c1 = sc.next().charAt(0);

		} while (c1 == 'y');
	}

}
