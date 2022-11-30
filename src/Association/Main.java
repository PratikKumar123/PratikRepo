package Association;

public class Main{

	  public static void main (String[] args)
	  {
	    Teacher teacher1 = new Teacher("pratik ");
	    Student std2 = new Student("Golu ");
	    System.out.println(std2.getStudentName() + " is Student of " +teacher1.getTeacherName());
	  }
}
