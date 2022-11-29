package Questions;

interface  Shape1{
	void area(int r,int l);
	void perimeter(int l, int b);

	
}
 class Circle implements Shape1{
	

	@Override
	public void area(int r, int l) {
		System.out.println(3.14*(r*r));
		
	}
	@Override
	public void perimeter(int r,int b) {
		System.out.println(2* 3.14* r);
		
	}


	
}
class Reactangle implements Shape1{
	
	@Override
	public void area(int l, int b) {
		System.out.println(l*b);
		
	}
	@Override
	public void perimeter(int l, int b) {
		System.out.println(2*(l*b));
		
	}
	
}
class Square implements Shape1{
	
	@Override
	public void area(int l, int b) {
		System.out.println(l*l);
		
	}
	@Override
	public void perimeter(int l, int b) {
		System.out.println(4*l);
		
	}
	
}


public class Shape {
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.area(2, 0);
		c.perimeter(2, 0);
		
		Reactangle r  = new Reactangle();
		r.area(2, 3);
		r.perimeter(1, 3);
		
		Square s = new Square();
		s.area(2, 0);
		s.perimeter(3, 0);
	}

}
