package CollectionsTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class OperationsOnArraylist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList();
		
		for(int i =0; i< 3; i++) {
			al.add(sc.nextInt());
		}
		System.out.println("//QUESTION 1");
		//QUESTION 1
		Iterator i =  al.iterator();
		
		while(i.hasNext()) {
		
			System.out.println(i.next());
		}

		//Question 2
		System.out.println("//QUESTION 2");
		System.out.println("after adding at index no 1");
		al.add(1, 99);
		System.out.println(al);
		
		System.out.println("//QUESTION 3 & 6");
		//Question 3 & 6
		Collections.sort(al);
		System.out.println(al);//ascending  order
		Collections.sort(al,Collections.reverseOrder());////descending  order
		System.out.println(al);
		
		
		System.out.println("//QUESTION 4");
		//Question 4
		ListIterator <Integer> it = al.listIterator();
		it.add(999);
		System.out.println(al);
		
		
		//Question 5
		System.out.println("//QUESTION 5");
		ArrayList<String>  sl = new ArrayList<String>();

		
		sl.add("pratik");
		sl.add("suman");
		sl.add("golu");
		sl.add("rishikesh");
		sl.add("rishikesh");
		
		Collections.sort(sl);
		System.out.println(sl);
		
		//Question 7
		System.out.println("//QUESTION 7");
		
		sl.set(1,"RISHI");
		System.out.println(sl);
		
		//Question 8
		System.out.println("//QUESTION 8");
		System.out.println(sl.contains("suman"));
		
		//Question 9
		System.out.println("//QUESTION 9");
		sl.remove(0);
		System.out.println(sl);
		
		//Question 10
		System.out.println("//QUESTION 10");
		System.out.println(sl.get(1));
		for(int j =0; j<sl.size();j++) {
			for(int k=j+1;k<sl.size();k++) {
				 if(sl.get(j).equals(sl.get(k))){
		                sl.remove(k);
		            }
			}
		}
		System.out.println(sl);
		
	}

}
