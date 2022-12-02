package string;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
	
		String name = "Pratikr";  
        ArrayList<String> al = new ArrayList<>();  
        al.add("PRaTikr");  //not a case sensitive 
        
        for (String str4 : al) {  
            if (str4.equalsIgnoreCase(name)) {  
                System.out.println("Pratik here");  
            }  else {
            	System.out.println("who is pratik");
            }
        }
	}

}
