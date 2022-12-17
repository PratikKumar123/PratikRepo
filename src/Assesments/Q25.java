package Assesments;

import java.util.ArrayList;

public class Q25 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i =1;i<=10;i++) {
			al.add(i);
		}
		al.forEach(x -> System.out.println(x * 2));
		
		

	}

}
