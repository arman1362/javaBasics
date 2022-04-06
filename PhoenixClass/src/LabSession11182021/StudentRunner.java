package LabSession11182021;

public class StudentRunner {

	public static void main(String[] args) {

		Student stu1 = new Student (475687, "Jack");
		stu1.display();
		Student stu2 = new Student (478569, "David");
		stu2.display();
		Student stu3 = new Student (475869, "Ali");
		stu3.display();
		Student stu4 = new Student (475245, "Malo");
		stu4.display();
		
		Student.change (); // change the college for stu5
		Student stu5 = new Student (472142, "Hasan");
		stu5.display ();
		Student.change ();
		Student stu6 = new Student (472363, "Arman");
		stu6.display ();
		
			
		}
	}


