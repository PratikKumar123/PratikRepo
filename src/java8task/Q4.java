package java8task;
//How are Collections different from Stream?
//Exaplain the following date and time with example 1.LocalDate 2.LocalTime 3.LocalDateTime APIs.

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Q4 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate ld1 = LocalDate.of(2022,Month.APRIL,9);
		System.out.println(ld1);
		
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalTime lt2 = LocalTime.of(11,18,54);
		System.out.println(lt2);
		
		LocalTime lt3 = LocalTime.now(ZoneId.of("Asia/Bahrain"));
		System.out.println(lt3);
		
//		for(String s :ZoneId.getAvailableZoneIds()) {  // to get zone ids
//			System.out.println(s);
//		}
	}

}
