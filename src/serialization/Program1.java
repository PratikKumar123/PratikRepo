package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Save implements Serializable{
	
	String name ;
}

public class Program1 {

	public static void main(String[] args) throws Exception{
		
		
		Save s = new Save();
		s.name="Pratik";
		
//		to store object to file
		File f = new File("pratik.txt");
		FileOutputStream fos = new FileOutputStream(f);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		
		// to get our object from file
		
		FileInputStream fis = new FileInputStream(f);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Save s1 = (Save)ois.readObject();
		
		System.out.println(s1.name);

	}

}
