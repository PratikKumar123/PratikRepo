package Assesments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manager implements Employee1 {
	@Override
	public void create() {
		try {
			File f = new File("emp.txt");
			if (f.createNewFile()) {
				System.out.println("File created: " + f.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	@Override
	public void write() {
		try {
			FileWriter w = new FileWriter("emp.txt");
			w.write("Pratik here");
			w.write("From Hyderabad");
			w.write("Working in IT company");
			w.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
	


	@Override
	public void read() {
		try {
			File f = new File("emp.txt");
			Scanner r = new Scanner(f);
			while (r.hasNextLine()) {
				String data = r.nextLine();
				System.out.println(data);
			}
			r.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
	public void delete() {
		File f = new File("emp.txt");
		
		if(f.delete()) {
			System.out.println("File deleted successfully :");
		}else {
			System.out.println("Not deleted ");
		}

		
	}

	public static void main(String[] args) {
		
		Employee1 e = new Manager();
		e.create();
		e.write();
		e.read();
	}

}
