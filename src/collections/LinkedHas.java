package collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedHashSet<String> s = new LinkedHashSet<String>();
		
		for(int i =0; i<4; i++) {
			s.add(sc.nextLine());
		}
		System.out.println(s);
		
		s.add("ravi");
		System.out.println(s);
	}

}
