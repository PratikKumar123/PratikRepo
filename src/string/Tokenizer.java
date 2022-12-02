package string;

import java.util.StringTokenizer;
// we have 6 method in stringtokenizer
// 1> hasMoreTokens()
//2>  nextToken()
//3>  nextToken(String delim)
//4> hasMoreElements()  // it is same as hasMoreTokens()
//5> nextElement() // same as nextToken() but return type of object
// 6> int countToken() 
public class Tokenizer {
	public static void main(String[] args) {
		
	String str = "pratik kumar bhatt";
	
	StringTokenizer st = new StringTokenizer(str); 
	
	//Method 1 	    
	while (st.hasMoreTokens()) {  
		
		  System.out.println(st.nextToken()); 
		  
		  System.out.println(st.hasMoreElements());
		 
		  
		 } 
	//Method 6
	StringTokenizer st1 = new StringTokenizer(" a b c d e f");
	System.out.println(st1.countTokens());
	
	
	
	}

}
