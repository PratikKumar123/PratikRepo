package Q14;

public class InvalidChoiceException extends RuntimeException {

	@Override
	public String toString() {
		
		return "Please choose a correct number between 1 to 3 :";
	}
	
}
