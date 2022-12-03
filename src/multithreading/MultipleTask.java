package multithreading;


class A extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread()); // return reference of currrent thread object
		System.out.println("playing music");
	}
}
class B extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("playing video");
	}
}
class C extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("timer started");
	}
}



public class MultipleTask {

	public static void main(String[] args) {
		System.out.println("Pratik is a good boy :" + Thread.currentThread().getName()); // main thread
		
		A a= new A();
		a.setName("Pratik");
//		System.out.println(a.getPriority());
		System.out.println(a.isAlive());
		a.start();
		
		B b= new B();
		b.setName("Kumar");
		b.start();
		
		C c= new C();
		c.setName("Bhatt");
		c.start();
	}

}
