package Regexx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Program2 {

	public static void main(String[] args) {
		System.out.println("//regex character classes");
		
		System.out.println(Pattern.matches("[abc]", "ab")); //takes one character only between a to z
		System.out.println(Pattern.matches("[^abc]", "h")); // it will take a char except a b c
		System.out.println(Pattern.matches("[a-zA-Z]", "A")); // it will take all alphabet lowercase as well as uppercase char 
		System.out.println(Pattern.matches("[a-d[m-p]]", "b")); //it will take alphabet char between a to d and m to p 
		System.out.println(Pattern.matches("[a-z&&[def]]", "c")); // it will take d e f only
		System.out.println(Pattern.matches("[a-z&&[^de]]", "a")); // it will take all character between a to z except d e
		System.out.println(Pattern.matches("[a-z&&[^d-h]]", "i")); // it will take  character between a to z except between d to h
		
		System.out.println("//regex Quantifiers ");
		
		System.out.println(Pattern.matches("[abc]?", "c"));
		
		System.out.println(Pattern.matches("[abc]+", "cccca"));
		
		System.out.println(Pattern.matches("[abc]*", "cccca"));
		

		
		System.out.println("//Regex Metacharacters");
		
		System.out.println(Pattern.matches("\\d", "1")); // it will take only digits
		System.out.println(Pattern.matches("\\d", "1212")); //false as we have digit but more than one but we can use of * this to use more digits
		
		System.out.println(Pattern.matches("\\D", "a")); // it will take non digits 
		
		System.out.println(Pattern.matches("\\s+", " ")); //find space 
		
		
		
		
		
	}

}
