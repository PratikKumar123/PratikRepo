package java8task;

import java.util.ArrayList;

//What are the most commonly used Intermediate operations
//give an example for 1.distinct() 2.limit() 3.skip() 4. peek() 5.flatMap()

public class Q3 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i =1;i<=100;i++) {
			al.add(i);
		}
		al.add(10);
		al.add(10);
		al.add(10);
		
		al.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		al.stream().distinct().forEach(System.out::println);
		
		al.stream().limit(3).forEach(System.out::println);
		
		al.stream().filter(n -> n % 2 ==1).skip(3).forEach(n-> System.out.println(n));
		

		
	}

}
