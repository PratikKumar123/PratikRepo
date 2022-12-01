package String;

import java.util.Scanner;

public class StringBuilder1 {

	public static void main(String[] args) {
		
		//all methods are same as stringbuffer
		//the only one difference is that it is not thread safe means simultaneously 2 3 thread will no work 
		//, once completion of one thread next thread will start
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first String");
		sb.append(sc.nextLine());
		System.out.println("Enter your String");
		sb.append(sc.nextLine());
		System.out.println("Enter your String");
		sb.append(sc.nextLine());
		
		
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		

	}

}
