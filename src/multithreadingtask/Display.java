package multithreadingtask;

class Add implements Runnable{
	double a ;
	double b;
	double c;
	
	Add(double a ,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void run() {
		
		double result = a+b+c;
		System.out.println(result);
	}
	
}

class Avg extends Add implements Runnable {
	

	
	Avg(double a ,double b,double c){
		super(a,b,c);
	}
	public void run() {
		
		double result2 = a+b+c/3;
		System.out.println(result2);
		
	}
	
}

 public class Display {
	

	public static void main(String[] args) {
		
		Add a = new Add(2,3,4);
		Thread th = new  Thread(a);
		th.start();
		
		
		Avg av = new Avg(2,3,4);
		Thread th1 = new  Thread(av);
		th1.start();
		
		
		

	}

}
