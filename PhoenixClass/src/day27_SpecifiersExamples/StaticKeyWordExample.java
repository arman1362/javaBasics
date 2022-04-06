package day27_SpecifiersExamples;

public class StaticKeyWordExample {

	public static void main(String[] args) { // you cant hacve a static class though you can have static method and
												// variable

		// Static call is the right way of reaching a static variable
		// You cant use the keyword this with static variables because keyword "this"
		// refers to the stack while the static variables are stored in static memory in
		// heap. the static variables and methods belong to the class.

		Student obj = new Student();
		obj.name = "Jack";

		Student obj2 = new Student();
		obj2.name = "David";

		Student.count = 10;
		System.out.println(Student.count);
		Student.count = 11;
		System.out.println(obj2.count); // value 10 belong to Student and these are objects of Student
		System.out.println(obj.count); // value 10 belong to Student and these are objects of Student

		System.out.println(Student.count); // static call

		Student obj7 = new Student(); // below are the dynamic calls as it goes like obj.name whereas static call is
										// class name.static variable like Student.count
		obj7.name = "Jack";

		Student obj8 = new Student();
		obj8.name = "Jack";

		Student obj3 = new Student();
		obj3.name = "Jack";

		Student obj4 = new Student();
		obj4.name = "Jack";

		Student obj5 = new Student();
		obj5.name = "Jack";

		Student obj6 = new Student();
		obj5.name = "Jack";

		System.out.println(Student.count); // count belongs to the Student class not the obj

		System.out.println(Integer.MAX_VALUE); // you have parameters or arguments for methods but no paranthesis for
												// variables. In this example Integer is the class name and MAX_VALUE is
												// the static variable
		// example of the static methods is the math class
		System.out.println(Math.pow(2, 5)); // we could create an appilcation to count the power but Java already has
											// the method.
	}

}
