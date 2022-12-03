package multithreading;
// it provide service to thread
// which runs in the backgruond of another thread
//eg :- gc , finalizer etc
// methods : 1> setDaemon() 2> isDaemon() 

public class DemonThread extends Thread{
	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			
			System.out.println("daemon thread");
		}else {
			System.out.println("child thread");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("main thread");
		//if we do not have any task in main thread then daemon thread will not give any service so we will not get anyoutput
		
		DemonThread d = new DemonThread();
		
		
		d.setDaemon(true);
		d.start();
		
		
		
	}

}
