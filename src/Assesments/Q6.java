package Assesments;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");

		DateFormat dateFormat = new SimpleDateFormat("dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		System.out.println(dateFormat1.format(date));

	}

}
