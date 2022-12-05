package iofiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesOperation {

	public static void main(String[] args) throws IOException {
		File f = new File("newfolder");
		
		f.mkdir();
		
		File f1 = new File("newfolder","pratik.txt");
		f1.createNewFile();
		
		
		
	}

}
