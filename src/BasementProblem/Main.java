package BasementProblem;

class A extends Thread{
	
	public void run() {
		System.out.println("gg");
	}
}


public class Main {

	public static void main(String[] args) {

		Runnable r = new A();
		r.start();
		
		A a = new A();
		a.start();

	}

}
