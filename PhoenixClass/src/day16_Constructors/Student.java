package day16_Constructors;

public class Student {

	// data members
	String name;
	int age;
	
	//default constructor
	public Student () {
		name = "";
		age = 0 ;
	}
	
	// Parameterized constructor
	public Student (String newName, int newAge) {
		name = newName;
		age = newAge;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
