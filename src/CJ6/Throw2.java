package CJ6;
//some of the exception
import java.util.Scanner;

class Excep{
	Scanner sc =new Scanner(System.in);
	int size = sc.nextInt();
	int[] arr = new int[size];
	
	 void check() {
		 try {
			 System.out.println("enter index position ");
			 int pos = sc.nextInt();
			 arr[pos]=16;
		 }
		 catch(NumberFormatException e) {
			 System.out.println(e.toString());
			 
		 
		 }catch(IndexOutOfBoundsException e2) {
			 System.out.println(" indexout "+e2.toString()); 	
		 }
		 finally {
			 System.out.println("Finally block");
		 }
	}
}

