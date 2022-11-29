package Questions;

interface Test{
	
	int square();
}

class Arithmetic implements Test{
	
	int s;
	Arithmetic(int s){
		this.s=s;
	}
	
	public int square() {
		
		return (s*s);
	}
	
}
class ToTestInt{
	public int result(int c) {
		
		Arithmetic a=new Arithmetic(c);
		
		return a.square();
	}
	
	
}

public class Q4  {
	public static void main(String [] args) {
		ToTestInt t = new ToTestInt();
		System.out.println(t.result(2));
		
	}

}
