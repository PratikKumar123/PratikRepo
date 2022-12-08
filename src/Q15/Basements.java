package Q15;

import java.util.Scanner;

public class Basements {
	Scanner sc = new Scanner(System.in);
	int[] bikeid = new int[15];
	
	public void bikes() {

		System.out.println("\t BASEMENT 1 FOR BIKES :");
		
		System.out.println("Total slot available :" +bikeid.length);
		System.out.println();
		System.out.println("Enter how many bikes slots you want");
		
		int bikesl = sc.nextInt();
		
		for(int i =0 ; i<=bikesl; i++) {
			
			bikeid[i] = sc.nextInt();
			
		}
		for(int i =0 ;i<=bikesl;i++) {
			System.out.println(" Id of bike is  "+ bikeid[i]+" slots booked successfully for bike type " +i);
		}
		
		System.out.println("Available slot of bikes is: " +(bikeid.length - bikesl));
	}

}
