package collectionstask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//WAP to Convert an Array to ArrayList in Java .Use three ways for conversion and its vice versa.
public class ArrayToArraylist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many users name you want");
		int in = sc.nextInt();
		String[] s = new String[in]; 
		 
		for (int i = 0; i < s.length; i++)   
		{  
		s[i] = sc.nextLine();  
		}
		//Method 1
		List<String> l = Arrays.asList(s);
		
		System.out.println(l);
		
		
		
		//Method 2
		List<String> l2 = new ArrayList();
		Collections.addAll(l2, s);
		
		System.out.println(l2);
		
		//Method 3
		
		List<String> l3 = new ArrayList();
		for(String s3:s) {
			l3.add(s3);
		}
		
		System.out.println(l3);
		

	     

	}

}
