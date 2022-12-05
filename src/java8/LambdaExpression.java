package java8;
interface Display{
	
	void show();
}
public class LambdaExpression {

	public static void main(String[] args) {
		
		Display d1 = ()->{
			
			System.out.println("showing");
		};
		
		d1.show();
	}

}
