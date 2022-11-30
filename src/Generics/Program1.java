package Generics;


class Gen<N>{
	N obj;
	
	Gen(N obj){
		this.obj=obj;
	}
	
	public void display() {
	
		System.out.println("The type of object "+obj.getClass().getName());
	}
	
	public N getObj() {
		return obj;
	}
}


public class Program1 {

	public static void main(String[] args) {
		Gen<String> gen1 = new Gen<>("Pratik");
		gen1.display();
		System.out.println(gen1.getObj());

	}

}





