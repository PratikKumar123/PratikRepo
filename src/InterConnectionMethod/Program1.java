package InterConnectionMethod;


class Add extends Thread{
	 
	int s=0;
	
	@Override
	public void run() {
		
	synchronized (this) {
		
		for(int i =0; i<=10;i++) {
			
			s=s+i;
			
		}
		this.notify();
		System.out.println("completed task now i am going to notify main thread to do their task ");
	}
		
		
	}
	
	
}


public class Program1 {
	public static void main(String[] args) throws InterruptedException {
		
		Add a = new Add();
		
	
		a.start();
		synchronized(a) {
			
			System.out.println("Main thread going to stop  ");
			
			a.wait();
			
			System.out.println("Main thread notified ");
			
			System.out.println("after adding the result is :- "+ a.s);
			
		}
		
		
		
		
	}
}
