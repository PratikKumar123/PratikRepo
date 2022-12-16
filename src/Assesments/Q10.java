package Assesments;


class Add implements Runnable{
	double a;
	double b;
	double c;
	static double  result;
	Add(double a ,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void run() {
		
		 result = a+b+c;
	}
	
}

class Avg extends Add implements Runnable {
	
	static double  result2;
	
	Avg(double a ,double b,double c){
		super(a,b,c);
	}
	public void run() {
		
		 result2 = a+b+c/3;
		
	}
	
}
class Display implements Runnable{

	public void run() {
		System.out.println(Avg.result);
		System.out.println(Avg.result2);
	}
	
}

 public class Q10{
	

	public static void main(String[] args) {
		
		Add a = new Add(2,3,4);
		Thread th = new  Thread(a);
		th.start();
		
		
		Avg av = new Avg(2,3,4);
		Thread th1 = new  Thread(av);
		th1.start();
		
		Display d = new Display();
		Thread th3 = new  Thread(d);
		th3.start();
		
		
		

	}

}

