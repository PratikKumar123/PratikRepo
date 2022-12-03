package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
    int empid;
    String name;
    
    public Employee(int empid, String name) {
          this.empid = empid;
          this.name = name; 
    }
}

class Program2{
	
    public static void main(String args[]){
            try{
                   Employee empl1 =new Employee(2052,"Pratik");
                   Employee empl2 =new Employee(2092,"Kumar");
                   FileOutputStream fou=new FileOutputStream("store.txt");
                   ObjectOutputStream ou=new ObjectOutputStream(fou);
                   ou.writeObject(empl1);
                   ou.writeObject(empl2);
                   
                   
                   
                FileInputStream fis = new FileInputStream("store.txt");
           		
           		ObjectInputStream ois = new ObjectInputStream(fis);
           		
           		Employee e1 = (Employee)ois.readObject();
           		Employee e2 = (Employee)ois.readObject();
           		
           		System.out.println(e1.empid+" "+e1.name);
           		System.out.println(e2.empid+" "+e2.name);
            }
            
            catch(Exception e){
            	
                   System.out.println(e.getMessage());
                   
            }
            }
}