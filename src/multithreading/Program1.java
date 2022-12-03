package multithreading;
//there are tow ways to create a thread
//1 through Thread (class)
//2 through Runnable (Interface) here we have only one method run()
public class Program1 extends Thread{

	public void run() {
		System.out.println("started"); //thread task
	}
	
	public static void main(String[] args) {
		Program1 p = new Program1();  
		p.start(); // to start a thread
		System.out.println(p.getName());
//		p.start(); // we can not invoke start method twice for one thread
		
	}

}
