package cj4;


class Calculator{
	public void add(int a , int b) {
		System.out.println("sum is " + (a+b));
	}
}
class Operator extends Calculator{
	
	public void substract(int a , int b) {
		System.out.println("Substraction is" + (a-b));
	}
}

class HybridInheri extends Calculator{
	
	public void multi(int a , int b) {
		System.out.println("multiple is" + (a*b));
	}
	
	public static void main(String[] args) {
		HybridInheri h = new HybridInheri();
		
		h.add(3,40);

	}
}

