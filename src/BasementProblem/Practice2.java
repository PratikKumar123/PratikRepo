package BasementProblem;


class Parent{
	
	void display() {
		System.out.println("ffff");
	}
}

interface I1{
	
	void show();
}

interface I2{
	
	void show1();
}
interface I3{
	
	void show2();
}
public class Practice2  extends Parent implements I1,I2 ,I3 {

	@Override
	public void show1() {
		System.out.println("i1");
	}

	@Override
	public void show() {
		System.out.println("i2");
	}

	@Override
	public void show2() {
		System.out.println("i3");
	}
	
	
	
	public static void main(String[] args) {
		Practice2 p = new Practice2();
		p.show();
		p.show1();
		
		p.show2();
		p.display();
		
	}

}
