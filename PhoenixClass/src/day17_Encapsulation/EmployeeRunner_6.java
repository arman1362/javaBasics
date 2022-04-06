package day17_Encapsulation;

public class EmployeeRunner_6 {
	
	public static void main(String[] args) {
		Employee_5 x = new Employee_5();
		x.firstName = "Jack";
		x.lastName = "Daniel";
		x.setIdNumber(25689);
		System.out.println(x);
		
		System.out.println(x.getidNumber(1235));
}
}
