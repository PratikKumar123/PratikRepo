package wrapperclass;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//autoboxing ;-automatic conversion of primitive data type into its corresponding wrapper class 
		
		byte b = 10;
		
		Byte by = b; // converting a primitive type to wrapper object
		
		int i = 133;
		
		Integer in = i; 
		
		short s = 101;
		
		Short sh = s;
		
		
		long l = 199;
		
		Long lg = l;
		
		float f = 12.2F;
		
		Float fl = f;
		
		double d = 133.3D;
		
		Double db = d;
		
		char c = 'a';
		
		Character ch = c;
		
		
		boolean b2 = true;
		
		Boolean b3 = b2;
				
		System.out.print("wrapper class =" +by +" "+ in +" " +sh+ " " +lg+ " " +fl+" "+db+ " " + ch + " " + b3);
		
		//unboxing ;-automatic conversion of wrapper class into its corresponding  primitive data type
		
		byte b4 = by;  //using above reference of wrapper class  we just here need to  assign to primitive type
		
		long  lg1 = lg;
		
		
		
		
		
		

	}

}
