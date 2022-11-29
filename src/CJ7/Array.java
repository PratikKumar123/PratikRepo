package CJ7;
import java.util.ArrayList;
import java.util.HashSet;
public class Array {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(102);
		a.add(101);
		
		System.out.println(a);
		
		
		ArrayList<String> s = new ArrayList<>();
		s.add("pratik");
		s.add("suman");
		
		HashSet<Integer> h = new HashSet<>();
		h.add(98);
		
		h.addAll(a);
		
		System.out.println(h);
		
		

	}

}
