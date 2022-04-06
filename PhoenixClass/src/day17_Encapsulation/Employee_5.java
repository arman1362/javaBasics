package day17_Encapsulation;

public class Employee_5 {

	// to encapsulate our class, we make the variables private
	// so that they are no longer directly be accessible from outside the class

	String firstName;
	String lastName;
	private int idNumber;

	public Employee_5() {
		this.firstName = "";
		this.lastName = "";
		this.idNumber = 0;
	}

	@Override
	public String toString() {
		return idNumber + "( " + lastName + ", " + firstName + ")";
	}

	// getter methods are used to return the private variables of a class
	// we also call these getter methods, or accessor

	public int getidNumber(int pin) {
		if (pin == 1234) {
			return idNumber;
		} else {
			return 0;
		}
	}

	// setter methods are used to assign a new value to a private variable
	// we also call the setter methods as mutators
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
}
	