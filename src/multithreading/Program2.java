package multithreading;

class Program2 implements Runnable {
	@Override
	public void run() {
		System.out.println("cjnjo");
	}
	public static void main(String[] args) {
		Program2 p = new Program2();
		
		Thread th = new  Thread(p);
		
		th.start();
	}




}
