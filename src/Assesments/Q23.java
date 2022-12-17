package Assesments;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;

public class Q23 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i =4;i<=20;i++) {
			al.add(i);
		}
	IntSummaryStatistics result = al.stream().mapToInt((x) -> x).summaryStatistics();
	System.out.println(result);

	}

}
