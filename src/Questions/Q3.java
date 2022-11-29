package Questions;

class box{
	int length;
	int breadth;
	int height;
	
	box(int length, int breadth, int height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		
		}
	void area() {
		int result = length*breadth;
		System.out.println( "area is " +result);
		
	}
}
class Box3d extends box{
	

	Box3d(int length, int breadth, int height) {
		super(length, breadth, height);
	}

	void volume() {
		System.out.println(length*breadth*height);
		
	}
}



public class Q3 {



	public static void main(String[] args) {
		
		Box3d b = new Box3d(2,2,2);
		b.area();
		b.volume();
		
	}

}
