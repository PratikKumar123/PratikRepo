package string;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string :");
	    String s = sc.nextLine();
	    int len = s.length();
	    
	    char c = s.charAt(3);
	    System.out.println(c);
	    
	    
	    System.out.println(s.charAt(0)); //gives char at 0 index
	    System.out.println(s.charAt(len-1)); //gives char at last index
	    
//	    lets take a example
	    //print index no which is in odd no with their position character
	    
	    for(int i =0;i<=s.length()-1;i++) {
	    	
	    	if(i%2!=0) {
	    		System.out.println("character is  " +s.charAt(i) +" and its index position is  "+i );
	    	}
	    }
	    

	}

}
