package java8;

import java.util.function.Consumer;

class imple implements Consumer<Integer>{

	@Override
	public void accept(Integer i) {
		
		System.out.println(i);
	}
	
}

public class ConsumerInterface {

	public static void main(String[] args) {

		Consumer<Integer> c = new imple();
		for(int i =1; i<=18 ;i++) {
			
			c.accept(i);
		}
	}

}
