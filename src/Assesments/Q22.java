package Assesments;
interface CompanyTech{
	
	default double profit(double cp , double sp) {
		double result =0;
		if(cp < sp) {
			
			double profit = sp - cp;
			result= (profit / cp) * 100;
			
		}
		return result;
		
	}
	
	static String cName(String name) {
		
		return name;
		
	}
	public String getCompDetails(double profit,String name);

	
}
public class Q22 {

	public static void main(String[] args) {
		
		double cp = 798.5;
		double sp = 5975.8;
		String name1 ="Tech";
		
		CompanyTech c = (profit,name)->{
			
			return profit + " " +name;
			
		};
		System.out.println(c.getCompDetails(c.profit(cp, sp), CompanyTech.cName(name1)));
		
	}

}
