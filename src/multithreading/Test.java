package multithreading;

public class Test extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("th started");
	}

	public static void main(String[] args) { //main thread
		
		Test t = new Test();
		
		t.start();
		
		
		System.out.println(Thread.currentThread().getName());  //main 
		
		
		Thread.currentThread().setName("Pratik thread");
		
		System.out.println(Thread.currentThread().getName()); //  we can also change the main thread name
		
		System.out.println(Thread.currentThread());
		
		

	}

}
