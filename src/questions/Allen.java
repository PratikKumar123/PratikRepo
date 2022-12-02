package questions;


class OldShop{
	void pair1() {
		System.out.println(" pair1");
	}
	
	void pair2() {
		System.out.println(" pair2");
	}
	void city() {
		System.out.println(" Hyderabad");
	}
	
}
class NewShop extends OldShop{
	
	void NewJeans(){
		System.out.println(" new variant jeans available");
	}
}

public class Allen {

	public static void main(String[] args) {
		
		NewShop n = new NewShop();
		n.pair1();
		n.pair2();
		n.city();
		
	}

}
