package CollectionsTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ReadOnly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List l = new ArrayList();
		//LIST
		
		for(int i =0; i< 3; i++) {
			l.add(sc.next());
		}
		System.out.println(l);
		
		List<Integer> unmod = Collections.unmodifiableList(l);
		
		unmod.add(5);
		
		System.out.println(unmod);
		
		//SET
		Set s = new HashSet();
		
		for(int i =0; i< 3; i++) {
			s.add(sc.next());
		}
		System.out.println(s);
		
		Set<Integer> unmod1 = Collections.unmodifiableSet(s);
		
		unmod.add(5);
		
		System.out.println(unmod1);
		
		//MAP
		
		Map m = new HashMap();
		
		for(int i=0; i<=3;i++) {
			
			String key = sc.next();
			String value= sc.next();
			
			m.put(key, value);
			
		}
		System.out.println(m);
		
		Map<Integer, String> unmod3 = Collections.unmodifiableMap(m);
		
		unmod3.put(1,"raj");
		
		System.out.println(unmod3);

	}

}
