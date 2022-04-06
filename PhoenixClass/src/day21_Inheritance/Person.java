package day21_Inheritance;

public class Person {

	private String firstName;
	private String lastName;
	private int age;

	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;

	}
	
	public Person (String firstName) {
		this (); 
		this.firstName = firstName;
		}

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;

	}

	public String getFirstName() {
		return firstName;

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;

	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;

	}

	public void setAge(int Age) {
		this.age = age;
	}
	
	public String toString () {
	return "FirstName: " + firstName + ", LastName: " + lastName + ", Age: " + age;
}
}