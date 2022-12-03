package multithreading;


// it is used to interrupt and executing thread
// this method is only work when the thread is in sleeping and waiting state(sleep(),wait())
// if a thread is not in sleping and waiting state then calling an interrupt() method will perform normal behaviour.
// when we use an interrupt it throws an exception InterruptedException 
public class InteruptMethod extends Thread{
	
	public void run() {
		try {
			Thread.interrupted();
			for(int i =1;i<5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().isInterrupted());
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	public static void main(String[] args) {
		InteruptMethod i = new InteruptMethod();
		i.start();
		i.interrupt();
		System.out.println(i.isInterrupted());
		
		
		
	}

}
