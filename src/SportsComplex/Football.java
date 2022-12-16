package SportsComplex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Football {

	public static void football() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> f = new ArrayList<>();
		for (int i = 1; i <=5; i++) {
			f.add(i);
		}
		HashMap<Integer, String> footbTime = new HashMap<>();
		footbTime.put(1,"07:00- 09:00");
		footbTime.put(2,"09:00- 11:00");
		footbTime.put(3,"11:00- 1:00");
		footbTime.put(4,"1:00- 3:00");
		footbTime.put(5,"3:00- 5:00");

		char c2;
		do {
			System.out.println("Enter your name :");
			String name2 = sc.next();
			
			while(!name2.matches("[a-zA-Z]+")){
			    System.out.println("Please enter a valid name!");
			    name2 = sc.next();
			}
			System.out.println(" \t Football court: \n");
			
			
			//timeslot
			
			System.out.println("Available TIME slot : \n");
			for (Map.Entry<Integer, String> entry : footbTime.entrySet()) {
			    Integer key = entry.getKey();
			    String value = entry.getValue();
			    
			    System.out.println(key + " >  "+ value);
			}
			
			//timelsot
			System.out.println("Enter which TIME slot you want  between 1 to 5 , digts you have to select :");
			int check2 = sc.nextInt();
			while(check2 > 5 || check2<=0) {
				System.out.println("Slot not available for this no try another one ");
				check2 = sc.nextInt();
			}
			if(footbTime.containsKey(check2)) {
				
				footbTime.remove(check2);
				
			}else {
				System.out.println("Selected time slot is already booked , please check other time slot");
				break;

			}
			//slot
			Iterator<Integer> i2 = f.iterator();
			while (i2.hasNext()) {

				System.out.println(" Available slots is >" + i2.next());
			}
			
			System.out.println("Enter slot no between 1 to 5  ");

			int footballSlot = sc.nextInt();
			
			while(footballSlot > 5 || footballSlot<=0) {
				System.out.println("Slot not available for this no try another one ");
				footballSlot = sc.nextInt();
			}
			
			if (f.contains(footballSlot)) {
				System.out.println();
				System.out.println("Details of User \n");
				System.out.println("This slot is booked successfully:");
				System.out.println("Name of the client is :" + name2);
				System.out.println("You Have booked slot no :> " + footballSlot);
				System.out.println(name2 + " you have 1 Hr to play Football ");
				
				f.remove(footballSlot - 1);
				

			} else {
				System.out.println("Slot is already booked  :");
			}
			
			

			System.out.println("If you want to repeat this process then click y : ");
			c2 = sc.next().charAt(0);

		} while (c2 == 'y');
	}

}
