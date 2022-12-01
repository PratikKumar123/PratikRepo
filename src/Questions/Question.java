package Questions;

class Shape{
	
	double l;
	double b;
	double h;
	double r;
	double s;
	

}
class Circle extends Shape {
	public double area(int r) {
		
		return (3.14*(r*r));
				
	}
	public double perimeter(int r) {
		
		return ( 2*3.14*r );
				
	}
	
}
class Triangle  extends Shape {
	
	public double area(int b, int h) {
		
		return ((b*h)/2);
				
	}
	public double perimeter(int l , int b , int h) {
		
		return (l*b*h);
				
	}
	
}
class Square  extends Shape {
	public double area(int s) {
		
		return (s*s);
				
	}
	public double perimeter(int s) {
		
		return (4*s);
				
	}
	
}
public class Question{
	public static void main(String args[]) {
		
		Circle c = new Circle();
		System.out.println(c.area(3));
		System.out.println(c.perimeter(3));
		
		Triangle t = new Triangle();
		System.out.println(t.area(3,2));
		System.out.println(t.perimeter(3,3,1));
		
		
		Square s = new Square();
		System.out.println(s.area(3));
		System.out.println(s.perimeter(3));
		
		
	}
}
















