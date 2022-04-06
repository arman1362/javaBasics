package javaBasics;

public class Updated_ConditionalOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	// Conditional(Ternary) Operators: takes three operands
		// Format: (condition) ? expression1 : expression2
		// Format: (condition) ? trueValue : falseValue

	int x = 20;
	int y = 15;
	System.out.println(x > y ? "X is Bigger" : "Y is Bigger");

	System.out.println("---------------------------");

	int number4 = 9;
	int answer = number4 <= 2 ? 20 : number4 <= 4 ? 40 : number4 <= 6 ? 60 : number4 <= 8 ? 80 : 100;
	System.out.println(answer);

	System.out.println("---------------------------------");

	if (x > y) {
		System.out.println("X is Bigger");
	} else {
		System.out.println("Y is Bigger");
	}

	boolean z1 = x > y ? true : false;
	System.out.println(z1);

	int w = x > y ? 100 : 200;
	System.out.println(w);

	int z = (x > y) ? x - y : x + y;
	int grade;
	grade = 55;
	String s = "Student is ";

	System.out.println(s += grade >= 60 ? "Passing!" : "Failing!");

	System.out.println("----------------------");

	// alternative solution
	if (grade >= 60) {
		System.out.println(s + "Passing!");
	} else {
		System.out.println(s + "Failing!");
	}

	System.out.println();
	System.out.println("----------------------");

	int a = 6;
	int b = 5;
	System.out.println((a < b) ? ++a : b++);
	System.out.println(b);

	// alternative solution
	if (a < b) {
		System.out.println(++a);
	} else {
		System.out.println(b++);
	}

	System.out.println("==============");

	int grade1 = 95;
	System.out.println(grade1 > 95 && grade1 < 95 ? "A+" : "A-");
	System.out.println(grade1 >= 85 && grade1 < 90 ? "B+" : "B-");
	System.out.println(grade1 >= 75 && grade1 < 80 ? "C+" : "C-");
	System.out.println(grade1 >= 65 && grade1 < 70 ? "D" : "Fail");

	}

}
