package CollectionsTask;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Medal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++) {
			int in = sc.nextInt();
			int m = sc.nextInt();
			
			hm.put(in, m);
		}
		
		
		HashMap<Integer, String> tm = new HashMap<>();
		
		Iterator<Integer> it = hm.keySet().iterator();
		
			while (it.hasNext()) {
				
			int regd =  it.next();
			int mark = hm.get(regd);
				if (mark >= 90)
				{
					tm.put(regd, "Gold");
				}
				else if(mark >=80 && mark<90) {
					tm.put(regd, "Silver");
				}
				else if(mark >=70 && mark<80)
				{
					tm.put(regd, "Bronze");
				}
			}
			//{190129=Gold, 190128=Silver, 190127=Bronze}
			
			System.out.println(tm);
		
		}

		
		

	}



