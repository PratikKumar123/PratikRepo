package CJ5;

import java.util.Scanner;

class Std{   
	 
	private String name; 
	
	public String getName(){  
	return name;  
	}  
	
	public void setName(String name){  
	this.name=name  ;
		}
	
	
	}
public class Encapsulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter yr name");
		String str2 = sc.next();
		Std s = new Std();
		
		
		s.setName(str2);
		
		String str= s.getName();
		System.out.println(str);
	}

}
