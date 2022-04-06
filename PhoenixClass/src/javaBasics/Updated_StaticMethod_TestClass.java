package javaBasics;

class Stu {

	int rollNo; // instance variable
	String name; // instance variable
	static String college = "IST"; // static variable
	// Java static property is shared to all objects.

	// static method to change the value of static variable
	static void change() {
		college = "BBDIT";
	}

	// parametrized constructor
	Stu(int r, String n) {
		rollNo = r;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(rollNo + "\t" + name + "\t" + college);
	}
	

}
