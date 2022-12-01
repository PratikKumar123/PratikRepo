package aggregation;

public class EmpDetail {

	int id;  
	String name;  
	Address address;  
	  
	public EmpDetail(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println("Employee id >" +id+ " "+ "Employee Name >"+name);  
	
	System.out.println("City of "+name+ " address is : "+ address.city+ " State is  " +address.state);
	
	}  

}
