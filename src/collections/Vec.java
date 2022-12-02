package collections;

import java.util.Scanner;
import java.util.Vector;

public class Vec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		
		System.out.println("Enter four strings");
		for(int i =0;i<=4;i++) {
			
			v.add(sc.next());
		}
		System.out.println(v);
		
		System.out.println("Enter four more strings");
		

		Vector v2 = new Vector();
		for(int i =0;i<=4;i++) {
			
			v2.add(sc.next());
		}
		
		System.out.println(v2);
		
		v.addAll(v2);
		
        
        System.out.println(v);

//		System.out.println(v.remove(2));
	}

}
