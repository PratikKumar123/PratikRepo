package String;

import java.util.Scanner;

public class Methods3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		boolean a = str.contains("boy");
		System.out.println(a);
		
		
		boolean b = str.endsWith("y");
		System.out.println(b);
		
		

	}

}
