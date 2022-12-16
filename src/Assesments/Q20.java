package Assesments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Q20 {

	public static void main(String[] args) {

		ArrayList<String> book = new ArrayList<>();

		book.add("Book1");
		book.add("Book2");
		book.add("Book3");
		book.add("Book4");
		System.out.println("Iterator :");
		
		Iterator<String> al = book.iterator();
		
		while (al.hasNext()) {
	         String  s = al.next();
	         if (s.equals("Book4")) {
	            al.remove();
	         }
	      }
		for(String s :book) {
			System.out.println(s);
		}

		System.out.println("using list iterator : forward direction");
		ListIterator<String> it = book.listIterator();
		System.out.println("The previous index is: " + it.previousIndex());
	      System.out.println("The next index is: " + it.nextIndex());
		while (it.hasNext()) {
			it.add("gg");
			it.next();
		}
		
		for(String s:book) {
			System.out.println(s);
		}
		
		System.out.println("using list iterator : backward direction");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}

}
