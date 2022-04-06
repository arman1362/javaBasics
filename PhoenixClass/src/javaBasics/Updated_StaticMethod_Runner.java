package javaBasics;

public class Updated_StaticMethod_Runner {

	public static void main(String[] args) {

		Stu.change();// calling change method

	    //creating objects  
		Stu s1 = new Stu(111, "Arman");
		Stu s2 = new Stu(222, "Bill");

		s1.display();
		s2.display();
	}

}
