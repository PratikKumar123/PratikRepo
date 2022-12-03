package multithreading;

//which stops current exceuting threads & give a chance to other thread for execution
//method 1>public static native void yield();
public class YieldMethod extends Thread{

	public void run() {
		
		for(int i =1;i<=7;i++) {
			
		System.out.println(i+ Thread.currentThread().getName()); // it will tell which thread is executing now

		}
	}
	
	public static void main(String[] args) {
		YieldMethod y = new YieldMethod();
		
		y.start();
		Thread.yield(); //if you want main method to stop and provide other thread to execute
		for(int i =1;i<=7;i++) {
			
		System.out.println(i+ Thread.currentThread().getName()); // it will tell which thread is executing now
		
		}
	
	}

}
