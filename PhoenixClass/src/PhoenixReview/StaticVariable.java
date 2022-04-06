package PhoenixReview;

public class StaticVariable {

	String name = "";
	String lastName = "";
	static StaticVariable obj = new StaticVariable();

	public static void main(String[] args) {

		obj.name = "Arman";
		obj.lastName = "Hussaini";
	}

	static void method1() {

		obj.name = "Amir";
		obj.lastName = "Shahzad";
	}
}
