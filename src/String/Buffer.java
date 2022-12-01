package String;

import java.util.Scanner;

public class Buffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//methods of stringbuffer
		
		StringBuffer sb = new StringBuffer("pratik"); //stringbuffer is not immutable so we can change and add value 
		sb.append("kumar");
		
		System.out.println(sb);
		
		
		sb.insert(1, "bhatt");
		System.out.println(sb);
		
		
		sb.replace(1, 4, " ");
		System.out.println(sb);
		
		
		sb.delete(1, 4);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.capacity();
		
		
		

	}

}
