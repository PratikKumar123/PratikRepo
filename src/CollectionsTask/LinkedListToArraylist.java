package CollectionsTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListToArraylist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList l = new LinkedList();
		
		for(int i =0;i<3;i++) {
			l.add(sc.nextLine());
		}
		
		System.out.println(l);
		
		
		ArrayList al1 = new ArrayList(l);
		System.out.println(al1);
	}

}
