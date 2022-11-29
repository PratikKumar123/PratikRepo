package CJ4;

public class Constructor {
	//using constructor
	String name;
	int id;
	static String cmp="Techouts";
	Constructor(String s, int no){
		name=s;
		id=no;
		System.out.println(id+"\t"+name+ "\t Working in  "+cmp);
		
		
	}

	public static void main(String[] args) {
		Constructor c = new Constructor("Pratik",1);
		Constructor d = new Constructor("Rahul",2);
		Constructor e = new Constructor("Golu",3);
		System.out.println(Constructor.cmp);
		

	}

}
