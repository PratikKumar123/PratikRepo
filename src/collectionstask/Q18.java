package collectionstask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		int size;
        String result;
        ArrayList al = new ArrayList();
        
        System.out.println("Please enter the size of the array: ");
        size=r.nextInt();
        
        String[] s=new String[size];
        System.out.println("Please enter the sritngs:");
        for(int i=0;i<s.length;i++){

        s[i]=r.next();

        }
        Arrays.sort(s);
        
        
        String result1 = null;
        String result2 = null;
        
        System.out.println("getting half of string:");
        for(int i =0; i<s.length/2 ;i++) {
        	
        	result1 =s[i].toUpperCase();
        	System.out.println(result1);
        }
        
        System.out.println("getting 2nd half of string:");
        for(int i =s.length/2; i<s.length ;i++) {
        	
        	result2 =s[i].toLowerCase();
        	System.out.println(result2);
        }
        
  
        
        
        
        
        
        
        


	}

}
