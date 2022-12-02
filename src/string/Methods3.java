package string;

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
		
		
		String name = "Pratik";
		int i =10;
		
		String s1 = String.format(" name is %s", name);
		String s2 = String.format("no is %d ", i);
		
		String s3 = String.format("%d", 101);  
		
        String s5 = String.format("%f", 101.00);
        
        String s6 = String.format("%x", 101);   
        
        String s7 = String.format("%c", 'c'); 
        
        String s4 = String.format("%s", "Pratik");
		System.out.println(s1);
		System.out.println(s2);
		
		
		

	}

}
