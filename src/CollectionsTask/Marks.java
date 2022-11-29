package CollectionsTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String , Float> hm = new HashMap<>();
		
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++) {
			String name = sc.next();
			float marks = sc.nextInt();
			
			hm.put(name, marks);
		}
		
		
		HashMap<String, String> tm = new HashMap<String, String>();
		
		Iterator<String> it = hm.keySet().iterator();
		
			while (it.hasNext()) {
				
			String id = it.next();
			float mark = hm.get(id);
			
				if (mark > 60) {
					tm.put(id, "Pass");
				}
				else 
					{
					tm.put(id, "FAIL");
					}
			}
			
			System.out.println(tm);
		
		}

		
		

	}


