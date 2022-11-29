package CollectionsTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SynchronizeArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> al = new ArrayList<String>();
		System.out.println("Enter string");
		for(int i =0;i<3;i++) {
			al.add(sc.next());
		}
		System.out.println(al);
		
		
		al= Collections.synchronizedList(al);

			Iterator<String> it = al.iterator();
			while(it.hasNext()) {
				
				System.out.println(it.next());
			}

	}

}
