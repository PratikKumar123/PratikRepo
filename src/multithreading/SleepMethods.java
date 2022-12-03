package multithreading;


//we have 2 sleep method
//1 public static native void sleep(long mili) throws InterruptedException 
//2 //1 public static  void sleep(long mili, int nanos) throws InterruptedException
public class SleepMethods extends Thread {
	
	public void run() {
		
		for(int i =1;i<=7;i++) {
			
			try {
				
				Thread.sleep(4000);
				System.out.println(i+ Thread.currentThread().getName()); // it will tell which thread is executing now
			}
			catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		SleepMethods s = new SleepMethods();
		s.start();
		
		
		SleepMethods s1 = new SleepMethods();
		s1.start();
		
	}

}
