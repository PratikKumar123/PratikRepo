package cj6;

//how to throw an exception
 public class Throw {
	static void var(int age) {
		if(age<18) {
			throw new ArithmeticException("you are not eligible to vote");
		}else {
			System.out.println("you are eligible");
			
		}
	}
}
