package PhoenixReview;

public class InitByReference {

	int id;
	String name;
	
	public static void main(String[] args) {

		InitByReference obj = new InitByReference ();
		obj.id = 1;
		obj.name = "David";
		
		InitByReference obj1 = new InitByReference ();
		obj1.id = 2;
		obj1.name = "Hadi";
		
		System.out.println(obj.id+ " " + obj.name);
		
	}
}
