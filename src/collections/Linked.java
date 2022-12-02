package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList l = new LinkedList();
		
		int in = sc.nextInt();
		
		for(int i =0; i<=in ;i++) {
			
			l.add(sc.nextInt());
			
			
			
		}
		System.out.println(l);
		
		System.out.println("which no you want to remove");
		
		int i = sc.nextInt(); 
		l.remove(i);
		
		
		
		System.out.println(l);
		
		l.removeFirst();
		System.out.println(l);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
