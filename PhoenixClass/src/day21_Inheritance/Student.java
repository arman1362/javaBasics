package day21_Inheritance;

public class Student extends Person {// Inheritance does not inherit the constructors

	private double gpa;
	private String major;

	// keywords "this" and "super" refer to different scopes
	// "this" refers to the current class, "super" refers to the parent class

	public Student() {
		super();

		this.gpa = 0;
		this.major = "";
	}

	public Student(String firstName, String lastName, int age, double gpa, String major) {
		super(firstName, lastName, age);
		this.gpa =gpa;
		this.major = major;

	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(double GPA) {
		this.gpa = gpa;
	}

	public String major() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
