package EnumPrograms;

import java.util.Scanner;

enum Method{
	Guava,Papaya,Sugarcane,Pineapple ,
	
	Apple{
		public String toString() {
			return "now Apple is yours";
			
		}
	},
	Mango{
		public String toString() {
			return "now Mango is yours";
			
		}
	}
	
}
public class Methods {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		Method Apple = Method.Apple;
		
		
		Method m = Method.valueOf(str);
		System.out.println(m );
		
		
		

	}

}
