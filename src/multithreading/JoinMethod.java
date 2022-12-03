package multithreading;
//join :- if a thread want to wait for another thread to complete its task then we should use join method

//methods ; 1> public final void join() throws InterruptedException
///2> public final void synchronized join(long ms) throws InterruptedException
//3> ///2> public final void synchronized join(long ms , int ns) throws InterruptedException

public class JoinMethod extends Thread{
	
	public void run() {
		
		for(int i =1;i<=7;i++) {
		
		try {
			
			Thread.sleep(1000);
			System.out.println( Thread.currentThread().getName()); // it will tell which thread is executing now
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	}
	
	public static void main(String[] args) {
			
		JoinMethod j = new JoinMethod();
		j.start();
		
		
		
		for(int i =1;i<=7;i++) {
			
			try {
				j.join(); // it will stop current thread and wait for another thread to complete then main will execute
				Thread.sleep(1000);
				System.out.println( Thread.currentThread().getName()); // it will tell which thread is executing now
			}
			catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
		}
	}

}
