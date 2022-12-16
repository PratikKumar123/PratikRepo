package Assesments;

public class Q2 {

	public static void main(String[] args) {
		
		Trainee t = new Trainee("Suman", "Pratik", "Golu");
		
		StudyMaterials s = new StudyMaterials("Java","c++", "corejavapdf");
		
		
		System.out.println(t.getTrainee1() +" Having book "+ s.getBookName() +" having 2nd book "+ s.getBookName2() +" having pdf of "+s.getPdfs());
		System.out.println(t.getTrainee2() +" Having book "+ s.getBookName() +" having 2nd book "+ s.getBookName2() +" having pdf of "+s.getPdfs());
		System.out.println(t.getTrainee3() +" Having book "+ s.getBookName() +" having 2nd book "+ s.getBookName2() +" having pdf of "+s.getPdfs());

	}

}
