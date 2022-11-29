package CJ4;

public class Operators {

	public static void main(String[] args) {
		
		//unary operator
		
		int a=15;
		int b=10;  
		int c=5;  
		System.out.println(a++);  
		System.out.println(++a); 
		System.out.println(a--);
		System.out.println(--a);
		
		//Arithmetic op
 
		System.out.println(b+c);
		System.out.println(b-c);  
		System.out.println(b*c);  
		System.out.println(b/c);  
		System.out.println(b%c);
		
		//shift op
		System.out.println(10<<2); 
		System.out.println(10>>2); 
		
//		logical && +  bitwise &
	
		System.out.println(a<b&&a<c);
		System.out.println(a<b&a<c);
		
//		logical || +  bitwise |
		System.out.println(a>b||a<c); 
		System.out.println(a>b|a<c);
		
		//ternary op
		int min=(a<b)?a:b;
		
		//assignment op
		a+=4; 
		b-=4; 
		System.out.println(a);  
		System.out.println(b);  

		System.out.println(min);

	}

}
