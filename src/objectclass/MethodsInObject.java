package objectclass;

import java.util.ArrayList;

public class MethodsInObject {

	public static void main(String[] args) {
		Object o = new Object();
		System.out.println(o.getClass());
		
		String s = new String();	
		System.out.println(s.getClass());
		
		ArrayList<Integer> obj3 = new ArrayList<>();
		System.out.println(obj3.getClass());
		
		
		String s1 = "100";
		String s2="10";
		int a=10;
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		
		System.out.println(Integer.hashCode(a));
		
		System.out.println(s1.equals(s2));
		
		
		

	}

}
