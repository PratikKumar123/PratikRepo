package CollectionsTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList al = new ArrayList();
		
		for(int i =0;i<4;i++) {
			al.add(sc.next());
		}
		
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		

	}

}
