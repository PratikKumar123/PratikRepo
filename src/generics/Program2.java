package generics;


class Gen1<T extends Number>{ // extending Number,  so no can be integer, float value , double value
	T obj ;
	
	Gen1(T obj){
		this.obj = obj;
	}
	
	void diplay() {
		System.out.println(obj.intValue());
	}
}

public class Program2 {

	public static void main(String[] args) {
		
		Gen1<Integer>  i = new Gen1<Integer>(10);
		i.diplay();
		Gen1<Double>  i2 = new Gen1<Double>(10.3);
		i2.diplay();
		
//		Gen1<String>  i3 = new Gen1<String>("pratik");// error
//		i3.diplay();
		

	}

}
