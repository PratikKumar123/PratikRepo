package collectionstask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sc {
	
	public static Map<String, String> getData() {
		Map<String, String> map = new HashMap<>();
		
		String[][] data = {{"Assam", "Dispur"}, {"Bihar", "Patna"}, {"Jharkhand", "Ranchi"}};

		for (int i = 0; i < data.length; i++) {
			map.put(data[i][0], data[i][1]);
		}
		return map;
	}
		
		

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Map<String, String> statecapital = getData();
		
			
		System.out.print("Enter a state: ");
			
		String state = input.nextLine();
		
	
		if (statecapital.get(state) != null)
		{
			System.out.println( state + " || " + statecapital.get(state));
				
		}
		System.out.println(statecapital.get(state));
	
	}

}
