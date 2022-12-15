package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		ArrayList ar = new ArrayList();
		
		for(int i =0; i< a; i++) {
			ar.add(sc.nextLine());
		}
		System.out.println(ar);
		
		
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		System.out.println(ar);
		
		Iterator i = ar.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
			
		ar.add(2,7);
		System.out.println(ar);
		
		
		ar.remove(1);
		
		ar.add("pratik");
		
		
		System.out.println(ar);
		
		ar.add(8.9);
		
		
		System.out.println(ar);
		
		
		
		
		}
	
		
	}
}

