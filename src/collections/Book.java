package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Book {

	public static void main(String[] args) {

		ArrayList<String> book = new ArrayList<>();

		book.add("Book1");
		book.add("Book2");
		book.add("Book3");
		book.add("Book4");

		ListIterator<String> it = book.listIterator();

		while (it.hasNext()) {
			
//			String s = it.next();
//			
//			if (s.equals("Book3")) {
//				
//				it.add("gkljgkl");
//			}
			it.add("gg");
			System.out.println(it.next());
		}
		
		for(String s:book) {
			System.out.println(s);
		}
	}

}
