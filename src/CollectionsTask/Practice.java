package CollectionsTask;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		
		for(int i =0; i< 3; i++) {
			al.add(sc.nextInt());
		}
		
		ListIterator it = al.listIterator();
		it.add(999);
		System.out.println(al);
	}

}
