package iofiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFile {

	public static void main(String[] args){
		
		File f = new File("pratik.txt");
		try {
			FileWriter fw = new FileWriter(f, true);
			
			f.createNewFile();
			fw.write(98);
			
		} catch (IOException e) {
			
			
			e.printStackTrace();
			
		}
	}

}
