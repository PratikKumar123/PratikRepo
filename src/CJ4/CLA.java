package CJ4;

import java.util.Random;
import java.util.Scanner;

public class CLA {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int no = r.nextInt();
		
		if(no>0) {
			System.out.println("No is +"+no);
		}else {
			System.out.println("no i s - "+no);
		}
		

	}

}
