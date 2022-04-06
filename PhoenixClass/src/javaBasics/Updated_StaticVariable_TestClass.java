package javaBasics;

class Student {

	int rollNo; // instance variable
	String name; // instance variable
	static String college = "ITS"; // static variable
	// Java static property is shared to all objects.

	// parametrized constructor
	Student(int r, String n) {
		rollNo = r;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(rollNo + "\t" + name + "\t" + college);
	}
}
