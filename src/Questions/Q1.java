package Questions;


class call {
	 void Number1(int no) {
		 System.out.println("Method 1" +" "+no);;
	 }

}
class call2 extends call {
	
	 void Number1(int no) {
		 System.out.println("Method 2" +" "+no);
	 }

}
public class Q1 {

	public static void main(String[] args) {
			call2 c = new call2();
			c.Number1(999999999);
			call c1 = new call();
			c1.Number1(88888888);
			
	}

}
