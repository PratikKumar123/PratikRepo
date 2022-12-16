package Assesments;

import java.util.Scanner;

public class Q19 {
	public static void main(String[] args) throws InvalidUserName {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :");
		
		String name = sc.next();
		
		while (name.length()<10 || name.contains("&")) {
			System.out.println(new InvalidUserName());
			name = sc.next();
		}
		
		System.out.println(name);
	}

}
