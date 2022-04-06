package LabSession11182021;

public class Student {

	int rollNo;
	String name;
	static String college = "IST";

	public Student(int rollNo, String name) { //parametrized constructor
		this.rollNo = rollNo;
		this.name = name;
	}

	static void change() {
		college = "BBIT";
	}
	
	void display () { // this is an alternative to toString method
		System.out.println("Student RollNo: " + rollNo + " \tStudent Name: " + name + "\tCollege Name: " + college);
	}
	
}
