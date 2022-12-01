package association;

public class Main{

	  public static void main (String[] args)
	  {
	    Teacher teacher1 = new Teacher("pratik ");
	    Student std2 = new Student("Golu ");
	    
	    System.out.println("Stuent name ="+std2.getStudentName()); 
	    
	    System.out.println("Teacher name ="+teacher1.getTeacherName()); 
	    
	  }
}
