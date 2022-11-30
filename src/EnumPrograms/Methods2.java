package EnumPrograms;

import java.util.Scanner;

enum M2{
	
	Pen,Pencil, Eraser, Sharpner, Scale,
	
	Scissors{
		public String toString() {
			return "take this is your Scissors";
			
		}
	},
	Calculator{
		public String toString() {
			return "take this is your Calculator";
			
		}
	}
	
}
public class Methods2 {
	

	public static void main(String[] args) {
		
		M2[] m = M2.values();
		for(M2 m1 : m) {
			System.out.println( m1 +" > "+m1.ordinal());
		}
		
		
		

	}

}

