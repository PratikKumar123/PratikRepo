package synchronization;

class Multiply{  
	
	synchronized void Multiply(int n){
		
		for(int i=1;i<=10;i++){ 
			
			System.out.println(Thread.currentThread().getName() +" >  "+  n +"*" + i +" = " + n*i);
			
			try{  
				
				Thread.sleep(500);  
				
			}catch(Exception e)
			{
				System.out.println(e);}  
		}  
 }  
}  
class Thread1 extends Thread{  
	Multiply p;  
	Thread1(Multiply p){  
		this.p=p;  
	}  
	@Override
	public void run(){  
		p.Multiply(5);  
		}    
}  

class Thread2 extends Thread{  
	Multiply p;  
		Thread2(Multiply p){  
			this.p=p;  
		}  
		@Override
		public void run(){  
			p.Multiply(8);  
		}  
	
}  
  
public class Program1{
	
		public static void main(String args[]){ 
			
			Multiply obj = new Multiply();//only one object 
			
			Thread1 p1=new Thread1(obj);
			
			Thread2 p2=new Thread2(obj);  
			
			p1.start();  
			p2.start();
		}  
}
