package javaBasics;

public class Updated_StaticVariable_Runner {

	public static void main(String[] args) {
		Student s1 = new Student(111, "Arman");
		Student s2 = new Student(222, "Bill");

		// we can change the college of all objects by the single line of code
		// Student.college="BBDIT";
		s1.display();
		s2.display();
	}

}
