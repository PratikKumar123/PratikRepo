package IoTask;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		try {
//			boolean checkFile;
			
			File f = new File("EmpDetail.txt");
			f.createNewFile();
			
			FileWriter fw = new FileWriter(f,true);
			
			System.out.println("Enter emp id ");
			int empid = sc.nextInt();
			
			fw.write(empid);
			sc.nextLine(); 
			System.out.println("write employee name");
			String name = sc.nextLine();
			
			fw.write(name);
			
			
			f.setReadOnly();
			

			
			fw.flush();
			fw.close();
				
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		

	}

}
