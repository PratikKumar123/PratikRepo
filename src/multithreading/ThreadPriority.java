package multithreading;
//jvm provides priority to each thread
//priority are represented in the form of  integer value which ranges from 1 to 10
//1 MIN_PRIORITY
//2 NORM_PRIORITY
//3 MIN_PRIORITY
//:-methods 1>getPriority 2> setPriority


public class ThreadPriority extends Thread{
	
	public void run() {
		System.out.println(" id of child is   "+Thread.currentThread().getId());
		System.out.println("  child thread priority  :"+ Thread.currentThread().getPriority());  // it also inherit the priority from parent thread i,e: 5
		System.out.println("child thread");
	}
	
	public static void main(String[] args) {
		
		System.out.println("  Main thread priority old :"+ Thread.currentThread().getPriority());  //default main thread priority is 5
		Thread.currentThread().setPriority(10);
		System.out.println("  Main thread priority new :"+ Thread.currentThread().getPriority());
		
		ThreadPriority t = new ThreadPriority();
		t.start();
		System.out.println(" id is "+Thread.currentThread().getId());
		
	}

}
