package Exception;

import java.util.Scanner;

class LowerNumber extends Exception{

	LowerNumber(String text){
		super(text);
	}
}
public class UserDefined {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a<0) {
			try {
				throw new LowerNumber("please provide number which is > 0");	
			}
			catch(LowerNumber e) {
				e.printStackTrace();
		}
	}
		else {
			System.out.println(a);
		}
	}

}
