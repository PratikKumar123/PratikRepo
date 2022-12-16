package Assesments;


import java.io.FileReader;
import java.io.IOException;

public class Q27 {

	public static void main(String[] args) {
	
		try {
			int a = 10/0;
			
			int arr[] = new int[5];
			
			arr[5]=56;
			
			FileReader fr = new FileReader("Test.txt");
			
			
			System.out.println(fr.read());
			
					
		}
		catch(ArithmeticException a) {
			System.out.println("Exception" +a.getMessage());
			return;
		}
		catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println("Exception" +ar.getMessage());
			return;
		}
		catch(IOException io) {
			System.out.println("Exception" +io.getMessage());
			return;
		}
		catch(Exception e) {
			System.out.println("Exception" +e.getMessage());
			return;
		}
		finally {
			System.out.println("all exception are handled");
		}

	}

}
