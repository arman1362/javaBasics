package PhoenixReview;

public class InstanceVariable {
	String name = "";
	
	public static void main(String[] args) {

		InstanceVariable obj = new InstanceVariable();
		obj.name = "Arman";
		
	}

	static void method1() {
		InstanceVariable obj = new InstanceVariable();
		obj.name = "Ajmal";
			
	}
	
}
