package Q15;

import java.util.Scanner;

public class Basements2 {
	Scanner sc = new Scanner(System.in);
	int[] carsid = new int[15];
	
	public void cars() {
		System.out.println("\t BASEMENT 2 FOR CARS :");
		
		System.out.println("Total slot available :" +carsid.length);
		System.out.println();
		System.out.println("Enter how many cars slots you want");
		
		int carslength = sc.nextInt();
		
		for(int i =0 ; i<=carslength; i++) {
			
			carsid[i] = sc.nextInt();
			
		}
		for(int i =0 ;i<=carslength;i++) {
			System.out.println(" Id of car is  "+ carsid[i]+" slots booked successfully for car type " +i);
		}
		
		System.out.println("Available slot of car is: " +(carsid.length - carslength));
	}

}
