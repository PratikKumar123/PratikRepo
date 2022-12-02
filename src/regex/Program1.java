package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//there are three way to write regex

public class Program1 {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(".pp");
		
		Matcher m = p.matcher("spp");
		
		boolean b = m.matches();
		
		System.out.println(b);
		
		
		boolean b1 = Pattern.compile(".p").matcher("sp").matches();
		System.out.println(b1);
		
		
		boolean b2 = Pattern.matches(".p", "sp");
		System.out.println(b2);

	}

}
