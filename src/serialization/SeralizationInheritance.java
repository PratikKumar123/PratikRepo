package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
	
	int i ;
	
	A(int i ){
		this.i=i;
	}
}

class B extends A{
	int j ;
	
	B(int i , int j  ){
		super(i);
		this.j=j;
	}
}


public class SeralizationInheritance {

	public static void main(String[] args) {
		
		
		try{
			B b = new B(11,12);
            FileOutputStream fou=new FileOutputStream("number.txt");
            ObjectOutputStream ou=new ObjectOutputStream(fou);
            ou.writeObject(b);
            
            
            
            FileInputStream fis = new FileInputStream("number.txt");
    		
    		ObjectInputStream ois = new ObjectInputStream(fis);
    		
    		B b1 = (B)ois.readObject();
    		
    		System.out.println(b1.i+" "+b1.j);
     }
     
     catch(Exception e){
     	
            System.out.println(e.getMessage());
            
     }
     }
		
		
	}


