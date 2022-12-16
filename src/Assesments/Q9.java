package Assesments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Q9 {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<>();
		
		al.add("Pratik");
		al.add("Kumar");
		al.add("Bhatt");
		al.add("Working in");
		al.add("Techouts");
		
		Iterator<String> i = al.iterator();
		
		System.out.println("using titerator : only on forward direction\n");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("using listiterator : Forward direction\n");
		
		ListIterator<String> l = al.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("using listiterator :  backward direction\n");
		while (l.hasPrevious()) {
	         System.out.println(l.previous());
	      }
		

	}

}
