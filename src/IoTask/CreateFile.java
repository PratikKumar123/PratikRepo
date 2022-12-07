package IoTask;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		
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

}
