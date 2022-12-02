package collectionstask;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
// WAP to map multiple countries with their respective capitals using map .Iterating them using
//1.foreach loop
//2.keyset iterator
//3.entryset iterator along with foreach
//4.EntrySet along with Java iterator


public class Countries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedHashMap<String, String> hm = new LinkedHashMap<>();
		System.out.println("Enter Capitals and its countries :");
//		NewDelhi India
//		Australia Canberra
//		Afghanistan kabul
//		Austria vieena
		
		//FOREACH
		for(int i=0; i<2;i++) {
			
			String key = sc.next();
			String value= sc.next();
			
			hm.put(key, value);
		}
		
		System.out.println(hm);
		
		hm.forEach((Capitals, countries) -> {
            System.out.println("Capital: "+Capitals+ "\t" + "Country :"+countries);
        });
		
		//KEYSET ITERATOR
		
		System.out.println("//KEYSET ITERATOR");
		Iterator<String> itr = hm.keySet().iterator();
		
        while (itr.hasNext())
        {
            String k = itr.next();
            
            String v = hm.get(k);
            
            System.out.println(k + "=" + v);
        }
        
        //entryset iterator along with foreach
        
        for (Entry<String, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        
        //EntrySet along with Java iterator
        Iterator<Entry<String, String>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
	}

}
