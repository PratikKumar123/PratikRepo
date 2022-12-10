package java8task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//java8 terminal operators
//toArray()
//collect()
//count()
//reduce()
//forEach()
//forEachOrdered()
//min()
//max()
//anyMatch()
//allMatch()
//noneMatch()
//findAny()
//findFrist()
public class Q1 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4);
		Object[] arr=l.stream().toArray(); // convert to array
		
		System.out.println(arr[0]);
		
		
		List<Integer> al = Arrays.asList(1,1,6,2,3,4);
		al.stream().collect(Collectors.toSet()).forEach(System.out::println); //convert to set // use to convert one form to another
		
		System.out.println(al.stream().count()); //count() 
		
		al.stream().forEachOrdered(System.out::println);
	
		
		al.stream().min((a,b)-> a-b);
		
		System.out.println(al.stream().anyMatch(e -> e==4));
		
		System.out.println(al.stream().noneMatch(e -> e==8));
		
		System.out.println(al.stream().findAny());
		System.out.println(al.stream().findFirst());
		
		
		
	}

}
