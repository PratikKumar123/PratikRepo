package java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Emp {
	
	String name ;
	int Salary;
	Emp(String name , int Salary){
		this.name=name;
		this.Salary=Salary;
	}
	
}
 
public class PredicateEx {

	public static void main(String[] args) {
	
		ArrayList<Emp> e = new ArrayList<Emp>();
		
		e.add(new Emp("Pratik", 1000));
		e.add(new Emp("Golu", 4000));
		e.add(new Emp("Suman", 6000));

		Predicate<Emp>  p = e1 -> e1.Salary >=1000;
		
		for(Emp em : e) {
			if(p.test(em)) {
				System.out.println(em.name + " "+ em.Salary);
			}
		}
	}

}
