package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Clone {
	public static void main(String []args) {
//		ArrayList al = new ArrayList();
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i =0; i< 4; i++) {
//			al.add(sc.nextLine());
//		}
//		System.out.println(al);
//		
//		ArrayList cloneno = (ArrayList)al.clone();
//		System.out.println("clone"+ cloneno);
		
		
		
		LinkedList l = new LinkedList();
		Scanner sc1 = new Scanner(System.in);
		
		for(int i =0; i< 4; i++) {
			l.add(sc1.nextLine());
		}
		System.out.println(l);
		
		LinkedList cloneno2 = (LinkedList)l.clone();
		System.out.println("clone2"+ cloneno2);
	}
}
