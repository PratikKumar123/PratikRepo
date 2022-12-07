package iotask1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Employee {
		
	 void method1() {

		try {
			
			File f = new File("Task1.txt");
			
			boolean check = f.createNewFile();
			
			if(check == true) {
				
				System.out.println("File is created ");
			}else {
				System.out.println("File is not created ");
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	 }
	 
	 
	 void method2() {

			try {
				
				FileWriter fw = new FileWriter("Task1.txt", true);
				fw.write(87);
				fw.write("How are you\n");
				char[] ch1 ={ 'a', 'b', 'c' };
				String s = "Pratik bhatt";
				
				fw.write(ch1);
				fw.write(s);
				
				fw.flush();
				fw.close();
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	 
	 void method3() {

			try {
				
				FileReader fr = new FileReader("Task1.txt");
				
				Scanner r = new Scanner(fr);
				
				while(r.hasNextLine()) {
					String data = r.next();
					System.out.println(data);
				}
				r.close();
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
}