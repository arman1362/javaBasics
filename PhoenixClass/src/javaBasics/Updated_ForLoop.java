package javaBasics;

public class Updated_ForLoop {

	public static void main(String[] args) {
	// for loop
		
	// for 
		
	/*
	for loop: for loop provides a concise way of writing the loop structure. Unlike a while loop, 
	a for statement consumes the initialization, condition and increment/decrement in one line 
	thereby providing a shorter, easy to debug structure of looping.
	
	Syntax: 
	(1- initialize the condition ; 2- testing the conditions; 4- increement/decrement) {
	3- statements
	
	- Initialization condition: Here, we initialize the variable in use. It marks the start of a 
		for loop. An already declared variable can be used or a variable can be declared, local 
		to loop only.
	- Testing Condition: It is used for testing the exit condition for a loop. It must return a 
		boolean value. It is also an Entry Control Loop as the condition is checked prior to the 
		execution of the loop statements.
	- Statement execution: Once the condition is evaluated to true, the statements in the loop 
		body are executed.
	- Increment/ Decrement: It is used for updating the variable for next iteration.
	- Loop termination: When the condition becomes false, the loop terminates marking the end of its life cycle.
	}
	 */
		
	// for vs while loop
	for (int a = 1; a <= 10; a++) {
		System.out.print(a + " ");
	}

	System.out.println();

	int a = 1;
	while (a <= 10) {
		System.out.print(a + " ");
		a++;
	}

	System.out.println();

	for (int k = 10; k > 0; k--) {
		System.out.print(k + " "); // because k is in two different scopes then Java will not give an error of
									// duplication
	}

	System.out.println();

	for (int i = 0; i < 10; i += 2) {
		System.out.print(i + " ");
	}

	System.out.println();
	System.out.println("----------");

	for (int i = 7; i <= 18; i++) {
		System.out.print(i + " ");
	}

	System.out.println();
	System.out.println("-----------");

	for (int i = 9; i <= 15; i++) {
		System.out.print(i + " ");
	}

	System.out.println();
	System.out.println("--------");

	for (int i = 5; i >= -5; i--) {
		System.out.print(i + " ");
	}

	System.out.println();
	System.out.println("-----------");

	for (int i = -10; i <= 0; i++) {
		System.out.print(i + " ");
	}

	System.out.println();
	System.out.println("------------");

	for (char myChar = 'a'; myChar <= 'd'; myChar++)
		System.out.print(myChar + " ");

	System.out.print("\n--------\n");

	String status = "Passed";
	double grade = 97;

	switch (status) {
	case "Passed":
		System.out.println("You Passed!");
		if (grade > 95) {
			System.out.println("You passed with a great grade!");
		}
		break;

	case "Failed":
		System.out.println("You failed this time, try again");
		break;

	case "Pending":
		for (int i = 1; i <= 10; i++) {
			System.out.println(status + " " + i);
		}
		break;
	}

	System.out.println();
	System.out.println("-----------");

	int rows = 10;

	// Printing 1 - 10 Large Top
	for (int i = 1; i <= rows; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(" ");
		}
		for (int j = i; j <= rows; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
	
	// Printing 10 - 1 Small Top
	for (int i = rows; i >= 1; i--) {
		for (int j = 1; j <= i; j++) {
			System.out.print(" ");
		}
		for (int j = i; j <= rows; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
	
	// Printing 10 - 1 Large Top
	for (int i = rows; i >= 1; i--) {
		for (int j = 10; j >= i; j--) {
			System.out.print(" ");
		}
		for (int j = i; j >= 1; j--) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
	
	// Printing 1 - 10 Small Top
	for (int i = 1; i <= rows; i++) {
		for (int j = i; j <= rows; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <= i; j++) {
			System.out.print(j + " ");

		}
		System.out.println();
	}
}

}
