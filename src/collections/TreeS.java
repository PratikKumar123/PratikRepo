package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeS {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		TreeSet t = new TreeSet();
		
		for(int i =0; i<4; i++) {
			t.add(sc.nextLine());
		}
		System.out.println(t);
		
		t.add(1);
		System.out.println(t);
		
		TreeSet t2 = new TreeSet();
		
		t2.add(4);
		System.out.println(t2);
	}

}
