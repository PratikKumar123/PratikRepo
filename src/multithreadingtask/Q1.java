package multithreadingtask;

public class Q1 {

	public static void main(String[] args) {
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		th1.start();
		th2.start();

	}

}
class MyThread extends Thread {
	String txt[] = {"java", "is", "hot","aromatic", "and","invigorating"};
	
	public void run() {
		
		for(int i =0; i<txt.length; i++){
			System.out.println(Thread.currentThread().getName()+" "+txt[i]);
		}
}
}
