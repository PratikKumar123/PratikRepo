package Exception;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		try {
		
			 
			 int a=10/0;
//			 int[] b = new int[10];
//			 System.out.println(b[11]);
		 }
		 catch(ArithmeticException e) {
			 System.out.println(e);
			 
		 }
		 
		 catch(NumberFormatException e) {
			 System.out.println(e);
			 
		 
		 }catch(IndexOutOfBoundsException e) {
			 System.out.println(e); 	
		 }
		 finally {
			 System.out.println("Finally block always execute");
		 }
		
		try {
			int[] b = new int[10];
			 System.out.println(b[11]);
			
		}catch(Exception e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			
		}
	}

}
