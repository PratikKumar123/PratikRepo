package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMa{
	public static void main(String []args) {
		
		HashMap<String, String> hm = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=3;i++) {
			
			String key = sc.next();
			String value= sc.next();
			
			hm.put(key, value);
			
		}
		System.out.println(hm);

		
		
		System.out.println("Key and Values are:"+hm.entrySet());
		System.out.println(" Values are:"+hm.values());
//
		System.out.println(" Key  are:"+hm.keySet());
		

		
		
		
		
	}
}