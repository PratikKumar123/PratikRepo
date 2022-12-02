package cj6;

import java.util.Scanner;

public class ThrowMain  {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int input = sc.nextInt();
		Throw t =new Throw();
		t.var(input);
	}


}
