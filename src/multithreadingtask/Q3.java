package multithreadingtask;

class Thread1 extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class Thread2 extends Thread {
	public void run() {
		Thread.currentThread().setName("Pratik");
		System.out.println("Thread1  name is :"+Thread.currentThread().getName());
		

	}
	
}
class Thread3 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());

	}
	
}
public class Q3 {

	public static void main(String[] args) {
		System.out.println("main thread");
		
		
		Thread1 th1 = new Thread1();
		th1.start();
		
		Thread2 th2 = new Thread2();
		th2.setDaemon(true);
		th2.start();
		
		Thread3 th3 = new Thread3();
		th3.start();
		
	}

}
