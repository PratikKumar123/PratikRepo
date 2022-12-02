package collectionstask;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SynchronizedHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		for(int i =0;i<4;i++) {
			int a = sc.nextInt();
			String s = sc.next();
			
			hm.put(a,s);
			
			 
		}
		
		System.out.println(hm);
		
		al= Collections.synchronizedMap(hm);

	}

}
