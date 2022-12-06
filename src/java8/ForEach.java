package java8;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List <Integer>  l = new ArrayList<>();
		
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		// we can get through this way normal for loop
		for(int i =0 ; i<l.size();i++) {
		 System.out.println(l.get(i));
		}
		
		// we can get through this way enhanced for loop
				for(int i : l) {
				 System.out.println(i);
				}
		// in java 8 we also get our values using forEach
		
				l.forEach(i ->System.out.println(i));
		
	}

}
