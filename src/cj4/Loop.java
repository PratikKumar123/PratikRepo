package cj4;

public class Loop {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		
		
		 int a=1;  
		    while(a<=10){  
		        System.out.print(a);  
		    a++;  
		    }
		    
		    //rough
		    
		    int b=0;
		    while(b<10) {
		    	if(b==8) {
		    		b++;
		    		continue;
		    	}
		    	System.out.println(b);
		    	b++;
		    }

	}

}
