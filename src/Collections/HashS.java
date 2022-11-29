package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class HashS {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		
		
		HashSet hs = new HashSet();
		
		for(int i =0; i< 4; i++) {
			hs.add(sc.nextLine());
		}
		System.out.println(hs.isEmpty());
		
		hs.add(1);
		System.out.println(hs);
//		Stack s = new Stack();
//		for(int i =0;i<4;i++) {
//			s.push(sc.next());
//		}
//		System.out.println(s.contains("pratik"));
//		System.out.println(s.capacity());
//
//		System.out.println(s.pop());
//		
//		
//		s.add(1, 118);
//	
//		System.out.println(s);
	}

}
