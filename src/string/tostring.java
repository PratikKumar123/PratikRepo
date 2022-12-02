package string;

class Student{
	int empId;
	String deptName;
	boolean result;
	
	
	
	Student(int empId,String deptName,boolean result){
		
		this.empId=empId;
		this.deptName=deptName;
		this.result=result;
	}
	//overriding toString method so that instead of object address it will print what i want
	//if we do not override tostring method then after calling object ref it will give class name @ address
	public String toString() {
		return empId + " " +deptName + " " + result;
	}
}


public class tostring {

	public static void main(String[] args) {
		Student s = new Student(101, " CSE", false);
		System.out.println(s);
		

	}

}
