package CollectionsTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEntryPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, String > hp = new HashMap<>();
		System.out.println("Enter how many of  students details you want:");
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++) {
			int rollno = sc.nextInt();
			String name = sc.next();
			hp.put(rollno, name);
		}
		
		
		for(Map.Entry<Integer, String> me  : hp.entrySet()) {
			System.out.print("Key >"+ me.getKey() +" : ");
			System.out.println("value >"+ me.getValue());
		}
		
		
		

	}

}
