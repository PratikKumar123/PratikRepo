package java8;

import java.util.ArrayList;

public class Java8WithArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		al.forEach((n)-> System.out.println(n));
		

	}

}
