package String;

import java.util.ArrayList;
import java.util.Scanner;

public class StringMethods2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string:");
		String str1 = sc.nextLine();
		
		System.out.println("Enter 2nd string:");
		String str2 = sc.nextLine();
		
		//compreTo
		//it will all character of string through their unicode value if str1 > str2 then it given positive no otherwise negative
		//but if both string matches then it give 0
		
		System.out.println(str1.compareTo(str2));
		
		str1.concat(str2); // it will give the str 1 object ,because we know that string is immutable
		
		str1 = str1.concat(str2);
		System.out.println(str1);
		

		boolean c = str1.equals(str2);
		System.out.println(c);
		
		boolean d = str1.equalsIgnoreCase(str2);
		System.out.println(d);
		
		
		
		
		
	}

}
